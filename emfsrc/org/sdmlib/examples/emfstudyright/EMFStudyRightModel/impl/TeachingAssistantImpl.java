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
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;
import org.sdmlib.StrUtil;
import org.sdmlib.serialization.PropertyChangeInterface;

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
public class TeachingAssistantImpl extends StudentImpl implements TeachingAssistant, PropertyChangeInterface
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
   
   protected PropertyChangeSupport listeners = new PropertyChangeSupport(this);
   
   @Override
   public PropertyChangeSupport getPropertyChangeSupport()
   {
      return listeners;
   }
   
   public void addPropertyChangeListener(PropertyChangeListener listener) 
   {
      getPropertyChangeSupport().addPropertyChangeListener(listener);
   }

   
   //==========================================================================
   
   private String name;

   public String getName()
   {
      return this.name;
   }
   
   public void setName(String value)
   {
      if ( ! StrUtil.stringEquals(this.name, value))
      {
         String oldValue = this.name;
         this.name = value;
         getPropertyChangeSupport().firePropertyChange(PROPERTY_NAME, oldValue, value);
      }
   }
   
   public Student withName(String value)
   {
      setName(value);
      return this;
   } 


   @Override
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


   
   //==========================================================================
   
   private String studId;

   public String getStudId()
   {
      return this.studId;
   }
   
   public void setStudId(String value)
   {
      if ( ! StrUtil.stringEquals(this.studId, value))
      {
         String oldValue = this.studId;
         this.studId = value;
         getPropertyChangeSupport().firePropertyChange(PROPERTY_STUDID, oldValue, value);
      }
   }
   
   public Student withStudId(String value)
   {
      setStudId(value);
      return this;
   } 

   
   //==========================================================================
   
   private int credits;

   public int getCredits()
   {
      return this.credits;
   }
   
   public void setCredits(int value)
   {
      if (this.credits != value)
      {
         int oldValue = this.credits;
         this.credits = value;
         getPropertyChangeSupport().firePropertyChange(PROPERTY_CREDITS, oldValue, value);
      }
   }
   
   public Student withCredits(int value)
   {
      setCredits(value);
      return this;
   } 

   
   //==========================================================================
   
   private int motivation;

   public int getMotivation()
   {
      return this.motivation;
   }
   
   public void setMotivation(int value)
   {
      if (this.motivation != value)
      {
         int oldValue = this.motivation;
         this.motivation = value;
         getPropertyChangeSupport().firePropertyChange(PROPERTY_MOTIVATION, oldValue, value);
      }
   }
   
   public Student withMotivation(int value)
   {
      setMotivation(value);
      return this;
   } 

   
   //==========================================================================
   
   private int assignmentPoints;

   public int getAssignmentPoints()
   {
      return this.assignmentPoints;
   }
   
   public void setAssignmentPoints(int value)
   {
      if (this.assignmentPoints != value)
      {
         int oldValue = this.assignmentPoints;
         this.assignmentPoints = value;
         getPropertyChangeSupport().firePropertyChange(PROPERTY_ASSIGNMENTPOINTS, oldValue, value);
      }
   }
   
   public Student withAssignmentPoints(int value)
   {
      setAssignmentPoints(value);
      return this;
   } 

   
   //==========================================================================
   
   
   public void removeYou()
   {
      setRoom(null);
      getPropertyChangeSupport().firePropertyChange("REMOVE_YOU", this, null);
   }

   public TeachingAssistant withRoom(Room value)
   {
      setRoom(value);
      return this;
   } 

   
   /********************************************************************
    * <pre>
    *              many                       one
    * TeachingAssistant ----------------------------------- Room
    *              tas                   room
    * </pre>
    */
   
   public static final String PROPERTY_ROOM = "room";
} //TeachingAssistantImpl
