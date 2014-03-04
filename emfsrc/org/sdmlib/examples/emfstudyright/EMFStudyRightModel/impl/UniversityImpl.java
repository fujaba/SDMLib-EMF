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
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;

import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.RoomSet;

import java.util.LinkedHashSet;

import org.sdmlib.serialization.json.JsonIdMap;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.StudentSet;
import org.sdmlib.utils.PropertyChangeInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.UniversityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.UniversityImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.UniversityImpl#getStudents <em>Students</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UniversityImpl extends MinimalEObjectImpl.Container implements University, PropertyChangeInterface
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
  
  public StudentSet getStudentsSet()
  {
     return new StudentSet().with(getStudents());
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


   
   //==========================================================================
   
   public Object get(String attrName)
   {
      if (PROPERTY_NAME.equalsIgnoreCase(attrName))
      {
         return getName();
      }

      if (PROPERTY_ROOMS.equalsIgnoreCase(attrName))
      {
         return getRooms();
      }

      if (PROPERTY_STUDENTS.equalsIgnoreCase(attrName))
      {
         return getStudents();
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

      if (PROPERTY_ROOMS.equalsIgnoreCase(attrName))
      {
         addToRooms((Room) value);
         return true;
      }
      
      if ((PROPERTY_ROOMS + JsonIdMap.REMOVE).equalsIgnoreCase(attrName))
      {
         removeFromRooms((Room) value);
         return true;
      }

      if (PROPERTY_STUDENTS.equalsIgnoreCase(attrName))
      {
         addToStudents((Student) value);
         return true;
      }
      
      if ((PROPERTY_STUDENTS + JsonIdMap.REMOVE).equalsIgnoreCase(attrName))
      {
         removeFromStudents((Student) value);
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
      removeAllFromRooms();
      removeAllFromStudents();
      getPropertyChangeSupport().firePropertyChange("REMOVE_YOU", this, null);
   }

   
   //==========================================================================
   
   public static final String PROPERTY_NAME = "name";
   
   public University withName(String value)
   {
      setName(value);
      return this;
   } 

   
   /********************************************************************
    * <pre>
    *              one                       many
    * University ----------------------------------- Room
    *              uni                   rooms
    * </pre>
    */
   
   public static final String PROPERTY_ROOMS = "rooms";

   public boolean removeFromRooms(Room value)
   {
      boolean changed = false;
      
      if ((this.rooms != null) && (value != null))
      {
         changed = this.rooms.remove (value);
         
         if (changed)
         {
            value.setUni(null);
            getPropertyChangeSupport().firePropertyChange(PROPERTY_ROOMS, value, null);
         }
      }
         
      return changed;   
   }

   public University withRooms(Room... value)
   {
      for (Room item : value)
      {
         addToRooms(item);
      }
      return this;
   } 

   public University withoutRooms(Room... value)
   {
      for (Room item : value)
      {
         removeFromRooms(item);
      }
      return this;
   }

   public void removeAllFromRooms()
   {
      LinkedHashSet<Room> tmpSet = new LinkedHashSet<Room>(this.getRooms());
   
      for (Room value : tmpSet)
      {
         this.removeFromRooms(value);
      }
   }

   /********************************************************************
    * <pre>
    *              one                       many
    * University ----------------------------------- Student
    *              uni                   students
    * </pre>
    */
   
   public static final String PROPERTY_STUDENTS = "students";

   public boolean removeFromStudents(Student value)
   {
      boolean changed = false;
      
      if ((this.students != null) && (value != null))
      {
         changed = this.students.remove (value);
         
         if (changed)
         {
            value.setUni(null);
            getPropertyChangeSupport().firePropertyChange(PROPERTY_STUDENTS, value, null);
         }
      }
         
      return changed;   
   }

   public University withStudents(Student... value)
   {
      for (Student item : value)
      {
         addToStudents(item);
      }
      return this;
   } 

   public University withoutStudents(Student... value)
   {
      for (Student item : value)
      {
         removeFromStudents(item);
      }
      return this;
   }

   public void removeAllFromStudents()
   {
      LinkedHashSet<Student> tmpSet = new LinkedHashSet<Student>(this.getStudents());
   
      for (Student value : tmpSet)
      {
         this.removeFromStudents(value);
      }
   }


   public Student createStudents()
   {
      Student value = new StudentImpl();
      withStudents(value);
      return value;
   } 

   public boolean addToRooms(Room value)
   {
      boolean changed = false;
      
      if (value != null)
      {
         changed = this.getRooms().add (value);
         
         if (changed)
         {
            value.withUni(this);
            getPropertyChangeSupport().firePropertyChange(PROPERTY_ROOMS, null, value);
         }
      }
         
      return changed;   
   }

   public Room createRooms()
   {
      Room value = new RoomImpl();
      withRooms(value);
      return value;
   } 

   public boolean addToStudents(Student value)
   {
      boolean changed = false;
      
      if (value != null)
      {
         changed = this.getStudents().add (value);
         
         if (changed)
         {
            value.withUni(this);
            getPropertyChangeSupport().firePropertyChange(PROPERTY_STUDENTS, null, value);
         }
      }
         
      return changed;   
   }
  public RoomSet getRoomsSet()
  {
     return new RoomSet().with(getRooms());
  }

@Override
public TeachingAssistant createStudentsTeachingAssistant()
{
   TeachingAssistantImpl ta = new TeachingAssistantImpl();
   this.addToStudents(ta);
   return ta;
}

} //UniversityImpl

