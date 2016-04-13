/**
 */
package org.sdmlib.examples.emfstudyright.EMFStudyRightModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getName <em>Name</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getStudId <em>Stud Id</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getCredits <em>Credits</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getMotivation <em>Motivation</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getAssignmentPoints <em>Assignment Points</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getUni <em>Uni</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getIn <em>In</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getFriends <em>Friends</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getFriendsRev <em>Friends Rev</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getDone <em>Done</em>}</li>
 * </ul>
 *
 * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends EObject
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
    * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getStudent_Name()
    * @model unique="false"
    * @generated
    */
   String getName();

   /**
    * Sets the value of the '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
   void setName(String value);

   /**
    * Returns the value of the '<em><b>Stud Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Stud Id</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Stud Id</em>' attribute.
    * @see #setStudId(String)
    * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getStudent_StudId()
    * @model unique="false"
    * @generated
    */
   String getStudId();

   /**
    * Sets the value of the '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getStudId <em>Stud Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Stud Id</em>' attribute.
    * @see #getStudId()
    * @generated
    */
   void setStudId(String value);

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
    * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getStudent_Credits()
    * @model unique="false"
    * @generated
    */
   int getCredits();

   /**
    * Sets the value of the '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getCredits <em>Credits</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Credits</em>' attribute.
    * @see #getCredits()
    * @generated
    */
   void setCredits(int value);

   /**
    * Returns the value of the '<em><b>Motivation</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Motivation</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Motivation</em>' attribute.
    * @see #setMotivation(int)
    * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getStudent_Motivation()
    * @model unique="false"
    * @generated
    */
   int getMotivation();

   /**
    * Sets the value of the '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getMotivation <em>Motivation</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Motivation</em>' attribute.
    * @see #getMotivation()
    * @generated
    */
   void setMotivation(int value);

   /**
    * Returns the value of the '<em><b>Assignment Points</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Assignment Points</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Assignment Points</em>' attribute.
    * @see #setAssignmentPoints(int)
    * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getStudent_AssignmentPoints()
    * @model unique="false"
    * @generated
    */
   int getAssignmentPoints();

   /**
    * Sets the value of the '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getAssignmentPoints <em>Assignment Points</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Assignment Points</em>' attribute.
    * @see #getAssignmentPoints()
    * @generated
    */
   void setAssignmentPoints(int value);

   /**
    * Returns the value of the '<em><b>Uni</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University#getStudents <em>Students</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Uni</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Uni</em>' container reference.
    * @see #setUni(University)
    * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getStudent_Uni()
    * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University#getStudents
    * @model opposite="students" transient="false"
    * @generated
    */
   University getUni();

   /**
    * Sets the value of the '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getUni <em>Uni</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Uni</em>' container reference.
    * @see #getUni()
    * @generated
    */
   void setUni(University value);

   /**
    * Returns the value of the '<em><b>In</b></em>' reference.
    * It is bidirectional and its opposite is '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getStudents <em>Students</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>In</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>In</em>' reference.
    * @see #setIn(Room)
    * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getStudent_In()
    * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getStudents
    * @model opposite="students"
    * @generated
    */
   Room getIn();

   /**
    * Sets the value of the '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getIn <em>In</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>In</em>' reference.
    * @see #getIn()
    * @generated
    */
   void setIn(Room value);

   /**
    * Returns the value of the '<em><b>Friends</b></em>' reference list.
    * The list contents are of type {@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student}.
    * It is bidirectional and its opposite is '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getFriendsRev <em>Friends Rev</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Friends</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Friends</em>' reference list.
    * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getStudent_Friends()
    * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getFriendsRev
    * @model opposite="friendsRev"
    * @generated
    */
   EList<Student> getFriends();

   /**
    * Returns the value of the '<em><b>Friends Rev</b></em>' reference list.
    * The list contents are of type {@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student}.
    * It is bidirectional and its opposite is '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getFriends <em>Friends</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Friends Rev</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Friends Rev</em>' reference list.
    * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getStudent_FriendsRev()
    * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getFriends
    * @model opposite="friends"
    * @generated
    */
   EList<Student> getFriendsRev();

   /**
    * Returns the value of the '<em><b>Done</b></em>' reference list.
    * The list contents are of type {@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment}.
    * It is bidirectional and its opposite is '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment#getStudents <em>Students</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Done</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Done</em>' reference list.
    * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getStudent_Done()
    * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment#getStudents
    * @model opposite="students"
    * @generated
    */
   EList<Assignment> getDone();

} // Student
