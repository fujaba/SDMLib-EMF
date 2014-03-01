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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;
import org.sdmlib.utils.PropertyChangeInterface;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.AssignmentSet;
import java.util.LinkedHashSet;
import org.sdmlib.serialization.json.JsonIdMap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.RoomImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.RoomImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.RoomImpl#getUni <em>Uni</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.RoomImpl#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room, PropertyChangeInterface
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
   * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignments()
   * @generated
   * @ordered
   */
  protected EList<Assignment> assignments;

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
      case EMFStudyRightModelPackage.ROOM__ASSIGNMENTS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignments()).basicAdd(otherEnd, msgs);
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
      case EMFStudyRightModelPackage.ROOM__ASSIGNMENTS:
        return ((InternalEList<?>)getAssignments()).basicRemove(otherEnd, msgs);
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
      case EMFStudyRightModelPackage.ROOM__ASSIGNMENTS:
        return getAssignments();
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
      case EMFStudyRightModelPackage.ROOM__ASSIGNMENTS:
        getAssignments().clear();
        getAssignments().addAll((Collection<? extends Assignment>)newValue);
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
      case EMFStudyRightModelPackage.ROOM__ASSIGNMENTS:
        getAssignments().clear();
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
      case EMFStudyRightModelPackage.ROOM__ASSIGNMENTS:
        return assignments != null && !assignments.isEmpty();
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


   
   //==========================================================================
   
   public Object get(String attrName)
   {
      if (PROPERTY_TOPIC.equalsIgnoreCase(attrName))
      {
         return getTopic();
      }

      if (PROPERTY_CREDITS.equalsIgnoreCase(attrName))
      {
         return getCredits();
      }

      if (PROPERTY_UNI.equalsIgnoreCase(attrName))
      {
         return getUni();
      }

      if (PROPERTY_ASSIGNMENTS.equalsIgnoreCase(attrName))
      {
         return getAssignments();
      }

      return null;
   }

   
   //==========================================================================
   
   public boolean set(String attrName, Object value)
   {
      if (PROPERTY_TOPIC.equalsIgnoreCase(attrName))
      {
         setTopic((String) value);
         return true;
      }

      if (PROPERTY_CREDITS.equalsIgnoreCase(attrName))
      {
         setCredits(Integer.parseInt(value.toString()));
         return true;
      }

      if (PROPERTY_UNI.equalsIgnoreCase(attrName))
      {
         setUni((University) value);
         return true;
      }

      if (PROPERTY_ASSIGNMENTS.equalsIgnoreCase(attrName))
      {
         addToAssignments((Assignment) value);
         return true;
      }
      
      if ((PROPERTY_ASSIGNMENTS + JsonIdMap.REMOVE).equalsIgnoreCase(attrName))
      {
         removeFromAssignments((Assignment) value);
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
      setUni(null);
      removeAllFromAssignments();
      getPropertyChangeSupport().firePropertyChange("REMOVE_YOU", this, null);
   }

   
   //==========================================================================
   
   public static final String PROPERTY_TOPIC = "topic";
   
   public Room withTopic(String value)
   {
      setTopic(value);
      return this;
   } 

   
   //==========================================================================
   
   public static final String PROPERTY_CREDITS = "credits";
   
   public Room withCredits(int value)
   {
      setCredits(value);
      return this;
   } 

   
   /********************************************************************
    * <pre>
    *              many                       one
    * Room ----------------------------------- University
    *              rooms                   uni
    * </pre>
    */
   
   public static final String PROPERTY_UNI = "uni";

   private University uni = null;

   public Room withUni(University value)
   {
      setUni(value);
      return this;
   } 

   /********************************************************************
    * <pre>
    *              one                       many
    * Room ----------------------------------- Assignment
    *              room                   assignments
    * </pre>
    */
   
   public static final String PROPERTY_ASSIGNMENTS = "assignments";

   public boolean removeFromAssignments(Assignment value)
   {
      boolean changed = false;
      
      if ((this.assignments != null) && (value != null))
      {
         changed = this.assignments.remove (value);
         
         if (changed)
         {
            value.setRoom(null);
            getPropertyChangeSupport().firePropertyChange(PROPERTY_ASSIGNMENTS, value, null);
         }
      }
         
      return changed;   
   }

   public Room withAssignments(Assignment... value)
   {
      for (Assignment item : value)
      {
         addToAssignments(item);
      }
      return this;
   } 

   public Room withoutAssignments(Assignment... value)
   {
      for (Assignment item : value)
      {
         removeFromAssignments(item);
      }
      return this;
   }

   public void removeAllFromAssignments()
   {
      LinkedHashSet<Assignment> tmpSet = new LinkedHashSet<Assignment>(this.getAssignments());
   
      for (Assignment value : tmpSet)
      {
         this.removeFromAssignments(value);
      }
   }


   public Assignment createAssignments()
   {
      Assignment value = new AssignmentImpl();
      withAssignments(value);
      return value;
   } 

   public University createUni()
   {
      University value = new UniversityImpl();
      withUni(value);
      return value;
   } 

   public boolean addToAssignments(Assignment value)
   {
      boolean changed = false;
      
      if (value != null)
      {
         changed = this.getAssignments().add (value);
         
         if (changed)
         {
            value.withRoom(this);
            getPropertyChangeSupport().firePropertyChange(PROPERTY_ASSIGNMENTS, null, value);
         }
      }
         
      return changed;   
   }
  public AssignmentSet getAssignmentsSet()
  {
     return new AssignmentSet().with(getAssignments());
  }

} //RoomImpl

