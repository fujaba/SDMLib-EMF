/**
 */
package org.sdmlib.examples.emfstudyright.EMFStudyRightModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.RoomSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.StudentSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.TeachingAssistantSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.AssignmentSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getCredits <em>Credits</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getUni <em>Uni</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getDoors <em>Doors</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getStudents <em>Students</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getTas <em>Tas</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject
{
  /**
   * Returns the value of the '<em><b>Topic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Topic</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Topic</em>' attribute.
   * @see #setTopic(String)
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getRoom_Topic()
   * @model unique="false"
   * @generated
   */
  String getTopic();

  /**
   * Sets the value of the '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getTopic <em>Topic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Topic</em>' attribute.
   * @see #getTopic()
   * @generated
   */
  void setTopic(String value);

  /**
   * Returns the value of the '<em><b>Credits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Credits</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Credits</em>' attribute.
   * @see #setCredits(int)
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getRoom_Credits()
   * @model unique="false"
   * @generated
   */
  int getCredits();

  /**
   * Sets the value of the '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getCredits <em>Credits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Credits</em>' attribute.
   * @see #getCredits()
   * @generated
   */
  void setCredits(int value);

  /**
   * Returns the value of the '<em><b>Uni</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University#getRooms <em>Rooms</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uni</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uni</em>' container reference.
   * @see #setUni(University)
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getRoom_Uni()
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University#getRooms
   * @model opposite="rooms" transient="false"
   * @generated
   */
  University getUni();

  /**
   * Sets the value of the '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getUni <em>Uni</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uni</em>' container reference.
   * @see #getUni()
   * @generated
   */
  void setUni(University value);

  /**
   * Returns the value of the '<em><b>Doors</b></em>' reference list.
   * The list contents are of type {@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room}.
   * It is bidirectional and its opposite is '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getDoors <em>Doors</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Doors</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Doors</em>' reference list.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getRoom_Doors()
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getDoors
   * @model opposite="doors"
   * @generated
   */
  EList<Room> getDoors();

  /**
   * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
   * The list contents are of type {@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment}.
   * It is bidirectional and its opposite is '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment#getRoom <em>Room</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignments</em>' containment reference list.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getRoom_Assignments()
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment#getRoom
   * @model opposite="room" containment="true"
   * @generated
   */
  EList<Assignment> getAssignments();

  /**
   * Returns the value of the '<em><b>Students</b></em>' reference list.
   * The list contents are of type {@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student}.
   * It is bidirectional and its opposite is '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getIn <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Students</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Students</em>' reference list.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getRoom_Students()
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getIn
   * @model opposite="in"
   * @generated
   */
  EList<Student> getStudents();

  /**
   * Returns the value of the '<em><b>Tas</b></em>' reference list.
   * The list contents are of type {@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant}.
   * It is bidirectional and its opposite is '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant#getRoom <em>Room</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tas</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tas</em>' reference list.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getRoom_Tas()
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant#getRoom
   * @model opposite="room"
   * @generated
   */
  EList<TeachingAssistant> getTas();


   
   //==========================================================================
   
   public static final String PROPERTY_TOPIC = "topic";
   
   public Room withTopic(String value);

   
   //==========================================================================
   
   public static final String PROPERTY_CREDITS = "credits";
   
   public Room withCredits(int value);

   public Room withUni(University value);

   public University createUni();

   
   public static final RoomSet EMPTY_SET = new RoomSet();

   public StudentSet getStudentsSet();

   boolean addToStudents(Student value);

   boolean removeFromStudents(Student value);

   public Room withStudents(Student... value);

   public Room withoutStudents(Student... value);

   public void removeAllFromStudents();

   public Student createStudents();

   public TeachingAssistantSet getTasSet();

   boolean addToTas(TeachingAssistant value);

   boolean removeFromTas(TeachingAssistant value);

   public Room withTas(TeachingAssistant... value);

   public Room withoutTas(TeachingAssistant... value);

   public void removeAllFromTas();

   public TeachingAssistant createTas();

   public RoomSet getDoorsSet();

   public RoomSet getDoorsTransitive();

   boolean addToDoors(Room value);

   boolean removeFromDoors(Room value);

   public Room withDoors(Room... value);

   public Room withoutDoors(Room... value);

   public void removeAllFromDoors();

   public Room createDoors();

   public AssignmentSet getAssignmentsSet();

   boolean addToAssignments(Assignment value);

   boolean removeFromAssignments(Assignment value);

   public Room withAssignments(Assignment... value);

   public Room withoutAssignments(Assignment... value);

   public void removeAllFromAssignments();

   public Assignment createAssignments();

   
   /********************************************************************
    * <pre>
    *              many                       one
    * Room ----------------------------------- University
    *              rooms                   uni
    * </pre>
    */
   
   public static final String PROPERTY_UNI = "uni";

   
   /********************************************************************
    * <pre>
    *              one                       many
    * Room ----------------------------------- Student
    *              in                   students
    * </pre>
    */
   
   public static final String PROPERTY_STUDENTS = "students";

   
   /********************************************************************
    * <pre>
    *              one                       many
    * Room ----------------------------------- TeachingAssistant
    *              room                   tas
    * </pre>
    */
   
   public static final String PROPERTY_TAS = "tas";

   
   /********************************************************************
    * <pre>
    *              many                       many
    * Room ----------------------------------- Room
    *              doors                   doors
    * </pre>
    */
   
   public static final String PROPERTY_DOORS = "doors";

   
   /********************************************************************
    * <pre>
    *              one                       many
    * Room ----------------------------------- Assignment
    *              room                   assignments
    * </pre>
    */
   
   public static final String PROPERTY_ASSIGNMENTS = "assignments";
} // Room

