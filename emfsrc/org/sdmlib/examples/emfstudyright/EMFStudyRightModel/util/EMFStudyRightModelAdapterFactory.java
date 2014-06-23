/**
 */
package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage
 * @generated
 */
public class EMFStudyRightModelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EMFStudyRightModelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMFStudyRightModelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EMFStudyRightModelPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMFStudyRightModelSwitch<Adapter> modelSwitch =
    new EMFStudyRightModelSwitch<Adapter>()
    {
      @Override
      public Adapter caseUniversity(University object)
      {
        return createUniversityAdapter();
      }
      @Override
      public Adapter caseStudent(Student object)
      {
        return createStudentAdapter();
      }
      @Override
      public Adapter caseTeachingAssistant(TeachingAssistant object)
      {
        return createTeachingAssistantAdapter();
      }
      @Override
      public Adapter caseRoom(Room object)
      {
        return createRoomAdapter();
      }
      @Override
      public Adapter caseAssignment(Assignment object)
      {
        return createAssignmentAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University <em>University</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University
   * @generated
   */
  public Adapter createUniversityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student <em>Student</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student
   * @generated
   */
  public Adapter createStudentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant <em>Teaching Assistant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant
   * @generated
   */
  public Adapter createTeachingAssistantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room <em>Room</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room
   * @generated
   */
  public Adapter createRoomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment
   * @generated
   */
  public Adapter createAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //EMFStudyRightModelAdapterFactory
