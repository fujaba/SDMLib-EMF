package org.sdmlib.examples.emfstudyright;

import org.junit.Test;
import org.sdmlib.storyboards.Storyboard;
import org.sdmlib.tools.SDMCodeEnhancer;

public class SDMEnhanceEMFStudyRightModel
{

   /**
  * 
  * @see <a href='../../../../../../doc/SDMCodeEnhancer.html'>SDMCodeEnhancer.html</a>
* @see <a href='../../../../../../../doc/SDMEnhanceEMFStudyRightModel.html'>SDMEnhanceEMFStudyRightModel.html</a>
 */
 @Test
 public void testSDMEnhanceEMFStudyRightModel()
 {
    SDMCodeEnhancer.story = new Storyboard();
    
    SDMCodeEnhancer.main("src/test/java", "org.sdmlib.examples.emfstudyright.EMFStudyRightModel");
    
    SDMCodeEnhancer.story.dumpHTML();
 }
 

   
}
