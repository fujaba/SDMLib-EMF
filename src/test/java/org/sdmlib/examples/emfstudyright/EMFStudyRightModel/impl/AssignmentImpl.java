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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.AssignmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.AssignmentImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.AssignmentImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.AssignmentImpl#getStudents <em>Students</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentImpl extends MinimalEObjectImpl.Container implements Assignment
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
    * The default value of the '{@link #getPoints() <em>Points</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPoints()
    * @generated
    * @ordered
    */
   protected static final int POINTS_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getPoints() <em>Points</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPoints()
    * @generated
    * @ordered
    */
   protected int points = POINTS_EDEFAULT;

   /**
    * The cached value of the '{@link #getStudents() <em>Students</em>}' reference list.
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
   protected AssignmentImpl()
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
      return EMFStudyRightModelPackage.Literals.ASSIGNMENT;
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
         eNotify(new ENotificationImpl(this, Notification.SET, EMFStudyRightModelPackage.ASSIGNMENT__NAME, oldName, name));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getPoints()
   {
      return points;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setPoints(int newPoints)
   {
      int oldPoints = points;
      points = newPoints;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, EMFStudyRightModelPackage.ASSIGNMENT__POINTS, oldPoints, points));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Room getRoom()
   {
      if (eContainerFeatureID() != EMFStudyRightModelPackage.ASSIGNMENT__ROOM) return null;
      return (Room)eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Room basicGetRoom()
   {
      if (eContainerFeatureID() != EMFStudyRightModelPackage.ASSIGNMENT__ROOM) return null;
      return (Room)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetRoom(Room newRoom, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject)newRoom, EMFStudyRightModelPackage.ASSIGNMENT__ROOM, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRoom(Room newRoom)
   {
      if (newRoom != eInternalContainer() || (eContainerFeatureID() != EMFStudyRightModelPackage.ASSIGNMENT__ROOM && newRoom != null))
      {
         if (EcoreUtil.isAncestor(this, newRoom))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newRoom != null)
            msgs = ((InternalEObject)newRoom).eInverseAdd(this, EMFStudyRightModelPackage.ROOM__ASSIGNMENTS, Room.class, msgs);
         msgs = basicSetRoom(newRoom, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, EMFStudyRightModelPackage.ASSIGNMENT__ROOM, newRoom, newRoom));
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
         students = new EObjectWithInverseResolvingEList.ManyInverse<Student>(Student.class, this, EMFStudyRightModelPackage.ASSIGNMENT__STUDENTS, EMFStudyRightModelPackage.STUDENT__DONE);
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
         case EMFStudyRightModelPackage.ASSIGNMENT__ROOM:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetRoom((Room)otherEnd, msgs);
         case EMFStudyRightModelPackage.ASSIGNMENT__STUDENTS:
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
         case EMFStudyRightModelPackage.ASSIGNMENT__ROOM:
            return basicSetRoom(null, msgs);
         case EMFStudyRightModelPackage.ASSIGNMENT__STUDENTS:
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
   public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
   {
      switch (eContainerFeatureID())
      {
         case EMFStudyRightModelPackage.ASSIGNMENT__ROOM:
            return eInternalContainer().eInverseRemove(this, EMFStudyRightModelPackage.ROOM__ASSIGNMENTS, Room.class, msgs);
      }
      return super.eBasicRemoveFromContainerFeature(msgs);
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
         case EMFStudyRightModelPackage.ASSIGNMENT__NAME:
            return getName();
         case EMFStudyRightModelPackage.ASSIGNMENT__POINTS:
            return getPoints();
         case EMFStudyRightModelPackage.ASSIGNMENT__ROOM:
            if (resolve) return getRoom();
            return basicGetRoom();
         case EMFStudyRightModelPackage.ASSIGNMENT__STUDENTS:
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
         case EMFStudyRightModelPackage.ASSIGNMENT__NAME:
            setName((String)newValue);
            return;
         case EMFStudyRightModelPackage.ASSIGNMENT__POINTS:
            setPoints((Integer)newValue);
            return;
         case EMFStudyRightModelPackage.ASSIGNMENT__ROOM:
            setRoom((Room)newValue);
            return;
         case EMFStudyRightModelPackage.ASSIGNMENT__STUDENTS:
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
         case EMFStudyRightModelPackage.ASSIGNMENT__NAME:
            setName(NAME_EDEFAULT);
            return;
         case EMFStudyRightModelPackage.ASSIGNMENT__POINTS:
            setPoints(POINTS_EDEFAULT);
            return;
         case EMFStudyRightModelPackage.ASSIGNMENT__ROOM:
            setRoom((Room)null);
            return;
         case EMFStudyRightModelPackage.ASSIGNMENT__STUDENTS:
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
         case EMFStudyRightModelPackage.ASSIGNMENT__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case EMFStudyRightModelPackage.ASSIGNMENT__POINTS:
            return points != POINTS_EDEFAULT;
         case EMFStudyRightModelPackage.ASSIGNMENT__ROOM:
            return basicGetRoom() != null;
         case EMFStudyRightModelPackage.ASSIGNMENT__STUDENTS:
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
      result.append(", points: ");
      result.append(points);
      result.append(')');
      return result.toString();
   }

} //AssignmentImpl
