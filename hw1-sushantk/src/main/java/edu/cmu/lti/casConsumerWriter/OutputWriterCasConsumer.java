package edu.cmu.lti.casConsumerWriter;

import java.io.FileWriter;
import java.io.Writer;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.collection.CasConsumer_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.resource.ResourceProcessException;

import edu.cmu.lti.type.NamedEntity;
import edu.cmu.lti.type.Sentence;

/**
 * A simple CAS consumer that writes the CAS to desired format in outputFile.
 * <p>
 * This CAS Consumer takes one parameter:
 * <ul>
 * <li><code>OutputFile</code> - path to file into which output will be written</li>
 * </ul>
 */
public class OutputWriterCasConsumer extends CasConsumer_ImplBase {
  /**
   * Name of configuration parameter that must be set to the path of the output file where the CAS
   * output will be written.
   */
  public static final String PARAM_OUTPUTFILE = "OutputFile";

  private String outputFile;

  private Writer outputWriter;

  /**
   * @see org.apache.uima.collection.CasConsumer_ImplBase#initialize()
   */
  public void initialize() throws ResourceInitializationException {
    outputFile = (String) getConfigParameterValue(PARAM_OUTPUTFILE);
    try {
      // create a new file for the first time
      outputWriter = new FileWriter(outputFile, false);
      outputWriter.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  /**
   * Processes the CAS which was populated by the AnalysisEngine. <br>
   * In this case, the CAS is converted to desired format and written to the output file.
   * 
   * @param aCAS
   *          a CAS which has been populated by the AEs
   * 
   * @throws ResourceProcessException
   *           if there is an error in processing the Resource
   * 
   * @see org.apache.uima.collection.base_cpm.CasObjectProcessor#processCas(org.apache.uima.cas.CAS)
   */
  public void processCas(CAS aCAS) throws ResourceProcessException {
    JCas jcas;
    try {
      jcas = aCAS.getJCas();
    } catch (CASException e) {
      throw new ResourceProcessException(e);
    }
    FSIterator sentenceIterator = jcas.getAnnotationIndex(Sentence.type).iterator();
    while (sentenceIterator.hasNext()) {
      // retrieve the sentence from the CAS
      Sentence sentence = (Sentence) sentenceIterator.next();
      String sourceId = sentence.getSourceID();
      // fetch the named entities
      FSArray neArray = sentence.getNamedEntityList();
      for (int i = 0; i < neArray.size(); i++) {
        NamedEntity ne = (NamedEntity) neArray.get(i);
        String mention = ne.getNamedEntityMention();
        int begin = ne.getBegin();
        int end = ne.getEnd();
        try {
          outputWriter = new FileWriter(outputFile, true);
          outputWriter.write(sourceId + "|" + Integer.toString(begin) + " " + Integer.toString(end)
                  + "|" + mention + "\n");
          outputWriter.close();
          // System.out.println(sourceId + "|" + Integer.toString(begin) + " " +
          // Integer.toString(end)
          // + "|" + mention + "|" + ne.getNamedEntityType());
        } catch (Exception e) {
          System.out.println(e);
        }
      }
    }
  }

}
