/**
 */
package org.sdmlib.examples.emfstudyright.EMFStudyRightModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getCredits <em>Credits</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getUni <em>Uni</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getDoors <em>Doors</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getDoorsRev <em>Doors Rev</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getStudents <em>Students</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getTas <em>Tas</em>}</li>
 * </ul>
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
    * It is bidirectional and its opposite is '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getDoorsRev <em>Doors Rev</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Doors</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Doors</em>' reference list.
    * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getRoom_Doors()
    * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getDoorsRev
    * @model opposite="doorsRev"
    * @generated
    */
   EList<Room> getDoors();

   /**
    * Returns the value of the '<em><b>Doors Rev</b></em>' reference list.
    * The list contents are of type {@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room}.
    * It is bidirectional and its opposite is '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getDoors <em>Doors</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Doors Rev</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Doors Rev</em>' reference list.
    * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getRoom_DoorsRev()
    * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getDoors
    * @model opposite="doors"
    * @generated
    */
   EList<Room> getDoorsRev();

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

} // Room
