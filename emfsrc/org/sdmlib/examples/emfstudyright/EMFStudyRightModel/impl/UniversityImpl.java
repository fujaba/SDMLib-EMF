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
import org.sdmlib.serialization.PropertyChangeInterface;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;
import org.sdmlib.StrUtil;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.RoomImpl;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.RoomSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.TeachingAssistantImpl;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.StudentSet;

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
   
   public University withName(String value)
   {
      setName(value);
      return this;
   } 

   
   //==========================================================================
   
   
   public void removeYou()
   {
      withoutRooms(this.getRooms().toArray(new Room[this.getRooms().size()]));
      withoutStudents(this.getStudents().toArray(new Student[this.getStudents().size()]));
      getPropertyChangeSupport().firePropertyChange("REMOVE_YOU", this, null);
   }
  public RoomSet getRoomsSet()
  {
     return new RoomSet().with(getRooms());
  }


   public University withRooms(Room... value)
   {
      if(value==null){
         return this;
      }
      for (Room item : value)
      {
         if (item != null)
         {
            if (this.rooms == null)
            {
               this.rooms = new RoomSet();
            }
            
            boolean changed = this.rooms.add (item);

            if (changed)
            {
               item.withUni(this);
               getPropertyChangeSupport().firePropertyChange(PROPERTY_ROOMS, null, item);
            }
         }
      }
      return this;
   } 

   public University withoutRooms(Room... value)
   {
      for (Room item : value)
      {
         if ((this.rooms != null) && (item != null))
         {
            if (this.rooms.remove(item))
            {
               item.setUni(null);
               getPropertyChangeSupport().firePropertyChange(PROPERTY_ROOMS, item, null);
            }
         }
         withoutRooms(item);
      }
      return this;
   }

   public RoomImpl createRoomsRoomImpl()
   {
      RoomImpl value = new RoomImpl();
      withRooms(value);
      return value;
   } 
  public StudentSet getStudentsSet()
  {
     return new StudentSet().with(getStudents());
  }


   public University withStudents(Student... value)
   {
      if(value==null){
         return this;
      }
      for (Student item : value)
      {
         if (item != null)
         {
            if (this.students == null)
            {
               this.students = new StudentSet();
            }
            
            boolean changed = this.students.add (item);

            if (changed)
            {
               item.withUni(this);
               getPropertyChangeSupport().firePropertyChange(PROPERTY_STUDENTS, null, item);
            }
         }
      }
      return this;
   } 

   public University withoutStudents(Student... value)
   {
      for (Student item : value)
      {
         if ((this.students != null) && (item != null))
         {
            if (this.students.remove(item))
            {
               item.setUni(null);
               getPropertyChangeSupport().firePropertyChange(PROPERTY_STUDENTS, item, null);
            }
         }
         withoutStudents(item);
      }
      return this;
   }

   public Student createStudents()
   {
      Student value = new TeachingAssistant();
      withStudents(value);
      return value;
   } 

   public StudentImpl createStudentsStudentImpl()
   {
      StudentImpl value = new StudentImpl();
      withStudents(value);
      return value;
   } 

   public TeachingAssistantImpl createStudentsTeachingAssistantImpl()
   {
      TeachingAssistantImpl value = new TeachingAssistantImpl();
      withStudents(value);
      return value;
   } 

   
   /********************************************************************
    * <pre>
    *              one                       many
    * University ----------------------------------- Room
    *              uni                   rooms
    * </pre>
    */
   
   public static final String PROPERTY_ROOMS = "rooms";

   
   /********************************************************************
    * <pre>
    *              one                       many
    * University ----------------------------------- Student
    *              uni                   students
    * </pre>
    */
   
   public static final String PROPERTY_STUDENTS = "students";
} //UniversityImpl
