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
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.StudentSet;
import java.util.LinkedHashSet;
import org.sdmlib.serialization.json.JsonIdMap;
import org.sdmlib.utils.PropertyChangeInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl#getMotivation <em>Motivation</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl#getUni <em>Uni</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl#getFriends <em>Friends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StudentImpl extends MinimalEObjectImpl.Container implements Student, PropertyChangeInterface
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
   * The default value of the '{@link #getMotivation() <em>Motivation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMotivation()
   * @generated
   * @ordered
   */
  protected static final int MOTIVATION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMotivation() <em>Motivation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMotivation()
   * @generated
   * @ordered
   */
  protected int motivation = MOTIVATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getFriends() <em>Friends</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFriends()
   * @generated
   * @ordered
   */
  protected EList<Student> friends;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StudentImpl()
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
    return EMFStudyRightModelPackage.Literals.STUDENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EMFStudyRightModelPackage.STUDENT__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EMFStudyRightModelPackage.STUDENT__CREDITS, oldCredits, credits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMotivation()
  {
    return motivation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMotivation(int newMotivation)
  {
    int oldMotivation = motivation;
    motivation = newMotivation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMFStudyRightModelPackage.STUDENT__MOTIVATION, oldMotivation, motivation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public University getUni()
  {
    if (eContainerFeatureID() != EMFStudyRightModelPackage.STUDENT__UNI) return null;
    return (University)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public University basicGetUni()
  {
    if (eContainerFeatureID() != EMFStudyRightModelPackage.STUDENT__UNI) return null;
    return (University)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUni(University newUni, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newUni, EMFStudyRightModelPackage.STUDENT__UNI, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUni(University newUni)
  {
    if (newUni != eInternalContainer() || (eContainerFeatureID() != EMFStudyRightModelPackage.STUDENT__UNI && newUni != null))
    {
      if (EcoreUtil.isAncestor(this, newUni))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newUni != null)
        msgs = ((InternalEObject)newUni).eInverseAdd(this, EMFStudyRightModelPackage.UNIVERSITY__STUDENTS, University.class, msgs);
      msgs = basicSetUni(newUni, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMFStudyRightModelPackage.STUDENT__UNI, newUni, newUni));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Student> getFriends()
  {
    if (friends == null)
    {
      friends = new EObjectWithInverseResolvingEList.ManyInverse<Student>(Student.class, this, EMFStudyRightModelPackage.STUDENT__FRIENDS, EMFStudyRightModelPackage.STUDENT__FRIENDS);
    }
    return friends;
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
      case EMFStudyRightModelPackage.STUDENT__UNI:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetUni((University)otherEnd, msgs);
      case EMFStudyRightModelPackage.STUDENT__FRIENDS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getFriends()).basicAdd(otherEnd, msgs);
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
      case EMFStudyRightModelPackage.STUDENT__UNI:
        return basicSetUni(null, msgs);
      case EMFStudyRightModelPackage.STUDENT__FRIENDS:
        return ((InternalEList<?>)getFriends()).basicRemove(otherEnd, msgs);
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
      case EMFStudyRightModelPackage.STUDENT__UNI:
        return eInternalContainer().eInverseRemove(this, EMFStudyRightModelPackage.UNIVERSITY__STUDENTS, University.class, msgs);
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
      case EMFStudyRightModelPackage.STUDENT__NAME:
        return getName();
      case EMFStudyRightModelPackage.STUDENT__CREDITS:
        return getCredits();
      case EMFStudyRightModelPackage.STUDENT__MOTIVATION:
        return getMotivation();
      case EMFStudyRightModelPackage.STUDENT__UNI:
        if (resolve) return getUni();
        return basicGetUni();
      case EMFStudyRightModelPackage.STUDENT__FRIENDS:
        return getFriends();
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
      case EMFStudyRightModelPackage.STUDENT__NAME:
        setName((String)newValue);
        return;
      case EMFStudyRightModelPackage.STUDENT__CREDITS:
        setCredits((Integer)newValue);
        return;
      case EMFStudyRightModelPackage.STUDENT__MOTIVATION:
        setMotivation((Integer)newValue);
        return;
      case EMFStudyRightModelPackage.STUDENT__UNI:
        setUni((University)newValue);
        return;
      case EMFStudyRightModelPackage.STUDENT__FRIENDS:
        getFriends().clear();
        getFriends().addAll((Collection<? extends Student>)newValue);
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
      case EMFStudyRightModelPackage.STUDENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EMFStudyRightModelPackage.STUDENT__CREDITS:
        setCredits(CREDITS_EDEFAULT);
        return;
      case EMFStudyRightModelPackage.STUDENT__MOTIVATION:
        setMotivation(MOTIVATION_EDEFAULT);
        return;
      case EMFStudyRightModelPackage.STUDENT__UNI:
        setUni((University)null);
        return;
      case EMFStudyRightModelPackage.STUDENT__FRIENDS:
        getFriends().clear();
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
      case EMFStudyRightModelPackage.STUDENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EMFStudyRightModelPackage.STUDENT__CREDITS:
        return credits != CREDITS_EDEFAULT;
      case EMFStudyRightModelPackage.STUDENT__MOTIVATION:
        return motivation != MOTIVATION_EDEFAULT;
      case EMFStudyRightModelPackage.STUDENT__UNI:
        return basicGetUni() != null;
      case EMFStudyRightModelPackage.STUDENT__FRIENDS:
        return friends != null && !friends.isEmpty();
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
    result.append(", credits: ");
    result.append(credits);
    result.append(", motivation: ");
    result.append(motivation);
    result.append(')');
    return result.toString();
  }


   
   //==========================================================================
   
   public Object get(String attrName)
   {
      if (PROPERTY_NAME.equalsIgnoreCase(attrName))
      {
         return getName();
      }

      if (PROPERTY_CREDITS.equalsIgnoreCase(attrName))
      {
         return getCredits();
      }

      if (PROPERTY_MOTIVATION.equalsIgnoreCase(attrName))
      {
         return getMotivation();
      }

      if (PROPERTY_UNI.equalsIgnoreCase(attrName))
      {
         return getUni();
      }

      if (PROPERTY_FRIENDS.equalsIgnoreCase(attrName))
      {
         return getFriends();
      }

      return null;
   }

   
   //==========================================================================
   
   public boolean set(String attrName, Object value)
   {
      if (PROPERTY_NAME.equalsIgnoreCase(attrName))
      {
         setName((String) value);
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

      if (PROPERTY_UNI.equalsIgnoreCase(attrName))
      {
         setUni((University) value);
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
      removeAllFromFriends();
      getPropertyChangeSupport().firePropertyChange("REMOVE_YOU", this, null);
   }

   
   //==========================================================================
   
   public static final String PROPERTY_NAME = "name";
   
   public Student withName(String value)
   {
      setName(value);
      return this;
   } 

   
   //==========================================================================
   
   public static final String PROPERTY_CREDITS = "credits";
   
   public Student withCredits(int value)
   {
      setCredits(value);
      return this;
   } 

   
   //==========================================================================
   
   public static final String PROPERTY_MOTIVATION = "motivation";
   
   public Student withMotivation(int value)
   {
      setMotivation(value);
      return this;
   } 

   
   /********************************************************************
    * <pre>
    *              many                       one
    * Student ----------------------------------- University
    *              students                   uni
    * </pre>
    */
   
   public static final String PROPERTY_UNI = "uni";

   private University uni = null;

   public Student withUni(University value)
   {
      setUni(value);
      return this;
   } 

   /********************************************************************
    * <pre>
    *              many                       many
    * Student ----------------------------------- Student
    *              friends                   friends
    * </pre>
    */
   
   public static final String PROPERTY_FRIENDS = "friends";

   public boolean removeFromFriends(Student value)
   {
      boolean changed = false;
      
      if ((this.friends != null) && (value != null))
      {
         changed = this.friends.remove (value);
         
         if (changed)
         {
            value.withoutFriends(this);
            getPropertyChangeSupport().firePropertyChange(PROPERTY_FRIENDS, value, null);
         }
      }
         
      return changed;   
   }

   public Student withFriends(Student... value)
   {
      for (Student item : value)
      {
         addToFriends(item);
      }
      return this;
   } 

   public Student withoutFriends(Student... value)
   {
      for (Student item : value)
      {
         removeFromFriends(item);
      }
      return this;
   }

   public void removeAllFromFriends()
   {
      LinkedHashSet<Student> tmpSet = new LinkedHashSet<Student>(this.getFriends());
   
      for (Student value : tmpSet)
      {
         this.removeFromFriends(value);
      }
   }

   public Student createFriends()
   {
      Student value = new StudentImpl();
      withFriends(value);
      return value;
   } 

   public University createUni()
   {
      University value = new UniversityImpl();
      withUni(value);
      return value;
   } 

   public boolean addToFriends(Student value)
   {
      boolean changed = false;
      
      if (value != null)
      {
         changed = this.getFriends().add (value);
         
         if (changed)
         {
            value.withFriends(this);
            getPropertyChangeSupport().firePropertyChange(PROPERTY_FRIENDS, null, value);
         }
      }
         
      return changed;   
   }
  public StudentSet getFriendsSet()
  {
     return new StudentSet().with(getFriends());
  }

} //StudentImpl

