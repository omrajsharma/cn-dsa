public class Oops {
    public static void main(String[] args) {
        System.out.println("Object Oriented Programming");

        CNStudent ishant;      // declaration
        ishant = new CNStudent();      // initialisation
        CNStudent aryan = ishant;

        System.out.println("# ishant");
        printObj(ishant);

        modifyObj(ishant);

        printObj(ishant);
        // if ishant changes -> pass by refernce ✅
        // else -> pass by value ❌

        int a = 10;
        int b = a;
        b = 20;
        System.out.println(a);
        System.out.println(b);

        modifyNum(a);
        System.out.println(a);
        // if a is change -> pass by reference ❌
        // else -> pass by value ✅

        ishant.name = "Ishant Sharma";
        ishant.rollNo = 1;
        ishant.isActive = true;

        printObj(ishant);

        CNStudent diptanu = new CNStudent();
        CNStudent om = new CNStudent(1234,"Omraj Sharma", true);
        printObj(om);

        CNStudent p = new CNStudent(1234,"P Student", true);
        p = new CNStudent(1234,"P1 Student", true);
        p = new CNStudent(1234,"P2 Student", true);
        p = new CNStudent(1234,"P3 Student", true);

    }

    public static void modifyNum(int num) {
        num = 5;
    }

    public static void modifyObj(CNStudent student) {
        student.name = "testing";
    }

    public static void printObj(CNStudent student) {
        System.out.println(student);
        System.out.println(student.rollNo);
        System.out.println(student.name);
        System.out.println(student.isActive);
    }
}

// recipe
class CNStudent {
    // data members
    int rollNo;
    String name;
    boolean isActive;

    // constructor - special function named as class name. Typically used to instantiate the data members. It also doesn't have any return type.
    CNStudent() {
        System.out.println("Inside CNStudent constructor");
        this(12, "Default Name", true);
//        name = "NA";
//        isActive = true;
//        rollNo = 1000;
    }

    // constructor overloading - multiple constructors with different params
    CNStudent(int rollNo, String name, boolean isActive) {
        this.rollNo = rollNo;
        this.name = name;
        this.isActive = isActive;
    }

//    CNStudent(int roll, String n, boolean active) {
//        this.rollNo = roll;
//        this.name = n;
//        this.isActive = active;
//    }

    // member functions
    void code() {
        System.out.println("I can code fast");
    }
}