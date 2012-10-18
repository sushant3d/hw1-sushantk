package edu.cmu.lti.analysisEngine;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.resource.ResourceInitializationException;

import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.Chunker;
import com.aliasi.chunk.Chunking;
import com.aliasi.util.AbstractExternalizable;

import edu.cmu.lti.type.NamedEntity;
import edu.cmu.lti.type.Sentence;

/**
 * @author Sushant
 * 
 * A Named Entity Recognizer for identifying Gene mentions
 * using LingPipe NLP toolkit and the HMM trained model
 * provided with the source release with LingPipe
 */
public class GeneNamedEntityRecognizer extends JCasAnnotator_ImplBase {

  private Chunker chunker;

  public static final String MODEL_FILE = "modelFile";

  private String modelFilePath = "";

  /**
   * @see org.apache.uima.analysis_component.AnalysisComponent_ImplBase#initialize(org.apache.uima.UimaContext)
   */
  @Override
  public void initialize(UimaContext context) throws ResourceInitializationException {
    super.initialize(context);
    modelFilePath = (String) context.getConfigParameterValue(MODEL_FILE);

    File modelFile = new File(this.modelFilePath);
    // System.out.println("Reading chunker from file=" + modelFile);
    try {
      this.chunker = (Chunker) AbstractExternalizable.readObject(modelFile);
    } catch (Exception e) {
      System.out.println("Caught exception while loading model file: " + e);
    }
  }

  /**
   * @see org.apache.uima.analysis_component.JCasAnnotator_ImplBase#process(org.apache.uima.jcas.JCas)
   */
  @Override
  public void process(JCas jCas) throws AnalysisEngineProcessException {

    String source = jCas.getDocumentText();
    String sourceId = source.substring(0, source.indexOf(" "));
    String sent = source.substring(source.indexOf(" ") + 1);

    // System.out.println("source: " + sourceId + " - " + sent);
    Chunking chunking = chunker.chunk(sent);
    // System.out.println("Chunking=" + chunking);
    List<NamedEntity> neList = new ArrayList<NamedEntity>();
    for (Chunk chunk : chunking.chunkSet()) {
      // System.out.println(sent.substring(chunk.start(), chunk.end()));
      // create NamedEntity
      NamedEntity ne = new NamedEntity(jCas);
      String mention = sent.substring(chunk.start(), chunk.end());
      ne.setNamedEntityMention(mention);
      ne.setSourceID(sourceId);
      ne.setNamedEntityType(chunk.type());
      ne.setBegin(chunk.start() - getNumberOfWhiteSpaces(sent, chunk.start()));
      ne.setEnd(chunk.end() - getNumberOfWhiteSpaces(sent, chunk.end()) - 1);
      // add to list
      neList.add(ne);
      ne.addToIndexes(jCas);
    }
    Sentence sentence = new Sentence(jCas);
    sentence.setBegin(0);
    sentence.setEnd(sent.length());
    sentence.setSourceText(sent);
    sentence.setSourceID(sourceId);
    sentence.setNamedEntityList(new FSArray(jCas, neList.size()));
    int i = 0;
    for (NamedEntity ne : neList) {
      sentence.setNamedEntityList(i++, ne);
    }
    sentence.addToIndexes(jCas);
  }

  /**
   * @param text
   * @param index
   * @return number of whitespaces present in the text up to the given index
   */
  public int getNumberOfWhiteSpaces(String text, int index) {
    int numOfSpaces = 0;
    if (index > text.length()) {
      System.out.println("Incorrect index given. Changing it to length of text given!");
      index = text.length();
    }
    for (int i = 0; i < index; i++) {
      if (text.charAt(i) == ' ') {
        numOfSpaces++;
      }
    }
    return numOfSpaces;
  }

}
