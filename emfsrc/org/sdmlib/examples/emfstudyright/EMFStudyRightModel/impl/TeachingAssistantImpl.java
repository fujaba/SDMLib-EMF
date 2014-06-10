/**
 */
package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;

import de.uniks.networkparser.json.JsonIdMap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Teaching Assistant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.TeachingAssistantImpl#getRoom <em>Room</em>}</li>
 * </ul>
 * </p>
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
    }
    return super.eIsSet(featureID);
  }


   
   //==========================================================================
   
   public Object get(String attrName)
   {
      if (PROPERTY_ROOM.equalsIgnoreCase(attrName))
      {
         return getRoom();
      }

      if (PROPERTY_NAME.equalsIgnoreCase(attrName))
      {
         return getName();
      }

      if (PROPERTY_STUDID.equalsIgnoreCase(attrName))
      {
         return getStudId();
      }

      if (PROPERTY_CREDITS.equalsIgnoreCase(attrName))
      {
         return getCredits();
      }

      if (PROPERTY_MOTIVATION.equalsIgnoreCase(attrName))
      {
         return getMotivation();
      }

      if (PROPERTY_ASSIGNMENTPOINTS.equalsIgnoreCase(attrName))
      {
         return getAssignmentPoints();
      }

      if (PROPERTY_UNI.equalsIgnoreCase(attrName))
      {
         return getUni();
      }

      if (PROPERTY_IN.equalsIgnoreCase(attrName))
      {
         return getIn();
      }

      if (PROPERTY_FRIENDS.equalsIgnoreCase(attrName))
      {
         return getFriends();
      }

      if (PROPERTY_DONE.equalsIgnoreCase(attrName))
      {
         return getDone();
      }

      return null;
   }

   
   //==========================================================================
   
   public boolean set(String attrName, Object value)
   {
      if (PROPERTY_ROOM.equalsIgnoreCase(attrName))
      {
         setRoom((Room) value);
         return true;
      }

      if (PROPERTY_NAME.equalsIgnoreCase(attrName))
      {
         setName((String) value);
         return true;
      }

      if (PROPERTY_STUDID.equalsIgnoreCase(attrName))
      {
         setStudId((String) value);
         return true;
      }

      if (PROPERTY_CREDITS.equalsIgnoreCase(attrName))
      {
         setCredits(Integer.parseInt(value.toString()));
         return true;
      }

      if (PROPERTY_MOTIVATION.equalsIgnoreCase(attrName))
      {
         setMotivation(Integer.parseInt(value.toString()));
         return true;
      }

      if (PROPERTY_ASSIGNMENTPOINTS.equalsIgnoreCase(attrName))
      {
         setAssignmentPoints(Integer.parseInt(value.toString()));
         return true;
      }

      if (PROPERTY_UNI.equalsIgnoreCase(attrName))
      {
         setUni((University) value);
         return true;
      }

      if (PROPERTY_IN.equalsIgnoreCase(attrName))
      {
         setIn((Room) value);
         return true;
      }

      if (PROPERTY_FRIENDS.equalsIgnoreCase(attrName))
      {
         addToFriends((Student) value);
         return true;
      }
      
      if ((PROPERTY_FRIENDS + JsonIdMap.REMOVE).equalsIgnoreCase(attrName))
      {
         removeFromFriends((Student) value);
         return true;
      }

      if (PROPERTY_DONE.equalsIgnoreCase(attrName))
      {
         addToDone((Assignment) value);
         return true;
      }
      
      if ((PROPERTY_DONE + JsonIdMap.REMOVE).equalsIgnoreCase(attrName))
      {
         removeFromDone((Assignment) value);
         return true;
      }

      return false;
   }

   
   //==========================================================================
   
   protected PropertyChangeSupport listeners = new PropertyChangeSupport(this);
   
   public PropertyChangeSupport getPropertyChangeSupport()
   {
      return listeners;
   }
   
   public void addPropertyChangeListener(PropertyChangeListener listener) 
   {
      getPropertyChangeSupport().addPropertyChangeListener(listener);
   }

   
   //==========================================================================
   
   public void removeYou()
   {
      setRoom(null);
      setUni(null);
      setIn(null);
      removeAllFromFriends();
      removeAllFromDone();
      getPropertyChangeSupport().firePropertyChange("REMOVE_YOU", this, null);
   }

   
   /********************************************************************
    * <pre>
    *              many                       one
    * TeachingAssistant ----------------------------------- Room
    *              tas                   room
    * </pre>
    */
   
   public static final String PROPERTY_ROOM = "room";

   public TeachingAssistant withRoom(Room value)
   {
      setRoom(value);
      return this;
   } 

   public Room createRoom()
   {
      Room value = new RoomImpl();
      withRoom(value);
      return value;
   } 

   public String toString()
   {
      StringBuilder _ = new StringBuilder();
      
      _.append(" ").append(this.getName());
      _.append(" ").append(this.getStudId());
      _.append(" ").append(this.getCredits());
      _.append(" ").append(this.getMotivation());
      _.append(" ").append(this.getAssignmentPoints());
      return _.substring(1);
   }

} //TeachingAssistantImpl

