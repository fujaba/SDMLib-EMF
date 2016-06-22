package org.sdmlib.examples.emfstudyright;

import org.junit.Test;
import org.sdmlib.CGUtil;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelFactory;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.UniversityImpl;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.AssignmentSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.RoomSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.StudentSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.UniversitySet;
import org.sdmlib.storyboards.Storyboard;

public class SDMUsageOfEMFStudyRight
{
     /**
    * 
    * @see <a href='../../../../../../../doc/StudyRightObjectModelNavigationAndQueries.html'>StudyRightObjectModelNavigationAndQueries.html</a>
 */
   @Test
   public void testStudyRightObjectModelNavigationAndQueries()
   {
      EMFStudyRightModelFactory factory = EMFStudyRightModelFactory.eINSTANCE;
      
      Storyboard story = new Storyboard();

      story.add("How to navigate and query an object model.");

      story.addStep("Example object structure:");
      
      University university = EMFStudyRightModelFactory.eINSTANCE.createUniversity();
      university.setName("StudyRight");

      Student karli = factory.createTeachingAssistant();
      karli.setStudId("4242");
      karli.setName("Karli");
      university.getStudents().add(karli);
      
      Student abu = factory.createStudent();
      abu.setStudId("1337");
      abu.setName("Abu");
      university.getStudents().add(abu);
      
      Student alice = factory.createStudent();
      alice.setStudId("2323");
      alice.setName("Alice");
      university.getStudents().add(alice);
      
      abu.getFriends().add(alice);

      Assignment a1 = factory.createAssignment();
      a1.setName("Matrix Multiplication");
      a1.setPoints(5);
      a1.getStudents().add(abu);

      Assignment a2 = factory.createAssignment();
      a2.setName("Series");
      a2.setPoints(6);

      Assignment a3 = factory.createAssignment();
      a3.setName("Integrals");
      a3.setPoints(8);

      karli.getDone().add(a1);
      karli.getDone().add(a2);

      Room mathRoom = factory.createRoom();
      mathRoom.setTopic("math");
      mathRoom.setCredits(17)  ;
      mathRoom.getStudents().add(karli);
      mathRoom.getAssignments().addAll(new AssignmentSet(a1, a2, a3));
      university.getRooms().add(mathRoom);

      Room artsRoom = factory.createRoom();
      artsRoom.setTopic("arts");
      artsRoom.setCredits(16);
      artsRoom.getDoors().add(mathRoom); 
      university.getRooms().add(artsRoom);

      Room sportsRoom = factory.createRoom();
      sportsRoom.setTopic("sports");
      sportsRoom.setCredits(25);
      sportsRoom.getDoors().add(mathRoom);
      sportsRoom.getDoors().add(artsRoom);
      sportsRoom.getStudents().addAll(new StudentSet(abu, alice)); 
      university.getRooms().add(sportsRoom);

      Assignment a4 = factory.createAssignment();
      a4.setName("Pushups");
      a4.setPoints(4);
      a4.getStudents().add(abu);
      
      sportsRoom.getAssignments().add(a4);

      Room examRoom = factory.createRoom();
      examRoom.setTopic("exam");
      examRoom.setCredits(0);
      examRoom.getDoors().add(sportsRoom);
      examRoom.getDoors().add(artsRoom);
      university.getRooms().add(examRoom);

      Room softwareEngineering = factory.createRoom();
      softwareEngineering.setTopic("Software Engineering");
      softwareEngineering.setCredits(42);
      softwareEngineering.getDoors().add(artsRoom);
      softwareEngineering.getDoors().add(examRoom);
      university.getRooms().add(softwareEngineering);

      story.addObjectDiagram(
         "studyRight", university, 
         "karli", "icons/karli.png", karli, 
         "abu", "icons/karli.png", abu, 
         "alice", "icons/karli.png", alice, 
         "mathRoom", "icons/mathroom.png", mathRoom, 
         "artsRoom", artsRoom,
         "sportsRoom", sportsRoom, 
         "examRoom", examRoom, 
         "placeToBe", softwareEngineering, 
         "icons/matrix.png", a1, 
         "icons/limes.png", a2 , 
         "icons/integralAssignment.png", a3, 
         a4
         );


      //=====================================================
      story.addStep("Simple set based navigation:");

      story.markCodeStart();

      int assignmentPoints = new UniversitySet(university).getRooms().getAssignments().getPoints().sum();
      int assignmentPoints2 = new RoomSet(university.getRooms()).getAssignments()
            .stream().mapToInt(Assignment::getPoints).sum();

      int donePoints = new UniversitySet(university).getStudents().getDone().getPoints().sum();

      story.addCode();

      story.add("Results in:");

      String text = CGUtil.replaceAll(
         "      Sum of assignment points: 23. \n" +
               "      Sum of points of assignments that have been done by at least one students: 15.",
               "23", assignmentPoints, 
               "15", donePoints);

      story.addPreformatted(text);

      story.assertEquals("Assignment points: ", 23, assignmentPoints);
      story.assertEquals("donePoints: ", 15, donePoints);

      //=====================================================
      story.addStep("Rooms with assignments not yet done by Karli:");

      story.markCodeStart();

      AssignmentSet availableAssignments = new UniversitySet(university).getRooms().getAssignments().minus(karli.getDone());

      RoomSet rooms = availableAssignments.getRoom();

      story.addCode();

      story.add("Results in:");

      story.addPreformatted("      " + rooms.toString());

      story.assertEquals("rooms.size(): ", 2, rooms.size()); 

      story.addStep("Filter for attribute:");

      story.markCodeStart();

      RoomSet rooms17 = new UniversitySet(university).getRooms().filterCredits(17);
      RoomSet roomsGE20 = new UniversitySet(university).getRooms().filterCredits(20, Integer.MAX_VALUE);

      story.addCode();

      story.add("Results in:");

      story.addPreformatted("      rooms17: " + rooms17.toString() 
      + "\n      roomsGE20: " + roomsGE20);

      story.addStep("Filter for attribute greater than:");

      story.markCodeStart();

      // Java 8:
      // (Room elem) -> elem.getCredits() > 20

      RoomSet roomsEven = new UniversitySet(university).getRooms().filter(elem -> elem.getCredits() % 2 == 0);

      story.addCode();

      story.add("Results in:");

      story.addPreformatted("      " + roomsEven);

//      //====================================================
//      story.addStep("Filter for type: ");
//      
//      story.markCodeStart();
//      
//      TeachingAssistantSet taStudents = university.getRoomsSet().getStudents().instanceOf(new TeachingAssistantSet());
//      
//      story.addCode();
//      
//      story.addPreformatted("" + taStudents);
//      
//      //====================================================
//      story.addStep("Write operations on sets: ");
//      
//      story.markCodeStart();
//      
//      university.getStudentsSet().withMotivation(42);
//      
//      story.addCode();
//      
//      story.addObjectDiagramWith(university.getStudents());
//      
//      
//      //=====================================================
//      story.addStep("Rooms with two students that are friends (and need supervision): ");
//      
//      story.markCodeStart();
//      
//      UniversityPO universityPO = new UniversityPO(university);
//      
//      RoomPO roomPO = universityPO.hasRooms();
//            
//      StudentPO stud1PO = roomPO.hasStudents();      
//      
//      roomPO.hasStudents().hasMotivation(42).hasFriends(stud1PO);
//      
//      rooms = roomPO.allMatches();
//      
//      story.addCode();
//     
//      story.addPattern(roomPO.getPattern(), false);
//      
//      story.add("Results in:");
//      
//      story.addPreformatted("      " + rooms.toString());
//      
//
//      //=====================================================
//      story.addStep("Rooms with two students with low motivation that are friends (and need supervision): ");
//      
//      story.markCodeStart();
//      
//      roomPO = university.getRoomsSet().hasRoomPO();
//            
//      stud1PO = roomPO.hasStudents();      
//      
//      final StudentPO stud2PO = roomPO.hasStudents().hasMotivation(0, 50);
//      
//      // Java 8: 
//      // stud2PO.has( () -> stud2PO.getMotivation() < 50);
//      
//      //      stud2PO.has(new GenericConstraint.Condition()
//      //      {
//      //         @Override
//      //         public boolean check()
//      //         {
//      //            return stud2PO.getMotivation() < 50;
//      //         }
//      //      });
//      
//      stud2PO.hasFriends(stud1PO);
//      
//      rooms = roomPO.allMatches();
//      
//      story.addCode();
//     
//      story.addPattern(roomPO.getPattern(), false);
//      
//      story.add("Results in:");
//      
//      story.addPreformatted("      " + rooms.toString());
//
//      //=====================================================
//      story.addStep("Rooms with two students without supervision that are friends and add teaching assistance: ");
//      
//      story.markCodeStart();
//      
//      roomPO = university.getRoomsSet().hasRoomPO();
//            
//      stud1PO = roomPO.hasStudents();      
//      
//      roomPO.hasStudents().hasFriends(stud1PO);
//      
//      roomPO.hasTas(null);
//      
//      roomPO.createTas();
//      
//      rooms = roomPO.allMatches();
//      
//      story.addCode();
//     
//      story.addPattern(roomPO.getPattern(), false);
//      
//      story.add("Results in:");
//      
//      story.addObjectDiagramWith(rooms, rooms.getStudents(), rooms.getTas());
//      
//      story.addPreformatted("      " + rooms.toString());
//      
//      //=====================================================
//      story.addStep("TAs as students in a room: ");
//      
//      story.markCodeStart();
//      
//      roomPO = university.getRoomsSet().hasRoomPO();
//      
//      stud1PO = roomPO.hasStudents();
//      
//      TeachingAssistantPO taPO = stud1PO.instanceOf(new TeachingAssistantPO());
//      
//      TeachingAssistantSet taSet = taPO.allMatches();
//      
//      story.addCode();
//
//      story.addPattern(roomPO, false);
//      
//      story.addObjectDiagramWith(taSet, taSet.getRoom());
//
//
//      //=====================================================
//      story.addStep("Double motivation of all students: ");
//      
//      story.markCodeStart();
//      
//      roomPO = university.getRoomsSet().hasRoomPO();
//      
//      stud1PO = roomPO.hasStudents();
//
//      for (Match match : (Iterable<Match>) roomPO.getPattern())
//      {
//         Student currentMatch = stud1PO.getCurrentMatch();
//         
//         currentMatch.withMotivation(currentMatch.getMotivation() * 2);
//         
//         // or more simple:
//         stud1PO.withMotivation(stud1PO.getMotivation() * 2);
//        
//         System.out.println("match " + match.number + ": " + currentMatch + " in room " + roomPO.getCurrentMatch());
//      }
//      
//      story.addCode();
//
//      story.addPattern(roomPO, false);
//      
//      story.addObjectDiagramWith(university.getStudents(), university.getStudentsSet().getIn());
//      
      story.dumpHTML();
   }
}
