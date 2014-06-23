/**
 */
package org.sdmlib.examples.emfstudyright.EMFStudyRightModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.sdmlib.StrUtil;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.TeachingAssistantImpl;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.StudentSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.AssignmentSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment#getName <em>Name</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment#getPoints <em>Points</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment#getRoom <em>Room</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment#getStudents <em>Students</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getAssignment_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Points</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Points</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Points</em>' attribute.
   * @see #setPoints(int)
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getAssignment_Points()
   * @model unique="false"
   * @generated
   */
  int getPoints();

  /**
   * Sets the value of the '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment#getPoints <em>Points</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Points</em>' attribute.
   * @see #getPoints()
   * @generated
   */
  void setPoints(int value);

  /**
   * Returns the value of the '<em><b>Room</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getAssignments <em>Assignments</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Room</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Room</em>' container reference.
   * @see #setRoom(Room)
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getAssignment_Room()
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getAssignments
   * @model opposite="assignments" transient="false"
   * @generated
   */
  Room getRoom();

  /**
   * Sets the value of the '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment#getRoom <em>Room</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Room</em>' container reference.
   * @see #getRoom()
   * @generated
   */
  void setRoom(Room value);

  /**
   * Returns the value of the '<em><b>Students</b></em>' reference list.
   * The list contents are of type {@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student}.
   * It is bidirectional and its opposite is '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getDone <em>Done</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Students</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Students</em>' reference list.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getAssignment_Students()
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getDone
   * @model opposite="done"
   * @generated
   */
  EList<Student> getStudents();


   
   //==========================================================================
   
   public static final String PROPERTY_NAME = "name";
   
   public Assignment withName(String value);

   
   //==========================================================================
   
   public static final String PROPERTY_POINTS = "points";
   
   public Assignment withPoints(int value);

   public StudentSet getStudentsSet();

   public Assignment withStudents(Student... value);

   public Assignment withoutStudents(Student... value);

   public Student createStudents();

   public StudentImpl createStudentsStudentImpl();

   public TeachingAssistantImpl createStudentsTeachingAssistantImpl();

   
   public static final AssignmentSet EMPTY_SET = new AssignmentSet().withReadonly(true);

   public Assignment withRoom(Room value);

   
   /********************************************************************
    * <pre>
    *              many                       one
    * Assignment ----------------------------------- Room
    *              assignments                   room
    * </pre>
    */
   
   public static final String PROPERTY_ROOM = "room";

   
   /********************************************************************
    * <pre>
    *              many                       many
    * Assignment ----------------------------------- Student
    *              done                   students
    * </pre>
    */
   
   public static final String PROPERTY_STUDENTS = "students";
} // Assignment
