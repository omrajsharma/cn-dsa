public class Oops3 {
    public static void main(String[] args) {
//        final double pi = 3.14;
//        final double gst;
////        System.out.println(gst);        // ERROR - can't access before initialisation
//
//        gst = 5;
//        System.out.println(gst);
//        System.out.println(pi);
//        final Car civic = new Car(4, 5, 220);
//        System.out.println(civic.tyres + " " + civic.seats + " " + civic.speed);
////        civic.seats = 7;      // not possible due to final data member
//        System.out.println(civic.tyres + " " + civic.seats + " " + civic.speed);
////        civic = new Car(6, 7, 150);

//        Car nexon = new Car(50, 4, 180, 5);
//
//        nexon.start();
//        nexon.run();
//        nexon.park();
//        nexon.stop();

        Car punch = new Car(100, 2000, 120);
        punch.start();
        punch.run();
        punch.park();
        punch.stop();
        punch.display();
    }
}

/**
 * ABSTRACT CLASS
 * class - blueprint of an object
 * - are blueprint of a class
 * - we can't instantiate an object of an abstract class
 * - only have methods signature not the implementation
 * - implementation of abstract methods are done in the extending class
 * DIY
 * - constructor in abstract class
 * - build a non-abstract method in the class
 * - build a function that is not present in the abstract class
 * - make data members in the class apart from abstract
 * - Can SUV access data members of abstract class or not - POC Aryan
 */

//abstract class Vehicle {
//    int fuelCapacity;
//    int tyreCount;
//    int speed;
//    int seatsCount;
//
//    abstract void start();      // abstract method
//    abstract void stop();
//    abstract void run();
//    abstract void park();
//}
//
//class Car extends Vehicle {
//    Car(int fuelCapacity, int tyreCount, int speed, int seatsCount) {
//        this.fuelCapacity = fuelCapacity;
//        this.tyreCount = tyreCount;
//        this.speed = speed;
//        this.seatsCount = seatsCount;
//    }
//
//    void start() {
//        System.out.println("Car start");
//    }
//
//    void stop() {
//        System.out.println("Car stop");
//    }
//
//    void run() {
//        System.out.println("Car is running.");
//    }
//
//    void park() {
//        System.out.println("Car is parking.");
//    }
//}


/**
 * INTERFACE
 * - are collection of abstract methods
 * - We can't instantiate an object of an interface
 * - Doesn't contain construct
 * - All the methods in interface are abstract
 * - are implemented not extended
 * - class can implement multiple interfaces
 */

interface Testing {

}

interface Testing1 {

}

interface Vehicle {
    public void run();
    public void park();
    public void stop();
    public void start();
}

class Car implements Vehicle, Testing, Testing1 {
    private int speed;
    private int year;
    private int horsePower;

    Car(int speed, int year, int horsePower) {
        this.speed = speed;
        this.year = year;
        this.horsePower = horsePower;
    }

    public void run() {
        System.out.println("Car is running.");
    }

    public void park() {
        System.out.println("Car is parked.");
    }

    public void stop() {
        System.out.println("Car is stopped.");
    }

    public void start() {
        System.out.println("Car is started.");
    }

    public void display() {
        System.out.println("speed: " + speed + " year: " + year + " horsePower: " + horsePower);
    }
}





























/**
 * In an object
 * - function -> method, member function
 * - variable -> data member, property
 *
 */

/**
 * FINAL KEYWORD
 * - final primitive variables values can't be altered
 * - final non-primitive (obj) variables reference can't be altered on 23 line
 * - final non-primitive (obj) variables data members can be altered if they are not final data members.
 * Assignment for students
 * - final methods (funtions) can't be over ride
 * - final class can't be inherited
 * ! can we change it using getter and setter - Diptanu will tell in next year on first class
 */

//// FINAL KEYWORD
//class Car {
//    final int tyres;
//    final int seats;
//    final int speed;
//
//    Car (int tyres, int seats, int speed) {
//        this.tyres = tyres;
//        this.seats = seats;
//        this.speed = speed;
//    }
//}