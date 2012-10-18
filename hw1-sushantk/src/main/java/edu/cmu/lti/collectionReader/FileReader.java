package edu.cmu.lti.collectionReader;

import java.io.File;
import java.io.IOException;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceConfigurationException;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.FileUtils;
import org.apache.uima.util.Progress;
import org.apache.uima.util.ProgressImpl;

/**
 * A simple collection reader that reads a file. It can be configured with the following parameter:
 * <ul>
 * <li><code>InputFile</code> - Relative Path to the input file</li>
 * </ul>
 * 
 */
public class FileReader extends CollectionReader_ImplBase {
  /**
   * Name of configuration parameter that must be set to the path of input file.
   */
  public static final String PARAM_INPUTFILE = "InputFile";

  private String line;

  private int linesRead;

  private int numOfLines;

  private String[] lines;

  /**
   * @see org.apache.uima.collection.CollectionReader_ImplBase#initialize()
   */
  public void initialize() {
    String fileName = ((String) getConfigParameterValue(PARAM_INPUTFILE)).trim();
    try {
      // read the input file
      String text = FileUtils.file2String(new File(fileName));
      if (text != null) {
        lines = text.split("\n");
        numOfLines = lines.length;
        // System.out.println("Number of lines to be read:" + numOfLines);
        linesRead = 0;
      } else {
        throw new ResourceInitializationException(
                ResourceConfigurationException.DIRECTORY_NOT_FOUND, new Object[] { PARAM_INPUTFILE,
                    this.getMetaData().getName() });
      }

    } catch (Exception e) {
      System.err.println(e);
    }

  }

  /**
   * @see org.apache.uima.collection.CollectionReader#hasNext()
   */
  public boolean hasNext() {
    return linesRead < numOfLines;
  }

  /**
   * @see org.apache.uima.collection.CollectionReader#getNext(org.apache.uima.cas.CAS)
   */
  public void getNext(CAS aCAS) throws IOException, CollectionException {
    JCas jcas;
    try {
      jcas = aCAS.getJCas();
    } catch (CASException e) {
      throw new CollectionException(e);
    }

    line = lines[linesRead];
    //System.out.println("reading line number:"+linesRead);
    linesRead++;
    // put text in CAS
    jcas.setDocumentText(line);

  }

  /**
   * @see org.apache.uima.collection.base_cpm.BaseCollectionReader#close()
   */
  public void close() throws IOException {
  }

  /**
   * @see org.apache.uima.collection.base_cpm.BaseCollectionReader#getProgress()
   */
  public Progress[] getProgress() {
    return new Progress[] { new ProgressImpl(linesRead, numOfLines, Progress.ENTITIES) };
  }

}
