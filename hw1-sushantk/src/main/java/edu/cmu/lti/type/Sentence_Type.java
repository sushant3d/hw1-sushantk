
/* First created by JCasGen Tue Oct 16 03:38:34 EDT 2012 */
package edu.cmu.lti.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Stores the sentence information from document collection
 * Updated by JCasGen Tue Oct 16 03:39:19 EDT 2012
 * @generated */
public class Sentence_Type extends Annotation_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Sentence_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Sentence_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Sentence(addr, Sentence_Type.this);
  			   Sentence_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Sentence(addr, Sentence_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = Sentence.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.type.Sentence");
 
  /** @generated */
  final Feature casFeat_SourceID;
  /** @generated */
  final int     casFeatCode_SourceID;
  /** @generated */ 
  public String getSourceID(int addr) {
        if (featOkTst && casFeat_SourceID == null)
      jcas.throwFeatMissing("SourceID", "edu.cmu.lti.type.Sentence");
    return ll_cas.ll_getStringValue(addr, casFeatCode_SourceID);
  }
  /** @generated */    
  public void setSourceID(int addr, String v) {
        if (featOkTst && casFeat_SourceID == null)
      jcas.throwFeatMissing("SourceID", "edu.cmu.lti.type.Sentence");
    ll_cas.ll_setStringValue(addr, casFeatCode_SourceID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_SourceText;
  /** @generated */
  final int     casFeatCode_SourceText;
  /** @generated */ 
  public String getSourceText(int addr) {
        if (featOkTst && casFeat_SourceText == null)
      jcas.throwFeatMissing("SourceText", "edu.cmu.lti.type.Sentence");
    return ll_cas.ll_getStringValue(addr, casFeatCode_SourceText);
  }
  /** @generated */    
  public void setSourceText(int addr, String v) {
        if (featOkTst && casFeat_SourceText == null)
      jcas.throwFeatMissing("SourceText", "edu.cmu.lti.type.Sentence");
    ll_cas.ll_setStringValue(addr, casFeatCode_SourceText, v);}
    
  
 
  /** @generated */
  final Feature casFeat_NamedEntityList;
  /** @generated */
  final int     casFeatCode_NamedEntityList;
  /** @generated */ 
  public int getNamedEntityList(int addr) {
        if (featOkTst && casFeat_NamedEntityList == null)
      jcas.throwFeatMissing("NamedEntityList", "edu.cmu.lti.type.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_NamedEntityList);
  }
  /** @generated */    
  public void setNamedEntityList(int addr, int v) {
        if (featOkTst && casFeat_NamedEntityList == null)
      jcas.throwFeatMissing("NamedEntityList", "edu.cmu.lti.type.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_NamedEntityList, v);}
    
   /** @generated */
  public int getNamedEntityList(int addr, int i) {
        if (featOkTst && casFeat_NamedEntityList == null)
      jcas.throwFeatMissing("NamedEntityList", "edu.cmu.lti.type.Sentence");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NamedEntityList), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_NamedEntityList), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NamedEntityList), i);
  }
   
  /** @generated */ 
  public void setNamedEntityList(int addr, int i, int v) {
        if (featOkTst && casFeat_NamedEntityList == null)
      jcas.throwFeatMissing("NamedEntityList", "edu.cmu.lti.type.Sentence");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NamedEntityList), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_NamedEntityList), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NamedEntityList), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Sentence_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_SourceID = jcas.getRequiredFeatureDE(casType, "SourceID", "uima.cas.String", featOkTst);
    casFeatCode_SourceID  = (null == casFeat_SourceID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SourceID).getCode();

 
    casFeat_SourceText = jcas.getRequiredFeatureDE(casType, "SourceText", "uima.cas.String", featOkTst);
    casFeatCode_SourceText  = (null == casFeat_SourceText) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SourceText).getCode();

 
    casFeat_NamedEntityList = jcas.getRequiredFeatureDE(casType, "NamedEntityList", "uima.cas.FSArray", featOkTst);
    casFeatCode_NamedEntityList  = (null == casFeat_NamedEntityList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_NamedEntityList).getCode();

  }
}



    