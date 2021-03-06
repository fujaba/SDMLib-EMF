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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.RoomImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.RoomImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.RoomImpl#getUni <em>Uni</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.RoomImpl#getDoors <em>Doors</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.RoomImpl#getDoorsRev <em>Doors Rev</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.RoomImpl#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.RoomImpl#getStudents <em>Students</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.RoomImpl#getTas <em>Tas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room
{
   /**
    * The default value of the '{@link #getTopic() <em>Topic</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTopic()
    * @generated
    * @ordered
    */
   protected static final String TOPIC_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getTopic() <em>Topic</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTopic()
    * @generated
    * @ordered
    */
   protected String topic = TOPIC_EDEFAULT;

   /**
    * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getCredits()
    * @generated
    * @ordered
    */
   protected static final int CREDITS_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getCredits() <em>Credits</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getCredits()
    * @generated
    * @ordered
    */
   protected int credits = CREDITS_EDEFAULT;

   /**
    * The cached value of the '{@link #getDoors() <em>Doors</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getDoors()
    * @generated
    * @ordered
    */
   protected EList<Room> doors;

   /**
    * The cached value of the '{@link #getDoorsRev() <em>Doors Rev</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getDoorsRev()
    * @generated
    * @ordered
    */
   protected EList<Room> doorsRev;

   /**
    * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAssignments()
    * @generated
    * @ordered
    */
   protected EList<Assignment> assignments;

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
    * The cached value of the '{@link #getTas() <em>Tas</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTas()
    * @generated
    * @ordered
    */
   protected EList<TeachingAssistant> tas;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected RoomImpl()
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
      return EMFStudyRightModelPackage.Literals.ROOM;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getTopic()
   {
      return topic;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setTopic(String newTopic)
   {
      String oldTopic = topic;
      topic = newTopic;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, EMFStudyRightModelPackage.ROOM__TOPIC, oldTopic, topic));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getCredits()
   {
      return credits;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setCredits(int newCredits)
   {
      int oldCredits = credits;
      credits = newCredits;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, EMFStudyRightModelPackage.ROOM__CREDITS, oldCredits, credits));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public University getUni()
   {
      if (eContainerFeatureID() != EMFStudyRightModelPackage.ROOM__UNI) return null;
      return (University)eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public University basicGetUni()
   {
      if (eContainerFeatureID() != EMFStudyRightModelPackage.ROOM__UNI) return null;
      return (University)eInternalContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetUni(University newUni, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject)newUni, EMFStudyRightModelPackage.ROOM__UNI, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setUni(University newUni)
   {
      if (newUni != eInternalContainer() || (eContainerFeatureID() != EMFStudyRightModelPackage.ROOM__UNI && newUni != null))
      {
         if (EcoreUtil.isAncestor(this, newUni))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newUni != null)
            msgs = ((InternalEObject)newUni).eInverseAdd(this, EMFStudyRightModelPackage.UNIVERSITY__ROOMS, University.class, msgs);
         msgs = basicSetUni(newUni, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, EMFStudyRightModelPackage.ROOM__UNI, newUni, newUni));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Room> getDoors()
   {
      if (doors == null)
      {
         doors = new EObjectWithInverseResolvingEList.ManyInverse<Room>(Room.class, this, EMFStudyRightModelPackage.ROOM__DOORS, EMFStudyRightModelPackage.ROOM__DOORS_REV);
      }
      return doors;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Room> getDoorsRev()
   {
      if (doorsRev == null)
      {
         doorsRev = new EObjectWithInverseResolvingEList.ManyInverse<Room>(Room.class, this, EMFStudyRightModelPackage.ROOM__DOORS_REV, EMFStudyRightModelPackage.ROOM__DOORS);
      }
      return doorsRev;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Assignment> getAssignments()
   {
      if (assignments == null)
      {
         assignments = new EObjectContainmentWithInverseEList<Assignment>(Assignment.class, this, EMFStudyRightModelPackage.ROOM__ASSIGNMENTS, EMFStudyRightModelPackage.ASSIGNMENT__ROOM);
      }
      return assignments;
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
         students = new EObjectWithInverseResolvingEList<Student>(Student.class, this, EMFStudyRightModelPackage.ROOM__STUDENTS, EMFStudyRightModelPackage.STUDENT__IN);
      }
      return students;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<TeachingAssistant> getTas()
   {
      if (tas == null)
      {
         tas = new EObjectWithInverseResolvingEList<TeachingAssistant>(TeachingAssistant.class, this, EMFStudyRightModelPackage.ROOM__TAS, EMFStudyRightModelPackage.TEACHING_ASSISTANT__ROOM);
      }
      return tas;
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
         case EMFStudyRightModelPackage.ROOM__UNI:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetUni((University)otherEnd, msgs);
         case EMFStudyRightModelPackage.ROOM__DOORS:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getDoors()).basicAdd(otherEnd, msgs);
         case EMFStudyRightModelPackage.ROOM__DOORS_REV:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getDoorsRev()).basicAdd(otherEnd, msgs);
         case EMFStudyRightModelPackage.ROOM__ASSIGNMENTS:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignments()).basicAdd(otherEnd, msgs);
         case EMFStudyRightModelPackage.ROOM__STUDENTS:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getStudents()).basicAdd(otherEnd, msgs);
         case EMFStudyRightModelPackage.ROOM__TAS:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getTas()).basicAdd(otherEnd, msgs);
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
         case EMFStudyRightModelPackage.ROOM__UNI:
            return basicSetUni(null, msgs);
         case EMFStudyRightModelPackage.ROOM__DOORS:
            return ((InternalEList<?>)getDoors()).basicRemove(otherEnd, msgs);
         case EMFStudyRightModelPackage.ROOM__DOORS_REV:
            return ((InternalEList<?>)getDoorsRev()).basicRemove(otherEnd, msgs);
         case EMFStudyRightModelPackage.ROOM__ASSIGNMENTS:
            return ((InternalEList<?>)getAssignments()).basicRemove(otherEnd, msgs);
         case EMFStudyRightModelPackage.ROOM__STUDENTS:
            return ((InternalEList<?>)getStudents()).basicRemove(otherEnd, msgs);
         case EMFStudyRightModelPackage.ROOM__TAS:
            return ((InternalEList<?>)getTas()).basicRemove(otherEnd, msgs);
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
         case EMFStudyRightModelPackage.ROOM__UNI:
            return eInternalContainer().eInverseRemove(this, EMFStudyRightModelPackage.UNIVERSITY__ROOMS, University.class, msgs);
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
         case EMFStudyRightModelPackage.ROOM__TOPIC:
            return getTopic();
         case EMFStudyRightModelPackage.ROOM__CREDITS:
            return getCredits();
         case EMFStudyRightModelPackage.ROOM__UNI:
            if (resolve) return getUni();
            return basicGetUni();
         case EMFStudyRightModelPackage.ROOM__DOORS:
            return getDoors();
         case EMFStudyRightModelPackage.ROOM__DOORS_REV:
            return getDoorsRev();
         case EMFStudyRightModelPackage.ROOM__ASSIGNMENTS:
            return getAssignments();
         case EMFStudyRightModelPackage.ROOM__STUDENTS:
            return getStudents();
         case EMFStudyRightModelPackage.ROOM__TAS:
            return getTas();
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
         case EMFStudyRightModelPackage.ROOM__TOPIC:
            setTopic((String)newValue);
            return;
         case EMFStudyRightModelPackage.ROOM__CREDITS:
            setCredits((Integer)newValue);
            return;
         case EMFStudyRightModelPackage.ROOM__UNI:
            setUni((University)newValue);
            return;
         case EMFStudyRightModelPackage.ROOM__DOORS:
            getDoors().clear();
            getDoors().addAll((Collection<? extends Room>)newValue);
            return;
         case EMFStudyRightModelPackage.ROOM__DOORS_REV:
            getDoorsRev().clear();
            getDoorsRev().addAll((Collection<? extends Room>)newValue);
            return;
         case EMFStudyRightModelPackage.ROOM__ASSIGNMENTS:
            getAssignments().clear();
            getAssignments().addAll((Collection<? extends Assignment>)newValue);
            return;
         case EMFStudyRightModelPackage.ROOM__STUDENTS:
            getStudents().clear();
            getStudents().addAll((Collection<? extends Student>)newValue);
            return;
         case EMFStudyRightModelPackage.ROOM__TAS:
            getTas().clear();
            getTas().addAll((Collection<? extends TeachingAssistant>)newValue);
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
         case EMFStudyRightModelPackage.ROOM__TOPIC:
            setTopic(TOPIC_EDEFAULT);
            return;
         case EMFStudyRightModelPackage.ROOM__CREDITS:
            setCredits(CREDITS_EDEFAULT);
            return;
         case EMFStudyRightModelPackage.ROOM__UNI:
            setUni((University)null);
            return;
         case EMFStudyRightModelPackage.ROOM__DOORS:
            getDoors().clear();
            return;
         case EMFStudyRightModelPackage.ROOM__DOORS_REV:
            getDoorsRev().clear();
            return;
         case EMFStudyRightModelPackage.ROOM__ASSIGNMENTS:
            getAssignments().clear();
            return;
         case EMFStudyRightModelPackage.ROOM__STUDENTS:
            getStudents().clear();
            return;
         case EMFStudyRightModelPackage.ROOM__TAS:
            getTas().clear();
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
         case EMFStudyRightModelPackage.ROOM__TOPIC:
            return TOPIC_EDEFAULT == null ? topic != null : !TOPIC_EDEFAULT.equals(topic);
         case EMFStudyRightModelPackage.ROOM__CREDITS:
            return credits != CREDITS_EDEFAULT;
         case EMFStudyRightModelPackage.ROOM__UNI:
            return basicGetUni() != null;
         case EMFStudyRightModelPackage.ROOM__DOORS:
            return doors != null && !doors.isEmpty();
         case EMFStudyRightModelPackage.ROOM__DOORS_REV:
            return doorsRev != null && !doorsRev.isEmpty();
         case EMFStudyRightModelPackage.ROOM__ASSIGNMENTS:
            return assignments != null && !assignments.isEmpty();
         case EMFStudyRightModelPackage.ROOM__STUDENTS:
            return students != null && !students.isEmpty();
         case EMFStudyRightModelPackage.ROOM__TAS:
            return tas != null && !tas.isEmpty();
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
      result.append(" (topic: ");
      result.append(topic);
      result.append(", credits: ");
      result.append(credits);
      result.append(')');
      return result.toString();
   }

} //RoomImpl
