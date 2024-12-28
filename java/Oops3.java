/**
 * Abstract classes
 * - is a blueprint of a class
 * - can have one or more abstract methods
 * - abstract methods only have the declaration not the implementation
 * - all the abstract methods need to be defined in the child class
 * - instance can't be created
 */

public class Oops3 {
    public static void main(String[] args) {
        SquareConfig squareConfig = new SquareConfig(10);
        System.out.println(squareConfig.area());
        System.out.println(squareConfig.perimeter());
        squareConfig.printSides();
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