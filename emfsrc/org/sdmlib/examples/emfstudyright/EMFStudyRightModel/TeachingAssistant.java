/**
 */
package org.sdmlib.examples.emfstudyright.EMFStudyRightModel;

import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.TeachingAssistantSet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Teaching Assistant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant#getRoom <em>Room</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getTeachingAssistant()
 * @model
 * @generated
 */
public interface TeachingAssistant extends Student
{
  /**
   * Returns the value of the '<em><b>Room</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getTas <em>Tas</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Room</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Room</em>' reference.
   * @see #setRoom(Room)
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getTeachingAssistant_Room()
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getTas
   * @model opposite="tas"
   * @generated
   */
  Room getRoom();

  /**
   * Sets the value of the '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant#getRoom <em>Room</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Room</em>' reference.
   * @see #getRoom()
   * @generated
   */
  void setRoom(Room value);


   
   public static final TeachingAssistantSet EMPTY_SET = new TeachingAssistantSet();

   public TeachingAssistant withRoom(Room value);

   public Room createRoom();

   
   /********************************************************************
    * <pre>
    *              many                       one
    * TeachingAssistant ----------------------------------- Room
    *              tas                   room
    * </pre>
    */
   
   public static final String PROPERTY_ROOM = "room";
} // TeachingAssistant

