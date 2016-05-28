/**
 */
package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage
 * @generated
 */
public class EMFStudyRightModelSwitch<T> extends Switch<T>
{
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static EMFStudyRightModelPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EMFStudyRightModelSwitch()
   {
      if (modelPackage == null)
      {
         modelPackage = EMFStudyRightModelPackage.eINSTANCE;
      }
   }

   /**
    * Checks whether this is a switch for the given package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param ePackage the package in question.
    * @return whether this is a switch for the given package.
    * @generated
    */
   @Override
   protected boolean isSwitchFor(EPackage ePackage)
   {
      return ePackage == modelPackage;
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   @Override
   protected T doSwitch(int classifierID, EObject theEObject)
   {
      switch (classifierID)
      {
         case EMFStudyRightModelPackage.UNIVERSITY:
         {
            University university = (University)theEObject;
            T result = caseUniversity(university);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case EMFStudyRightModelPackage.STUDENT:
         {
            Student student = (Student)theEObject;
            T result = caseStudent(student);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case EMFStudyRightModelPackage.TEACHING_ASSISTANT:
         {
            TeachingAssistant teachingAssistant = (TeachingAssistant)theEObject;
            T result = caseTeachingAssistant(teachingAssistant);
            if (result == null) result = caseStudent(teachingAssistant);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case EMFStudyRightModelPackage.ROOM:
         {
            Room room = (Room)theEObject;
            T result = caseRoom(room);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case EMFStudyRightModelPackage.ASSIGNMENT:
         {
            Assignment assignment = (Assignment)theEObject;
            T result = caseAssignment(assignment);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         default: return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>University</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>University</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseUniversity(University object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Student</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Student</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseStudent(Student object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Teaching Assistant</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Teaching Assistant</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseTeachingAssistant(TeachingAssistant object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Room</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Room</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseRoom(Room object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseAssignment(Assignment object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch, but this is the last case anyway.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   @Override
   public T defaultCase(EObject object)
   {
      return null;
   }

} //EMFStudyRightModelSwitch
