

/* First created by JCasGen Tue Oct 16 02:42:13 EDT 2012 */
package edu.cmu.lti.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Oct 16 03:39:19 EDT 2012
 * XML source: C:/Personal/workspace/git/hw1-sushantk/hw1-sushantk/src/main/resources/descriptors/GeneNamedEntityRecognizerDescriptor.xml
 * @generated */
public class NamedEntity extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(NamedEntity.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected NamedEntity() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NamedEntity(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NamedEntity(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NamedEntity(JCas jcas, int begin, int end) {
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
  //* Feature: NamedEntityType

  /** getter for NamedEntityType - gets Stores the Named Entity type eg. GENE
   * @generated */
  public String getNamedEntityType() {
    if (NamedEntity_Type.featOkTst && ((NamedEntity_Type)jcasType).casFeat_NamedEntityType == null)
      jcasType.jcas.throwFeatMissing("NamedEntityType", "edu.cmu.lti.type.NamedEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NamedEntity_Type)jcasType).casFeatCode_NamedEntityType);}
    
  /** setter for NamedEntityType - sets Stores the Named Entity type eg. GENE 
   * @generated */
  public void setNamedEntityType(String v) {
    if (NamedEntity_Type.featOkTst && ((NamedEntity_Type)jcasType).casFeat_NamedEntityType == null)
      jcasType.jcas.throwFeatMissing("NamedEntityType", "edu.cmu.lti.type.NamedEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((NamedEntity_Type)jcasType).casFeatCode_NamedEntityType, v);}    
   
    
  //*--------------*
  //* Feature: SourceID

  /** getter for SourceID - gets Stores the source document ID from where the Named Entity was extracted
   * @generated */
  public String getSourceID() {
    if (NamedEntity_Type.featOkTst && ((NamedEntity_Type)jcasType).casFeat_SourceID == null)
      jcasType.jcas.throwFeatMissing("SourceID", "edu.cmu.lti.type.NamedEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NamedEntity_Type)jcasType).casFeatCode_SourceID);}
    
  /** setter for SourceID - sets Stores the source document ID from where the Named Entity was extracted 
   * @generated */
  public void setSourceID(String v) {
    if (NamedEntity_Type.featOkTst && ((NamedEntity_Type)jcasType).casFeat_SourceID == null)
      jcasType.jcas.throwFeatMissing("SourceID", "edu.cmu.lti.type.NamedEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((NamedEntity_Type)jcasType).casFeatCode_SourceID, v);}    
   
    
  //*--------------*
  //* Feature: NamedEntityMention

  /** getter for NamedEntityMention - gets Stores the Named Entity mention in the given text
   * @generated */
  public String getNamedEntityMention() {
    if (NamedEntity_Type.featOkTst && ((NamedEntity_Type)jcasType).casFeat_NamedEntityMention == null)
      jcasType.jcas.throwFeatMissing("NamedEntityMention", "edu.cmu.lti.type.NamedEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NamedEntity_Type)jcasType).casFeatCode_NamedEntityMention);}
    
  /** setter for NamedEntityMention - sets Stores the Named Entity mention in the given text 
   * @generated */
  public void setNamedEntityMention(String v) {
    if (NamedEntity_Type.featOkTst && ((NamedEntity_Type)jcasType).casFeat_NamedEntityMention == null)
      jcasType.jcas.throwFeatMissing("NamedEntityMention", "edu.cmu.lti.type.NamedEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((NamedEntity_Type)jcasType).casFeatCode_NamedEntityMention, v);}    
  }

    