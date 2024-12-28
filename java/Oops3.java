/**
 * Abstract classes
 * - is a blueprint of a class
 * - can have one or more abstract methods
 * - abstract methods only have the declaration not the implementation
 * - all the abstract methods need to be defined in the child class
 * - instance can't be created
 */

/**
 * Interfaces
 * - are reference type in java
 * - is a collection of abstract methods
 * - writing is similar to that of class, classes contains
 * attributes and behaviour of object and interface contains
 * behaviour that a class implements
 * - can't be instantiated
 * - doesn't contain constructor
 * - methods are abstract
 * - cannot contain instance fields. It can only have it in static or final.
 * - are not extended but implemented
 * - can extend multiple interfaces
 */

public class Oops3 {
    public static void main(String[] args) {
        SquareConfig squareConfig = new SquareConfig(10);
        System.out.println(squareConfig.area());
        System.out.println(squareConfig.perimeter());
        squareConfig.printSides();
    }
}

interface VehicleInterface {
    public final static double MIN_SPEED = 100;

    public double getMaxSpeed();

    public double getEngineMaxHorsePower();

    public int getSittingCapacity();
}

class MarutiSuzuki implements VehicleInterface {
    public double getMaxSpeed() {
        return 120;
    }

    public double getEngineMaxHorsePower() {
        return 200;
    }

    public int getSittingCapacity() {
        return 5;
    }
}

class Ferrari implements VehicleInterface {
    public double getMaxSpeed() {
        return 330;
    }

    public double getEngineMaxHorsePower() {
        return 900;
    }

    public int getSittingCapacity() {
        return 2;
    }
}

abstract class ShapeConfig {
    int side1;
    int side2;

    ShapeConfig(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    ShapeConfig(int side1) {
        this.side1 = side1;
    }

    abstract int area();

    abstract int perimeter();

    void printSides() {
        System.out.println(side1);
        System.out.println(side2);
    }
}

class SquareConfig extends ShapeConfig {
    SquareConfig(int side1) {
        super(side1);
    }

    int area() {
        return side1*side1;
    }

    int perimeter() {
        return 4 * side1;
    }

    // abstract void test();        // INVALID - concrete classes can only have concrete methods not abstract methods
}

class RectangleConfig extends ShapeConfig {
    RectangleConfig(int side1, int side2) {
        super(side1, side2);
    }

    int area() {
        return side1*side2;
    }

    int perimeter() {
        return side1*side2;
    }
}