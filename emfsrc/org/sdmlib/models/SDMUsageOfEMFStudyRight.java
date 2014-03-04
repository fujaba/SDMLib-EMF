package org.sdmlib.models;

import org.junit.Test;
import org.sdmlib.codegen.CGUtil;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelFactory;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.AssignmentSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.RoomPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.RoomSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.StudentPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.TeachingAssistantPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.TeachingAssistantSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators.UniversityImplCreator;
import org.sdmlib.models.classes.ClassModel;
import org.sdmlib.models.classes.Clazz;
import org.sdmlib.models.classes.Role.R;
import org.sdmlib.models.pattern.Match;
import org.sdmlib.storyboards.Storyboard;

public class SDMUsageOfEMFStudyRight
{
   @Test
   public void testStudyRightObjectModelNavigationAndQueries()
   {
      Storyboard story = new Storyboard();
      
      story.add("Extend the class model:", Storyboard.DONE, "zuendorf", "17.01.2014 16:35:42", 40, 0);
      
      ClassModel model = new ClassModel();
      
      Clazz studentClass = model.createClazz(Student.class.getName());
 
      studentClass.withAssoc(studentClass, "friends", R.MANY, "friends", R.MANY);
      
      Clazz roomClass = model.createClazz(Room.class.getName());
      
      roomClass.createClassAndAssoc("TeachingAssistant", "tas", R.MANY, "room", R.ONE);
      
      story.addClassDiagram(model);
      
      // model.generate("examples");
      
      story.add("How to navigate and query an object model.");
      
      story.addStep("Example object structure:");
      
      University university = EMFStudyRightModelFactory.eINSTANCE.createUniversity()
      .withName("StudyRight");

      Student karli = university.createStudentsTeachingAssistant()
            .withStudId("4242")
            .withName("Karli");
      
      Student abu = university.createStudents()
            .withStudId("1337")
            .withName("Abu");
      
      Student alice = university.createStudents()
            .withStudId("2323")
            .withName("Alice");
      
      abu.withFriends(alice);

      Assignment a1 = EMFStudyRightModelFactory.eINSTANCE.createAssignment()
      .withName("Matrix Multiplication")
      .withPoints(5)
      .withStudents(abu);

      Assignment a2 = EMFStudyRightModelFactory.eINSTANCE.createAssignment()
      .withName("Series")
      .withPoints(6);

      Assignment a3 = EMFStudyRightModelFactory.eINSTANCE.createAssignment()
      .withName("Integrals")
      .withPoints(8);
      
      karli.withDone(a1, a2);

      Room mathRoom = university.createRooms()
            .withTopic("math")
            .withCredits(17)  
            .withStudents(karli)
            .withAssignments(a1, a2, a3);

      Room artsRoom = university.createRooms()
            .withTopic("arts")
            .withCredits(16)
            .withDoors(mathRoom); 

      Room sportsRoom = university.createRooms()
            .withTopic("sports")
            .withCredits(25)
            .withDoors(mathRoom, artsRoom)
            .withStudents(abu, alice); 
      
      Assignment a4 = sportsRoom.createAssignments().withName("Pushups").withPoints(4).withStudents(abu);

      Room examRoom = university.createRooms()
            .withTopic("exam")
            .withCredits(0)
            .withDoors(sportsRoom, artsRoom);

      Room softwareEngineering = university.createRooms()
            .withTopic("Software Engineering")
            .withCredits(42)
            .withDoors(artsRoom, examRoom);

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
         a4);

      
      //=====================================================
      story.addStep("Simple set based navigation:");
      
      story.markCodeStart();
 
      int assignmentPoints = university.getRoomsSet().getAssignments().getPoints().sum();
      
      int donePoints = university.getStudentsSet().getDone().getPoints().sum();
      
      story.addCode();
      
      story.add("Results in:");
      
      String text = CGUtil.replaceAll(
         "      Sum of assignment points: 42. \n" +
         "      Sum of points of assignments that have been done by at least one students: 84.",
         "42", assignmentPoints, 
         "84", donePoints);
      
      story.addPreformatted(text);
      
      story.assertEquals("Assignment points: ", 23, assignmentPoints);
      story.assertEquals("donePoints: ", 15, donePoints);
      
      //=====================================================
      story.addStep("Rooms with assignments not yet done by Karli:");
      
      story.markCodeStart();
      
      AssignmentSet availableAssignments = university.getRoomsSet().getAssignments().minus(karli.getDoneSet());
      
      RoomSet rooms = availableAssignments.getRoom();
      
      story.addCode();
     
      story.add("Results in:");
      
      story.addPreformatted("      " + rooms.toString());

      story.assertEquals("rooms.size(): ", 2, rooms.size()); 
      
      story.addStep("Filter for attribute:");
      
      story.markCodeStart();
      
      RoomSet rooms17 = university.getRoomsSet().hasCredits(17);
      RoomSet roomsGE20 = university.getRoomsSet().hasCredits(20, Integer.MAX_VALUE);

      story.addCode();
      
      story.add("Results in:");
      
      story.addPreformatted("      rooms17: " + rooms17.toString() 
         + "\n      roomsGE20: " + roomsGE20);
      
      story.addStep("Filter for attribute greater than:");
      
      story.markCodeStart();
      
      // Java 8:
      // (Room elem) -> elem.getCredits() > 20
      
      RoomSet roomsEven = university.getRoomsSet().has(rooms.new Condition() {

         @Override
         public boolean check(Room elem)
         {
            return elem.getCredits() % 2 == 0;
         }
         
      });
      
      story.addCode();
      
      story.add("Results in:");
      
      story.addPreformatted("      " + roomsEven);
      
      //====================================================
      story.addStep("Filter for type: ");
      
      story.markCodeStart();
      
      TeachingAssistantSet taStudents = university.getRoomsSet().getStudents().instanceOf(new TeachingAssistantSet());
      
      story.addCode();
      
      story.addPreformatted("" + taStudents);
      
      //====================================================
      story.addStep("Write operations on sets: ");
      
      story.markCodeStart();
      
      university.getStudentsSet().withMotivation(42);
      
      story.addCode();
      
      story.addObjectDiagramWith(university.getStudents());
      
      
      //=====================================================
      story.addStep("Rooms with two students that are friends (and need supervision): ");
      
      story.markCodeStart();
      
      RoomPO roomPO = university.getRoomsSet().hasRoomPO();
            
      StudentPO stud1PO = roomPO.hasStudents();      
      
      roomPO.hasStudents().hasMotivation(42).hasFriends(stud1PO);
      
      rooms = roomPO.allMatches();
      
      story.addCode();
     
      story.addPattern(roomPO.getPattern(), false);
      
      story.add("Results in:");
      
      story.addPreformatted("      " + rooms.toString());
      

      //=====================================================
      story.addStep("Rooms with two students with low motivation that are friends (and need supervision): ");
      
      story.markCodeStart();
      
      roomPO = university.getRoomsSet().hasRoomPO();
            
      stud1PO = roomPO.hasStudents();      
      
      final StudentPO stud2PO = roomPO.hasStudents().hasMotivation(0, 50);
      
      // Java 8: 
      // stud2PO.has( () -> stud2PO.getMotivation() < 50);
      
      //      stud2PO.has(new GenericConstraint.Condition()
      //      {
      //         @Override
      //         public boolean check()
      //         {
      //            return stud2PO.getMotivation() < 50;
      //         }
      //      });
      
      stud2PO.hasFriends(stud1PO);
      
      rooms = roomPO.allMatches();
      
      story.addCode();
     
      story.addPattern(roomPO.getPattern(), false);
      
      story.add("Results in:");
      
      story.addPreformatted("      " + rooms.toString());

      //=====================================================
      story.addStep("Rooms with two students without supervision that are friends and add teaching assistance: ");
      
      story.markCodeStart();
      
      roomPO = university.getRoomsSet().hasRoomPO();
            
      stud1PO = roomPO.hasStudents();      
      
      roomPO.hasStudents().hasFriends(stud1PO);
      
      roomPO.hasTas(null);
      
      roomPO.createTas();
      
      rooms = roomPO.allMatches();
      
      story.addCode();
     
      story.addPattern(roomPO.getPattern(), false);
      
      story.add("Results in:");
      
      story.addObjectDiagramWith(rooms, rooms.getStudents(), rooms.getTas());
      
      story.addPreformatted("      " + rooms.toString());
      
      //=====================================================
      story.addStep("TAs as students in a room: ");
      
      story.markCodeStart();
      
      roomPO = university.getRoomsSet().hasRoomPO();
      
      stud1PO = roomPO.hasStudents();
      
      TeachingAssistantPO taPO = stud1PO.instanceOf(new TeachingAssistantPO());
      
      TeachingAssistantSet taSet = taPO.allMatches();
      
      story.addCode();

      story.addPattern(roomPO, false);
      
      story.addObjectDiagramWith(taSet, taSet.getRoom());


      //=====================================================
      story.addStep("Double motivation of all students: ");
      
      story.markCodeStart();
      
      roomPO = university.getRoomsSet().hasRoomPO();
      
      stud1PO = roomPO.hasStudents();

      for (Match match : (Iterable<Match>) roomPO.getPattern())
      {
         Student currentMatch = stud1PO.getCurrentMatch();
         
         currentMatch.withMotivation(currentMatch.getMotivation() * 2);
         
         // or more simple:
         stud1PO.withMotivation(stud1PO.getMotivation() * 2);
        
         System.out.println("match " + match.number + ": " + currentMatch + " in room " + roomPO.getCurrentMatch());
      }
      
      story.addCode();

      story.addPattern(roomPO, false);
      
      story.addObjectDiagramWith(university.getStudents(), university.getStudentsSet().getIn());
      
      story.addLogEntry(R.DONE, "zuendorf", "24.02.2014 20:03:42 EST", 2, 0, "added createXY shortcuts for patterns");
      story.addLogEntry(R.DONE, "zuendorf", "25.02.2014 22:11:42 EST", 2, 0, "switched to roomSet.hasRoomPO()");


      story.dumpHTML();
   }
}
