/**
 */
package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFStudyRightModelFactoryImpl extends EFactoryImpl implements EMFStudyRightModelFactory
{
  /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
    * @generated
    */
  public static EMFStudyRightModelFactory init()
  {
      try
      {
         EMFStudyRightModelFactory theEMFStudyRightModelFactory = (EMFStudyRightModelFactory)EPackage.Registry.INSTANCE.getEFactory(EMFStudyRightModelPackage.eNS_URI);
         if (theEMFStudyRightModelFactory != null)
         {
            return theEMFStudyRightModelFactory;
         }
      }
      catch (Exception exception)
      {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new EMFStudyRightModelFactoryImpl();
   }

  /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
    * @generated
    */
  public EMFStudyRightModelFactoryImpl()
  {
      super();
   }

  /**
    * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
    * @generated
    */
  @Override
  public EObject create(EClass eClass)
  {
      switch (eClass.getClassifierID())
      {
         case EMFStudyRightModelPackage.UNIVERSITY: return createUniversity();
         case EMFStudyRightModelPackage.STUDENT: return createStudent();
         case EMFStudyRightModelPackage.TEACHING_ASSISTANT: return createTeachingAssistant();
         case EMFStudyRightModelPackage.ROOM: return createRoom();
         case EMFStudyRightModelPackage.ASSIGNMENT: return createAssignment();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

  /**
    * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
    * @generated
    */
  public University createUniversity()
  {
      UniversityImpl university = new UniversityImpl();
      return university;
   }

  /**
    * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
    * @generated
    */
  public Student createStudent()
  {
      StudentImpl student = new StudentImpl();
      return student;
   }

  /**
    * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
    * @generated
    */
  public TeachingAssistant createTeachingAssistant()
  {
      TeachingAssistantImpl teachingAssistant = new TeachingAssistantImpl();
      return teachingAssistant;
   }

  /**
    * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
    * @generated
    */
  public Room createRoom()
  {
      RoomImpl room = new RoomImpl();
      return room;
   }

  /**
    * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
    * @generated
    */
  public Assignment createAssignment()
  {
      AssignmentImpl assignment = new AssignmentImpl();
      return assignment;
   }

  /**
    * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
    * @generated
    */
  public EMFStudyRightModelPackage getEMFStudyRightModelPackage()
  {
      return (EMFStudyRightModelPackage)getEPackage();
   }

  /**
    * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
  @Deprecated
  public static EMFStudyRightModelPackage getPackage()
  {
      return EMFStudyRightModelPackage.eINSTANCE;
   }

} //EMFStudyRightModelFactoryImpl
