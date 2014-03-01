package org.sdmlib.tools;

import org.junit.Test;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelFactory;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;
import org.sdmlib.storyboards.Storyboard;

public class SDMUsageOfEMFStudyRight
{
   @Test
   public void testSDMUsageOfEMFStudyRight()
   {
      Storyboard story = new Storyboard("emfsrc");

      story.addStep("Create initial emf object structure");
      
      story.markCodeStart();
      
      University uni = EMFStudyRightModelFactory.eINSTANCE.createUniversity()
            .withName("Study Right EMF");
      
      Student karli = uni.createStudents()
            .withName("Karli")
            .withCredits(42);

      Student eyse = uni.createStudents()
            .withName("Eyse")
            .withCredits(63);
      
      
      Student abu = uni.createStudents()
            .withName("Abu")
            .withCredits(23);
      
      Room math = uni.createRooms()
            .withTopic("Math");
      
      Assignment limes = math.createAssignments()
            .withName("Limes");
      
      
      Assignment equations = math.createAssignments()
            .withName("Equations");
      
      
      Room sports = uni.createRooms()
            .withTopic("Sports");
      
      Assignment pushUps = sports.createAssignments()
            .withName("Push-ups");
      
      
      story.addCode();
      
      story.addObjectDiagramWith(uni, uni.getStudents(), uni.getRoomsSet(), uni.getRoomsSet().getAssignments());
      
      
      story.dumpHTML();
   }
}
