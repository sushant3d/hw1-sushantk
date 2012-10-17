
/* First created by JCasGen Tue Oct 16 02:42:13 EDT 2012 */
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

/** 
 * Updated by JCasGen Tue Oct 16 03:39:19 EDT 2012
 * @generated */
public class NamedEntity_Type extends Annotation_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NamedEntity_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NamedEntity_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NamedEntity(addr, NamedEntity_Type.this);
  			   NamedEntity_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NamedEntity(addr, NamedEntity_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = NamedEntity.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.type.NamedEntity");
 
  /** @generated */
  final Feature casFeat_NamedEntityType;
  /** @generated */
  final int     casFeatCode_NamedEntityType;
  /** @generated */ 
  public String getNamedEntityType(int addr) {
        if (featOkTst && casFeat_NamedEntityType == null)
      jcas.throwFeatMissing("NamedEntityType", "edu.cmu.lti.type.NamedEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_NamedEntityType);
  }
  /** @generated */    
  public void setNamedEntityType(int addr, String v) {
        if (featOkTst && casFeat_NamedEntityType == null)
      jcas.throwFeatMissing("NamedEntityType", "edu.cmu.lti.type.NamedEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_NamedEntityType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_SourceID;
  /** @generated */
  final int     casFeatCode_SourceID;
  /** @generated */ 
  public String getSourceID(int addr) {
        if (featOkTst && casFeat_SourceID == null)
      jcas.throwFeatMissing("SourceID", "edu.cmu.lti.type.NamedEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_SourceID);
  }
  /** @generated */    
  public void setSourceID(int addr, String v) {
        if (featOkTst && casFeat_SourceID == null)
      jcas.throwFeatMissing("SourceID", "edu.cmu.lti.type.NamedEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_SourceID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_NamedEntityMention;
  /** @generated */
  final int     casFeatCode_NamedEntityMention;
  /** @generated */ 
  public String getNamedEntityMention(int addr) {
        if (featOkTst && casFeat_NamedEntityMention == null)
      jcas.throwFeatMissing("NamedEntityMention", "edu.cmu.lti.type.NamedEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_NamedEntityMention);
  }
  /** @generated */    
  public void setNamedEntityMention(int addr, String v) {
        if (featOkTst && casFeat_NamedEntityMention == null)
      jcas.throwFeatMissing("NamedEntityMention", "edu.cmu.lti.type.NamedEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_NamedEntityMention, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public NamedEntity_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_NamedEntityType = jcas.getRequiredFeatureDE(casType, "NamedEntityType", "uima.cas.String", featOkTst);
    casFeatCode_NamedEntityType  = (null == casFeat_NamedEntityType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_NamedEntityType).getCode();

 
    casFeat_SourceID = jcas.getRequiredFeatureDE(casType, "SourceID", "uima.cas.String", featOkTst);
    casFeatCode_SourceID  = (null == casFeat_SourceID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SourceID).getCode();

 
    casFeat_NamedEntityMention = jcas.getRequiredFeatureDE(casType, "NamedEntityMention", "uima.cas.String", featOkTst);
    casFeatCode_NamedEntityMention  = (null == casFeat_NamedEntityMention) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_NamedEntityMention).getCode();

  }
}



    