/**
 */
package org.sdmlib.examples.emfstudyright.EMFStudyRightModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.RoomSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.AssignmentSet;
import java.util.LinkedHashSet;

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
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getAssignments <em>Assignments</em>}</li>
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


   
   //==========================================================================
   
   public static final String PROPERTY_TOPIC = "topic";
   
   public Room withTopic(String value);

   
   //==========================================================================
   
   public static final String PROPERTY_CREDITS = "credits";
   
   public Room withCredits(int value);

   

   
   /********************************************************************
    * <pre>
    *              many                       one
    * Room ----------------------------------- University
    *              rooms                   uni
    * </pre>
    */
   
   public static final String PROPERTY_UNI = "uni";

   public Room withUni(University value);

   public University createUni();

   
   public static final RoomSet EMPTY_SET = new RoomSet();

   
   /********************************************************************
    * <pre>
    *              one                       many
    * Room ----------------------------------- Assignment
    *              room                   assignments
    * </pre>
    */
   
   public static final String PROPERTY_ASSIGNMENTS = "assignments";

   boolean addToAssignments(Assignment value);

   boolean removeFromAssignments(Assignment value);

   public Room withAssignments(Assignment... value);

   public Room withoutAssignments(Assignment... value);

   public void removeAllFromAssignments();

   public Assignment createAssignments();
} // Room

