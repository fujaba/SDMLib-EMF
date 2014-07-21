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
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl#getStudId <em>Stud Id</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl#getMotivation <em>Motivation</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl#getAssignmentPoints <em>Assignment Points</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl#getUni <em>Uni</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl#getIn <em>In</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl#getFriends <em>Friends</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl#getFriendsRev <em>Friends Rev</em>}</li>
 *   <li>{@link org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl#getDone <em>Done</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StudentImpl extends MinimalEObjectImpl.Container implements Student
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
    * The default value of the '{@link #getStudId() <em>Stud Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getStudId()
    * @generated
    * @ordered
    */
   protected static final String STUD_ID_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getStudId() <em>Stud Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getStudId()
    * @generated
    * @ordered
    */
   protected String studId = STUD_ID_EDEFAULT;

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
    * The default value of the '{@link #getAssignmentPoints() <em>Assignment Points</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAssignmentPoints()
    * @generated
    * @ordered
    */
   protected static final int ASSIGNMENT_POINTS_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getAssignmentPoints() <em>Assignment Points</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAssignmentPoints()
    * @generated
    * @ordered
    */
   protected int assignmentPoints = ASSIGNMENT_POINTS_EDEFAULT;

   /**
    * The cached value of the '{@link #getIn() <em>In</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getIn()
    * @generated
    * @ordered
    */
   protected Room in;

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
    * The cached value of the '{@link #getFriendsRev() <em>Friends Rev</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getFriendsRev()
    * @generated
    * @ordered
    */
   protected EList<Student> friendsRev;

   /**
    * The cached value of the '{@link #getDone() <em>Done</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getDone()
    * @generated
    * @ordered
    */
   protected EList<Assignment> done;

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
   public String getStudId()
   {
      return studId;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setStudId(String newStudId)
   {
      String oldStudId = studId;
      studId = newStudId;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, EMFStudyRightModelPackage.STUDENT__STUD_ID, oldStudId, studId));
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
   public int getAssignmentPoints()
   {
      return assignmentPoints;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setAssignmentPoints(int newAssignmentPoints)
   {
      int oldAssignmentPoints = assignmentPoints;
      assignmentPoints = newAssignmentPoints;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, EMFStudyRightModelPackage.STUDENT__ASSIGNMENT_POINTS, oldAssignmentPoints, assignmentPoints));
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
   public Room getIn()
   {
      if (in != null && in.eIsProxy())
      {
         InternalEObject oldIn = (InternalEObject)in;
         in = (Room)eResolveProxy(oldIn);
         if (in != oldIn)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFStudyRightModelPackage.STUDENT__IN, oldIn, in));
         }
      }
      return in;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Room basicGetIn()
   {
      return in;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetIn(Room newIn, NotificationChain msgs)
   {
      Room oldIn = in;
      in = newIn;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFStudyRightModelPackage.STUDENT__IN, oldIn, newIn);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setIn(Room newIn)
   {
      if (newIn != in)
      {
         NotificationChain msgs = null;
         if (in != null)
            msgs = ((InternalEObject)in).eInverseRemove(this, EMFStudyRightModelPackage.ROOM__STUDENTS, Room.class, msgs);
         if (newIn != null)
            msgs = ((InternalEObject)newIn).eInverseAdd(this, EMFStudyRightModelPackage.ROOM__STUDENTS, Room.class, msgs);
         msgs = basicSetIn(newIn, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, EMFStudyRightModelPackage.STUDENT__IN, newIn, newIn));
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
         friends = new EObjectWithInverseResolvingEList.ManyInverse<Student>(Student.class, this, EMFStudyRightModelPackage.STUDENT__FRIENDS, EMFStudyRightModelPackage.STUDENT__FRIENDS_REV);
      }
      return friends;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Student> getFriendsRev()
   {
      if (friendsRev == null)
      {
         friendsRev = new EObjectWithInverseResolvingEList.ManyInverse<Student>(Student.class, this, EMFStudyRightModelPackage.STUDENT__FRIENDS_REV, EMFStudyRightModelPackage.STUDENT__FRIENDS);
      }
      return friendsRev;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Assignment> getDone()
   {
      if (done == null)
      {
         done = new EObjectWithInverseResolvingEList.ManyInverse<Assignment>(Assignment.class, this, EMFStudyRightModelPackage.STUDENT__DONE, EMFStudyRightModelPackage.ASSIGNMENT__STUDENTS);
      }
      return done;
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
         case EMFStudyRightModelPackage.STUDENT__IN:
            if (in != null)
               msgs = ((InternalEObject)in).eInverseRemove(this, EMFStudyRightModelPackage.ROOM__STUDENTS, Room.class, msgs);
            return basicSetIn((Room)otherEnd, msgs);
         case EMFStudyRightModelPackage.STUDENT__FRIENDS:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getFriends()).basicAdd(otherEnd, msgs);
         case EMFStudyRightModelPackage.STUDENT__FRIENDS_REV:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getFriendsRev()).basicAdd(otherEnd, msgs);
         case EMFStudyRightModelPackage.STUDENT__DONE:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getDone()).basicAdd(otherEnd, msgs);
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
         case EMFStudyRightModelPackage.STUDENT__IN:
            return basicSetIn(null, msgs);
         case EMFStudyRightModelPackage.STUDENT__FRIENDS:
            return ((InternalEList<?>)getFriends()).basicRemove(otherEnd, msgs);
         case EMFStudyRightModelPackage.STUDENT__FRIENDS_REV:
            return ((InternalEList<?>)getFriendsRev()).basicRemove(otherEnd, msgs);
         case EMFStudyRightModelPackage.STUDENT__DONE:
            return ((InternalEList<?>)getDone()).basicRemove(otherEnd, msgs);
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
         case EMFStudyRightModelPackage.STUDENT__STUD_ID:
            return getStudId();
         case EMFStudyRightModelPackage.STUDENT__CREDITS:
            return getCredits();
         case EMFStudyRightModelPackage.STUDENT__MOTIVATION:
            return getMotivation();
         case EMFStudyRightModelPackage.STUDENT__ASSIGNMENT_POINTS:
            return getAssignmentPoints();
         case EMFStudyRightModelPackage.STUDENT__UNI:
            if (resolve) return getUni();
            return basicGetUni();
         case EMFStudyRightModelPackage.STUDENT__IN:
            if (resolve) return getIn();
            return basicGetIn();
         case EMFStudyRightModelPackage.STUDENT__FRIENDS:
            return getFriends();
         case EMFStudyRightModelPackage.STUDENT__FRIENDS_REV:
            return getFriendsRev();
         case EMFStudyRightModelPackage.STUDENT__DONE:
            return getDone();
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
         case EMFStudyRightModelPackage.STUDENT__STUD_ID:
            setStudId((String)newValue);
            return;
         case EMFStudyRightModelPackage.STUDENT__CREDITS:
            setCredits((Integer)newValue);
            return;
         case EMFStudyRightModelPackage.STUDENT__MOTIVATION:
            setMotivation((Integer)newValue);
            return;
         case EMFStudyRightModelPackage.STUDENT__ASSIGNMENT_POINTS:
            setAssignmentPoints((Integer)newValue);
            return;
         case EMFStudyRightModelPackage.STUDENT__UNI:
            setUni((University)newValue);
            return;
         case EMFStudyRightModelPackage.STUDENT__IN:
            setIn((Room)newValue);
            return;
         case EMFStudyRightModelPackage.STUDENT__FRIENDS:
            getFriends().clear();
            getFriends().addAll((Collection<? extends Student>)newValue);
            return;
         case EMFStudyRightModelPackage.STUDENT__FRIENDS_REV:
            getFriendsRev().clear();
            getFriendsRev().addAll((Collection<? extends Student>)newValue);
            return;
         case EMFStudyRightModelPackage.STUDENT__DONE:
            getDone().clear();
            getDone().addAll((Collection<? extends Assignment>)newValue);
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
         case EMFStudyRightModelPackage.STUDENT__STUD_ID:
            setStudId(STUD_ID_EDEFAULT);
            return;
         case EMFStudyRightModelPackage.STUDENT__CREDITS:
            setCredits(CREDITS_EDEFAULT);
            return;
         case EMFStudyRightModelPackage.STUDENT__MOTIVATION:
            setMotivation(MOTIVATION_EDEFAULT);
            return;
         case EMFStudyRightModelPackage.STUDENT__ASSIGNMENT_POINTS:
            setAssignmentPoints(ASSIGNMENT_POINTS_EDEFAULT);
            return;
         case EMFStudyRightModelPackage.STUDENT__UNI:
            setUni((University)null);
            return;
         case EMFStudyRightModelPackage.STUDENT__IN:
            setIn((Room)null);
            return;
         case EMFStudyRightModelPackage.STUDENT__FRIENDS:
            getFriends().clear();
            return;
         case EMFStudyRightModelPackage.STUDENT__FRIENDS_REV:
            getFriendsRev().clear();
            return;
         case EMFStudyRightModelPackage.STUDENT__DONE:
            getDone().clear();
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
         case EMFStudyRightModelPackage.STUDENT__STUD_ID:
            return STUD_ID_EDEFAULT == null ? studId != null : !STUD_ID_EDEFAULT.equals(studId);
         case EMFStudyRightModelPackage.STUDENT__CREDITS:
            return credits != CREDITS_EDEFAULT;
         case EMFStudyRightModelPackage.STUDENT__MOTIVATION:
            return motivation != MOTIVATION_EDEFAULT;
         case EMFStudyRightModelPackage.STUDENT__ASSIGNMENT_POINTS:
            return assignmentPoints != ASSIGNMENT_POINTS_EDEFAULT;
         case EMFStudyRightModelPackage.STUDENT__UNI:
            return basicGetUni() != null;
         case EMFStudyRightModelPackage.STUDENT__IN:
            return in != null;
         case EMFStudyRightModelPackage.STUDENT__FRIENDS:
            return friends != null && !friends.isEmpty();
         case EMFStudyRightModelPackage.STUDENT__FRIENDS_REV:
            return friendsRev != null && !friendsRev.isEmpty();
         case EMFStudyRightModelPackage.STUDENT__DONE:
            return done != null && !done.isEmpty();
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
      result.append(", studId: ");
      result.append(studId);
      result.append(", credits: ");
      result.append(credits);
      result.append(", motivation: ");
      result.append(motivation);
      result.append(", assignmentPoints: ");
      result.append(assignmentPoints);
      result.append(')');
      return result.toString();
   }

} //StudentImpl
