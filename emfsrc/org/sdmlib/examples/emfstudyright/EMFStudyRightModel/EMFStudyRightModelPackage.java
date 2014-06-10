/**
 */
package org.sdmlib.examples.emfstudyright.EMFStudyRightModel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import sun.font.EAttribute;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/SDMLibEMF/emfsrc' basePackage='org.sdmlib.examples.emfstudyright'"
 * @generated
 */
public interface EMFStudyRightModelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "EMFStudyRightModel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "org.sdmlib.examples.emfstudyright.EMFStudyRightModel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "EMFStudyRightModel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EMFStudyRightModelPackage eINSTANCE = org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.EMFStudyRightModelPackageImpl.init();

  /**
   * The meta object id for the '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.UniversityImpl <em>University</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.UniversityImpl
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.EMFStudyRightModelPackageImpl#getUniversity()
   * @generated
   */
  int UNIVERSITY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIVERSITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIVERSITY__ROOMS = 1;

  /**
   * The feature id for the '<em><b>Students</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIVERSITY__STUDENTS = 2;

  /**
   * The number of structural features of the '<em>University</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIVERSITY_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>University</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIVERSITY_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.RoomImpl <em>Room</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.RoomImpl
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.EMFStudyRightModelPackageImpl#getRoom()
   * @generated
   */
  int ROOM = 3;

  /**
   * The meta object id for the '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.AssignmentImpl
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.EMFStudyRightModelPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 4;

  /**
   * The meta object id for the '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl <em>Student</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.EMFStudyRightModelPackageImpl#getStudent()
   * @generated
   */
  int STUDENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Stud Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDENT__STUD_ID = 1;

  /**
   * The feature id for the '<em><b>Credits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDENT__CREDITS = 2;

  /**
   * The feature id for the '<em><b>Motivation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDENT__MOTIVATION = 3;

  /**
   * The feature id for the '<em><b>Assignment Points</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDENT__ASSIGNMENT_POINTS = 4;

  /**
   * The feature id for the '<em><b>Uni</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDENT__UNI = 5;

  /**
   * The feature id for the '<em><b>In</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDENT__IN = 6;

  /**
   * The feature id for the '<em><b>Friends</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDENT__FRIENDS = 7;

  /**
   * The feature id for the '<em><b>Done</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDENT__DONE = 8;

  /**
   * The number of structural features of the '<em>Student</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDENT_FEATURE_COUNT = 9;

  /**
   * The number of operations of the '<em>Student</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDENT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.TeachingAssistantImpl <em>Teaching Assistant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.TeachingAssistantImpl
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.EMFStudyRightModelPackageImpl#getTeachingAssistant()
   * @generated
   */
  int TEACHING_ASSISTANT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEACHING_ASSISTANT__NAME = STUDENT__NAME;

  /**
   * The feature id for the '<em><b>Stud Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEACHING_ASSISTANT__STUD_ID = STUDENT__STUD_ID;

  /**
   * The feature id for the '<em><b>Credits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEACHING_ASSISTANT__CREDITS = STUDENT__CREDITS;

  /**
   * The feature id for the '<em><b>Motivation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEACHING_ASSISTANT__MOTIVATION = STUDENT__MOTIVATION;

  /**
   * The feature id for the '<em><b>Assignment Points</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEACHING_ASSISTANT__ASSIGNMENT_POINTS = STUDENT__ASSIGNMENT_POINTS;

  /**
   * The feature id for the '<em><b>Uni</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEACHING_ASSISTANT__UNI = STUDENT__UNI;

  /**
   * The feature id for the '<em><b>In</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEACHING_ASSISTANT__IN = STUDENT__IN;

  /**
   * The feature id for the '<em><b>Friends</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEACHING_ASSISTANT__FRIENDS = STUDENT__FRIENDS;

  /**
   * The feature id for the '<em><b>Done</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEACHING_ASSISTANT__DONE = STUDENT__DONE;

  /**
   * The feature id for the '<em><b>Room</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEACHING_ASSISTANT__ROOM = STUDENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Teaching Assistant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEACHING_ASSISTANT_FEATURE_COUNT = STUDENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Teaching Assistant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEACHING_ASSISTANT_OPERATION_COUNT = STUDENT_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>Topic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOM__TOPIC = 0;

  /**
   * The feature id for the '<em><b>Credits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOM__CREDITS = 1;

  /**
   * The feature id for the '<em><b>Uni</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOM__UNI = 2;

  /**
   * The feature id for the '<em><b>Doors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOM__DOORS = 3;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOM__ASSIGNMENTS = 4;

  /**
   * The feature id for the '<em><b>Students</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOM__STUDENTS = 5;

  /**
   * The feature id for the '<em><b>Tas</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOM__TAS = 6;

  /**
   * The number of structural features of the '<em>Room</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOM_FEATURE_COUNT = 7;

  /**
   * The number of operations of the '<em>Room</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOM_OPERATION_COUNT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Points</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__POINTS = 1;

  /**
   * The feature id for the '<em><b>Room</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__ROOM = 2;

  /**
   * The feature id for the '<em><b>Students</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__STUDENTS = 3;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_OPERATION_COUNT = 0;


  /**
   * Returns the meta object for class '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University <em>University</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>University</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University
   * @generated
   */
  EClass getUniversity();

  /**
   * Returns the meta object for the attribute '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University#getName()
   * @see #getUniversity()
   * @generated
   */
  EAttribute getUniversity_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University#getRooms <em>Rooms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rooms</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University#getRooms()
   * @see #getUniversity()
   * @generated
   */
  EReference getUniversity_Rooms();

  /**
   * Returns the meta object for the containment reference list '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University#getStudents <em>Students</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Students</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University#getStudents()
   * @see #getUniversity()
   * @generated
   */
  EReference getUniversity_Students();

  /**
   * Returns the meta object for class '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room <em>Room</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Room</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room
   * @generated
   */
  EClass getRoom();

  /**
   * Returns the meta object for the attribute '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getTopic <em>Topic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Topic</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getTopic()
   * @see #getRoom()
   * @generated
   */
  EAttribute getRoom_Topic();

  /**
   * Returns the meta object for the attribute '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getCredits <em>Credits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Credits</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getCredits()
   * @see #getRoom()
   * @generated
   */
  EAttribute getRoom_Credits();

  /**
   * Returns the meta object for the container reference '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getUni <em>Uni</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Uni</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getUni()
   * @see #getRoom()
   * @generated
   */
  EReference getRoom_Uni();

  /**
   * Returns the meta object for the reference list '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getDoors <em>Doors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Doors</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getDoors()
   * @see #getRoom()
   * @generated
   */
  EReference getRoom_Doors();

  /**
   * Returns the meta object for the containment reference list '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getAssignments <em>Assignments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assignments</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getAssignments()
   * @see #getRoom()
   * @generated
   */
  EReference getRoom_Assignments();

  /**
   * Returns the meta object for the reference list '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getStudents <em>Students</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Students</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getStudents()
   * @see #getRoom()
   * @generated
   */
  EReference getRoom_Students();

  /**
   * Returns the meta object for the reference list '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getTas <em>Tas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Tas</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getTas()
   * @see #getRoom()
   * @generated
   */
  EReference getRoom_Tas();

  /**
   * Returns the meta object for class '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the attribute '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment#getName()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Name();

  /**
   * Returns the meta object for the attribute '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment#getPoints <em>Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Points</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment#getPoints()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Points();

  /**
   * Returns the meta object for the container reference '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment#getRoom <em>Room</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Room</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment#getRoom()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Room();

  /**
   * Returns the meta object for the reference list '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment#getStudents <em>Students</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Students</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment#getStudents()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Students();

  /**
   * Returns the meta object for class '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student <em>Student</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Student</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student
   * @generated
   */
  EClass getStudent();

  /**
   * Returns the meta object for the attribute '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getName()
   * @see #getStudent()
   * @generated
   */
  EAttribute getStudent_Name();

  /**
   * Returns the meta object for the attribute '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getStudId <em>Stud Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stud Id</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getStudId()
   * @see #getStudent()
   * @generated
   */
  EAttribute getStudent_StudId();

  /**
   * Returns the meta object for the attribute '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getCredits <em>Credits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Credits</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getCredits()
   * @see #getStudent()
   * @generated
   */
  EAttribute getStudent_Credits();

  /**
   * Returns the meta object for the attribute '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getMotivation <em>Motivation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Motivation</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getMotivation()
   * @see #getStudent()
   * @generated
   */
  EAttribute getStudent_Motivation();

  /**
   * Returns the meta object for the attribute '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getAssignmentPoints <em>Assignment Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Assignment Points</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getAssignmentPoints()
   * @see #getStudent()
   * @generated
   */
  EAttribute getStudent_AssignmentPoints();

  /**
   * Returns the meta object for the container reference '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getUni <em>Uni</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Uni</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getUni()
   * @see #getStudent()
   * @generated
   */
  EReference getStudent_Uni();

  /**
   * Returns the meta object for the reference '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getIn <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>In</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getIn()
   * @see #getStudent()
   * @generated
   */
  EReference getStudent_In();

  /**
   * Returns the meta object for the reference list '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getFriends <em>Friends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Friends</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getFriends()
   * @see #getStudent()
   * @generated
   */
  EReference getStudent_Friends();

  /**
   * Returns the meta object for the reference list '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getDone <em>Done</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Done</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getDone()
   * @see #getStudent()
   * @generated
   */
  EReference getStudent_Done();

  /**
   * Returns the meta object for class '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant <em>Teaching Assistant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Teaching Assistant</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant
   * @generated
   */
  EClass getTeachingAssistant();

  /**
   * Returns the meta object for the reference '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant#getRoom <em>Room</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Room</em>'.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant#getRoom()
   * @see #getTeachingAssistant()
   * @generated
   */
  EReference getTeachingAssistant_Room();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EMFStudyRightModelFactory getEMFStudyRightModelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.UniversityImpl <em>University</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.UniversityImpl
     * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.EMFStudyRightModelPackageImpl#getUniversity()
     * @generated
     */
    EClass UNIVERSITY = eINSTANCE.getUniversity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNIVERSITY__NAME = eINSTANCE.getUniversity_Name();

    /**
     * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIVERSITY__ROOMS = eINSTANCE.getUniversity_Rooms();

    /**
     * The meta object literal for the '<em><b>Students</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIVERSITY__STUDENTS = eINSTANCE.getUniversity_Students();

    /**
     * The meta object literal for the '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.RoomImpl <em>Room</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.RoomImpl
     * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.EMFStudyRightModelPackageImpl#getRoom()
     * @generated
     */
    EClass ROOM = eINSTANCE.getRoom();

    /**
     * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROOM__TOPIC = eINSTANCE.getRoom_Topic();

    /**
     * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROOM__CREDITS = eINSTANCE.getRoom_Credits();

    /**
     * The meta object literal for the '<em><b>Uni</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOM__UNI = eINSTANCE.getRoom_Uni();

    /**
     * The meta object literal for the '<em><b>Doors</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOM__DOORS = eINSTANCE.getRoom_Doors();

    /**
     * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOM__ASSIGNMENTS = eINSTANCE.getRoom_Assignments();

    /**
     * The meta object literal for the '<em><b>Students</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOM__STUDENTS = eINSTANCE.getRoom_Students();

    /**
     * The meta object literal for the '<em><b>Tas</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOM__TAS = eINSTANCE.getRoom_Tas();

    /**
     * The meta object literal for the '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.AssignmentImpl
     * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.EMFStudyRightModelPackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT__NAME = eINSTANCE.getAssignment_Name();

    /**
     * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT__POINTS = eINSTANCE.getAssignment_Points();

    /**
     * The meta object literal for the '<em><b>Room</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__ROOM = eINSTANCE.getAssignment_Room();

    /**
     * The meta object literal for the '<em><b>Students</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__STUDENTS = eINSTANCE.getAssignment_Students();

    /**
     * The meta object literal for the '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl <em>Student</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl
     * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.EMFStudyRightModelPackageImpl#getStudent()
     * @generated
     */
    EClass STUDENT = eINSTANCE.getStudent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STUDENT__NAME = eINSTANCE.getStudent_Name();

    /**
     * The meta object literal for the '<em><b>Stud Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STUDENT__STUD_ID = eINSTANCE.getStudent_StudId();

    /**
     * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STUDENT__CREDITS = eINSTANCE.getStudent_Credits();

    /**
     * The meta object literal for the '<em><b>Motivation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STUDENT__MOTIVATION = eINSTANCE.getStudent_Motivation();

    /**
     * The meta object literal for the '<em><b>Assignment Points</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STUDENT__ASSIGNMENT_POINTS = eINSTANCE.getStudent_AssignmentPoints();

    /**
     * The meta object literal for the '<em><b>Uni</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STUDENT__UNI = eINSTANCE.getStudent_Uni();

    /**
     * The meta object literal for the '<em><b>In</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STUDENT__IN = eINSTANCE.getStudent_In();

    /**
     * The meta object literal for the '<em><b>Friends</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STUDENT__FRIENDS = eINSTANCE.getStudent_Friends();

    /**
     * The meta object literal for the '<em><b>Done</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STUDENT__DONE = eINSTANCE.getStudent_Done();

    /**
     * The meta object literal for the '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.TeachingAssistantImpl <em>Teaching Assistant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.TeachingAssistantImpl
     * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.EMFStudyRightModelPackageImpl#getTeachingAssistant()
     * @generated
     */
    EClass TEACHING_ASSISTANT = eINSTANCE.getTeachingAssistant();

    /**
     * The meta object literal for the '<em><b>Room</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEACHING_ASSISTANT__ROOM = eINSTANCE.getTeachingAssistant_Room();

  }

} //EMFStudyRightModelPackage
