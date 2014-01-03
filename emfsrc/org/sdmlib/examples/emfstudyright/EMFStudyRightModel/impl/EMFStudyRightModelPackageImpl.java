/**
 */
package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelFactory;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFStudyRightModelPackageImpl extends EPackageImpl implements EMFStudyRightModelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass universityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass studentEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EMFStudyRightModelPackageImpl()
  {
    super(eNS_URI, EMFStudyRightModelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link EMFStudyRightModelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EMFStudyRightModelPackage init()
  {
    if (isInited) return (EMFStudyRightModelPackage)EPackage.Registry.INSTANCE.getEPackage(EMFStudyRightModelPackage.eNS_URI);

    // Obtain or create and register package
    EMFStudyRightModelPackageImpl theEMFStudyRightModelPackage = (EMFStudyRightModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EMFStudyRightModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EMFStudyRightModelPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theEMFStudyRightModelPackage.createPackageContents();

    // Initialize created meta-data
    theEMFStudyRightModelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEMFStudyRightModelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EMFStudyRightModelPackage.eNS_URI, theEMFStudyRightModelPackage);
    return theEMFStudyRightModelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUniversity()
  {
    return universityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUniversity_Name()
  {
    return (EAttribute)universityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUniversity_Rooms()
  {
    return (EReference)universityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUniversity_Students()
  {
    return (EReference)universityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoom()
  {
    return roomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRoom_Topic()
  {
    return (EAttribute)roomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRoom_Credits()
  {
    return (EAttribute)roomEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoom_Uni()
  {
    return (EReference)roomEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoom_Assignments()
  {
    return (EReference)roomEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignment()
  {
    return assignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssignment_Name()
  {
    return (EAttribute)assignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssignment_Points()
  {
    return (EAttribute)assignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_Room()
  {
    return (EReference)assignmentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStudent()
  {
    return studentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStudent_Name()
  {
    return (EAttribute)studentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStudent_Credits()
  {
    return (EAttribute)studentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStudent_Motivation()
  {
    return (EAttribute)studentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStudent_Uni()
  {
    return (EReference)studentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStudent_Friends()
  {
    return (EReference)studentEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMFStudyRightModelFactory getEMFStudyRightModelFactory()
  {
    return (EMFStudyRightModelFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    universityEClass = createEClass(UNIVERSITY);
    createEAttribute(universityEClass, UNIVERSITY__NAME);
    createEReference(universityEClass, UNIVERSITY__ROOMS);
    createEReference(universityEClass, UNIVERSITY__STUDENTS);

    roomEClass = createEClass(ROOM);
    createEAttribute(roomEClass, ROOM__TOPIC);
    createEAttribute(roomEClass, ROOM__CREDITS);
    createEReference(roomEClass, ROOM__UNI);
    createEReference(roomEClass, ROOM__ASSIGNMENTS);

    assignmentEClass = createEClass(ASSIGNMENT);
    createEAttribute(assignmentEClass, ASSIGNMENT__NAME);
    createEAttribute(assignmentEClass, ASSIGNMENT__POINTS);
    createEReference(assignmentEClass, ASSIGNMENT__ROOM);

    studentEClass = createEClass(STUDENT);
    createEAttribute(studentEClass, STUDENT__NAME);
    createEAttribute(studentEClass, STUDENT__CREDITS);
    createEAttribute(studentEClass, STUDENT__MOTIVATION);
    createEReference(studentEClass, STUDENT__UNI);
    createEReference(studentEClass, STUDENT__FRIENDS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes, features, and operations; add parameters
    initEClass(universityEClass, University.class, "University", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUniversity_Name(), theEcorePackage.getEString(), "name", null, 0, 1, University.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUniversity_Rooms(), this.getRoom(), this.getRoom_Uni(), "rooms", null, 0, -1, University.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUniversity_Students(), this.getStudent(), this.getStudent_Uni(), "students", null, 0, -1, University.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRoom_Topic(), theEcorePackage.getEString(), "topic", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRoom_Credits(), theEcorePackage.getEInt(), "credits", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRoom_Uni(), this.getUniversity(), this.getUniversity_Rooms(), "uni", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRoom_Assignments(), this.getAssignment(), this.getAssignment_Room(), "assignments", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAssignment_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssignment_Points(), theEcorePackage.getEInt(), "points", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignment_Room(), this.getRoom(), this.getRoom_Assignments(), "room", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(studentEClass, Student.class, "Student", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStudent_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStudent_Credits(), theEcorePackage.getEInt(), "credits", null, 0, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStudent_Motivation(), theEcorePackage.getEInt(), "motivation", null, 0, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStudent_Uni(), this.getUniversity(), this.getUniversity_Students(), "uni", null, 0, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStudent_Friends(), this.getStudent(), this.getStudent_Friends(), "friends", null, 0, -1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //EMFStudyRightModelPackageImpl
