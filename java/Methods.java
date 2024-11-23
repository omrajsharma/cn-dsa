public class Methods {
    public static void main(String[] args) {
        /**
         * Variable - data members
         * Function - method
         *
         * Simple functions - greet();
         * Functions with arguments - add(1,4);
         * Function with return type - int sum = add(5, 9)
         * Function with default parameters -
         *
         * function add(int a, int b = 10){
         *     return a + b;
         * }
         *
         * result = add(1,5) // 6
         * result = add(5)   // 15
         *
         */

        int a;  // declaration
        a = 10; // initialisation

        System.out.println(a);

        // method overloading
        greet();
        greet("Omraj Sharma");
        greet("Omraj Sharma", 1234);

        greet("", 1234);




        int result = add(3,4);

        System.out.println(result);



        // WAM (write a method) that takes a number and print it's table
        // WAM (write a method) that takes radius of the circle and prints it's area and cicumfrence
        // WAM (write a method) that takes the shape i.e. CIRCLE, SQAURE, RECTANGLE, and param1, param2 and print it's area


        System.out.println("aryan");


        System.out.println(getArea("CIRCLE", 3.0, null));
        System.out.println(getArea("SQUARE", 3.0, null));
        System.out.println(getArea("RECTANGLE", 3.0, 4.0));

    }

    public static double getArea(String shape, Double param1, Double param2) {
        switch (shape) {
            case "CIRCLE": return (3.14 * param1 * param1);
            case "SQUARE": return param1 * param1;
            case "RECTANGLE": return (param1 * param2);
            default: return 0.0;
        }
    }







    public static int add(int a, int b) {
        return a + b;
    }






    public static void greet() {
        System.out.println("Hi GUEST, Welcome to the class!!!");
    }

    public static void greet(String name) {
        System.out.println("Hi " + name + ", Welcome to the class!!!");
    }

    public static void greet(String name, int a) {
        System.out.println("Hi " + name + ", Welcome to the class!!! this is example of method overloading" + a);
    }
}
