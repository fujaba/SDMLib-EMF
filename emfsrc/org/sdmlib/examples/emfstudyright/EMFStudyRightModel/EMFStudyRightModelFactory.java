/**
 */
package org.sdmlib.examples.emfstudyright.EMFStudyRightModel;

import org.eclipse.emf.ecore.EFactory;


/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage
 * @generated
 */
public interface EMFStudyRightModelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EMFStudyRightModelFactory eINSTANCE = org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.EMFStudyRightModelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>University</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>University</em>'.
   * @generated
   */
  University createUniversity();

  /**
   * Returns a new object of class '<em>Student</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Student</em>'.
   * @generated
   */
  Student createStudent();

  /**
   * Returns a new object of class '<em>Teaching Assistant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Teaching Assistant</em>'.
   * @generated
   */
  TeachingAssistant createTeachingAssistant();

  /**
   * Returns a new object of class '<em>Room</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Room</em>'.
   * @generated
   */
  Room createRoom();

  /**
   * Returns a new object of class '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment</em>'.
   * @generated
   */
  Assignment createAssignment();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EMFStudyRightModelPackage getEMFStudyRightModelPackage();

} //EMFStudyRightModelFactory
