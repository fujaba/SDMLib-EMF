/**
 */
package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.UniversityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.UniversityImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.UniversityImpl#getStudents <em>Students</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniversityImpl extends MinimalEObjectImpl.Container implements University
{
   /**
    * The default value of the '{@link #getName() <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getName()
    * @generated
    * @ordered
    */
   protected static final String NAME_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getName()
    * @generated
    * @ordered
    */
   protected String name = NAME_EDEFAULT;

   /**
    * The cached value of the '{@link #getRooms() <em>Rooms</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRooms()
    * @generated
    * @ordered
    */
   protected EList<Room> rooms;

   /**
    * The cached value of the '{@link #getStudents() <em>Students</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getStudents()
    * @generated
    * @ordered
    */
   protected EList<Student> students;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected UniversityImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass()
   {
      return EMFStudyRightModelPackage.Literals.UNIVERSITY;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getName()
   {
      return name;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setName(String newName)
   {
      String oldName = name;
      name = newName;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, EMFStudyRightModelPackage.UNIVERSITY__NAME, oldName, name));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Room> getRooms()
   {
      if (rooms == null)
      {
         rooms = new EObjectContainmentWithInverseEList<Room>(Room.class, this, EMFStudyRightModelPackage.UNIVERSITY__ROOMS, EMFStudyRightModelPackage.ROOM__UNI);
      }
      return rooms;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Student> getStudents()
   {
      if (students == null)
      {
         students = new EObjectContainmentWithInverseEList<Student>(Student.class, this, EMFStudyRightModelPackage.UNIVERSITY__STUDENTS, EMFStudyRightModelPackage.STUDENT__UNI);
      }
      return students;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case EMFStudyRightModelPackage.UNIVERSITY__ROOMS:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getRooms()).basicAdd(otherEnd, msgs);
         case EMFStudyRightModelPackage.UNIVERSITY__STUDENTS:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getStudents()).basicAdd(otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case EMFStudyRightModelPackage.UNIVERSITY__ROOMS:
            return ((InternalEList<?>)getRooms()).basicRemove(otherEnd, msgs);
         case EMFStudyRightModelPackage.UNIVERSITY__STUDENTS:
            return ((InternalEList<?>)getStudents()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
         case EMFStudyRightModelPackage.UNIVERSITY__NAME:
            return getName();
         case EMFStudyRightModelPackage.UNIVERSITY__ROOMS:
            return getRooms();
         case EMFStudyRightModelPackage.UNIVERSITY__STUDENTS:
            return getStudents();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
         case EMFStudyRightModelPackage.UNIVERSITY__NAME:
            setName((String)newValue);
            return;
         case EMFStudyRightModelPackage.UNIVERSITY__ROOMS:
            getRooms().clear();
            getRooms().addAll((Collection<? extends Room>)newValue);
            return;
         case EMFStudyRightModelPackage.UNIVERSITY__STUDENTS:
            getStudents().clear();
            getStudents().addAll((Collection<? extends Student>)newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset(int featureID)
   {
      switch (featureID)
      {
         case EMFStudyRightModelPackage.UNIVERSITY__NAME:
            setName(NAME_EDEFAULT);
            return;
         case EMFStudyRightModelPackage.UNIVERSITY__ROOMS:
            getRooms().clear();
            return;
         case EMFStudyRightModelPackage.UNIVERSITY__STUDENTS:
            getStudents().clear();
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet(int featureID)
   {
      switch (featureID)
      {
         case EMFStudyRightModelPackage.UNIVERSITY__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case EMFStudyRightModelPackage.UNIVERSITY__ROOMS:
            return rooms != null && !rooms.isEmpty();
         case EMFStudyRightModelPackage.UNIVERSITY__STUDENTS:
            return students != null && !students.isEmpty();
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString()
   {
      if (eIsProxy()) return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (name: ");
      result.append(name);
      result.append(')');
      return result.toString();
   }

} //UniversityImpl
