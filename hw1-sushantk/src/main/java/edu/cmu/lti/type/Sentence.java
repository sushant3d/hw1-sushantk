

/* First created by JCasGen Tue Oct 16 03:38:34 EDT 2012 */
package edu.cmu.lti.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** Stores the sentence information from document collection
 * Updated by JCasGen Tue Oct 16 03:39:19 EDT 2012
 * XML source: C:/Personal/workspace/git/hw1-sushantk/hw1-sushantk/src/main/resources/descriptors/GeneNamedEntityRecognizerDescriptor.xml
 * @generated */
public class Sentence extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(Sentence.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Sentence() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Sentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Sentence(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
 
    
  //*--------------*
  //* Feature: SourceID

  /** getter for SourceID - gets Stores the document collection ID
   * @generated */
  public String getSourceID() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_SourceID == null)
      jcasType.jcas.throwFeatMissing("SourceID", "edu.cmu.lti.type.Sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_SourceID);}
    
  /** setter for SourceID - sets Stores the document collection ID 
   * @generated */
  public void setSourceID(String v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_SourceID == null)
      jcasType.jcas.throwFeatMissing("SourceID", "edu.cmu.lti.type.Sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_SourceID, v);}    
   
    
  //*--------------*
  //* Feature: SourceText

  /** getter for SourceText - gets Stores the document collection text
   * @generated */
  public String getSourceText() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_SourceText == null)
      jcasType.jcas.throwFeatMissing("SourceText", "edu.cmu.lti.type.Sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_SourceText);}
    
  /** setter for SourceText - sets Stores the document collection text 
   * @generated */
  public void setSourceText(String v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_SourceText == null)
      jcasType.jcas.throwFeatMissing("SourceText", "edu.cmu.lti.type.Sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_SourceText, v);}    
   
    
  //*--------------*
  //* Feature: NamedEntityList

  /** getter for NamedEntityList - gets Stores the list of Named Entities extracted in given source
   * @generated */
  public FSArray getNamedEntityList() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_NamedEntityList == null)
      jcasType.jcas.throwFeatMissing("NamedEntityList", "edu.cmu.lti.type.Sentence");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_NamedEntityList)));}
    
  /** setter for NamedEntityList - sets Stores the list of Named Entities extracted in given source 
   * @generated */
  public void setNamedEntityList(FSArray v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_NamedEntityList == null)
      jcasType.jcas.throwFeatMissing("NamedEntityList", "edu.cmu.lti.type.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_NamedEntityList, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for NamedEntityList - gets an indexed value - Stores the list of Named Entities extracted in given source
   * @generated */
  public NamedEntity getNamedEntityList(int i) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_NamedEntityList == null)
      jcasType.jcas.throwFeatMissing("NamedEntityList", "edu.cmu.lti.type.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_NamedEntityList), i);
    return (NamedEntity)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_NamedEntityList), i)));}

  /** indexed setter for NamedEntityList - sets an indexed value - Stores the list of Named Entities extracted in given source
   * @generated */
  public void setNamedEntityList(int i, NamedEntity v) { 
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_NamedEntityList == null)
      jcasType.jcas.throwFeatMissing("NamedEntityList", "edu.cmu.lti.type.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_NamedEntityList), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_NamedEntityList), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    