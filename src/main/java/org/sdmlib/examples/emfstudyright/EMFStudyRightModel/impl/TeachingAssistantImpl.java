/**
 */
package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Teaching Assistant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.TeachingAssistantImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.TeachingAssistantImpl#getNoOfHours <em>No Of Hours</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeachingAssistantImpl extends StudentImpl implements TeachingAssistant
{
   /**
    * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRoom()
    * @generated
    * @ordered
    */
   protected Room room;

   /**
    * The default value of the '{@link #getNoOfHours() <em>No Of Hours</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getNoOfHours()
    * @generated
    * @ordered
    */
   protected static final int NO_OF_HOURS_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getNoOfHours() <em>No Of Hours</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getNoOfHours()
    * @generated
    * @ordered
    */
   protected int noOfHours = NO_OF_HOURS_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected TeachingAssistantImpl()
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
      return EMFStudyRightModelPackage.Literals.TEACHING_ASSISTANT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Room getRoom()
   {
      if (room != null && room.eIsProxy())
      {
         InternalEObject oldRoom = (InternalEObject)room;
         room = (Room)eResolveProxy(oldRoom);
         if (room != oldRoom)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFStudyRightModelPackage.TEACHING_ASSISTANT__ROOM, oldRoom, room));
         }
      }
      return room;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Room basicGetRoom()
   {
      return room;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetRoom(Room newRoom, NotificationChain msgs)
   {
      Room oldRoom = room;
      room = newRoom;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFStudyRightModelPackage.TEACHING_ASSISTANT__ROOM, oldRoom, newRoom);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRoom(Room newRoom)
   {
      if (newRoom != room)
      {
         NotificationChain msgs = null;
         if (room != null)
            msgs = ((InternalEObject)room).eInverseRemove(this, EMFStudyRightModelPackage.ROOM__TAS, Room.class, msgs);
         if (newRoom != null)
            msgs = ((InternalEObject)newRoom).eInverseAdd(this, EMFStudyRightModelPackage.ROOM__TAS, Room.class, msgs);
         msgs = basicSetRoom(newRoom, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, EMFStudyRightModelPackage.TEACHING_ASSISTANT__ROOM, newRoom, newRoom));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getNoOfHours()
   {
      return noOfHours;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setNoOfHours(int newNoOfHours)
   {
      int oldNoOfHours = noOfHours;
      noOfHours = newNoOfHours;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, EMFStudyRightModelPackage.TEACHING_ASSISTANT__NO_OF_HOURS, oldNoOfHours, noOfHours));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case EMFStudyRightModelPackage.TEACHING_ASSISTANT__ROOM:
            if (room != null)
               msgs = ((InternalEObject)room).eInverseRemove(this, EMFStudyRightModelPackage.ROOM__TAS, Room.class, msgs);
            return basicSetRoom((Room)otherEnd, msgs);
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
         case EMFStudyRightModelPackage.TEACHING_ASSISTANT__ROOM:
            return basicSetRoom(null, msgs);
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
         case EMFStudyRightModelPackage.TEACHING_ASSISTANT__ROOM:
            if (resolve) return getRoom();
            return basicGetRoom();
         case EMFStudyRightModelPackage.TEACHING_ASSISTANT__NO_OF_HOURS:
            return getNoOfHours();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
         case EMFStudyRightModelPackage.TEACHING_ASSISTANT__ROOM:
            setRoom((Room)newValue);
            return;
         case EMFStudyRightModelPackage.TEACHING_ASSISTANT__NO_OF_HOURS:
            setNoOfHours((Integer)newValue);
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
         case EMFStudyRightModelPackage.TEACHING_ASSISTANT__ROOM:
            setRoom((Room)null);
            return;
         case EMFStudyRightModelPackage.TEACHING_ASSISTANT__NO_OF_HOURS:
            setNoOfHours(NO_OF_HOURS_EDEFAULT);
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
         case EMFStudyRightModelPackage.TEACHING_ASSISTANT__ROOM:
            return room != null;
         case EMFStudyRightModelPackage.TEACHING_ASSISTANT__NO_OF_HOURS:
            return noOfHours != NO_OF_HOURS_EDEFAULT;
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
      result.append(" (noOfHours: ");
      result.append(noOfHours);
      result.append(')');
      return result.toString();
   }

} //TeachingAssistantImpl
