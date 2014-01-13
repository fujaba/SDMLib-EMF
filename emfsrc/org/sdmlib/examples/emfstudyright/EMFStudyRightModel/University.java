/**
 */
package org.sdmlib.examples.emfstudyright.EMFStudyRightModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University#getName <em>Name</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University#getRooms <em>Rooms</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University#getStudents <em>Students</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getUniversity()
 * @model
 * @generated
 */
public interface University extends EObject
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
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getUniversity_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
   * The list contents are of type {@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room}.
   * It is bidirectional and its opposite is '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getUni <em>Uni</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rooms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rooms</em>' containment reference list.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getUniversity_Rooms()
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room#getUni
   * @model opposite="uni" containment="true"
   * @generated
   */
  EList<Room> getRooms();

  /**
   * Returns the value of the '<em><b>Students</b></em>' containment reference list.
   * The list contents are of type {@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student}.
   * It is bidirectional and its opposite is '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getUni <em>Uni</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Students</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Students</em>' containment reference list.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#getUniversity_Students()
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student#getUni
   * @model opposite="uni" containment="true"
   * @generated
   */
  EList<Student> getStudents();


   
   //==========================================================================
   
   public static final String PROPERTY_NAME = "name";
   
   public University withName(String value);

} // University

