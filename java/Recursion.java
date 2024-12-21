import java.util.Arrays;

public class Recursion {

    // When a program calls itself is called as recursion

    /**
     * RECURSION
     * - BASE CONDITION - KB BAND HONA H
     * - RECURSIVE CALL
     * - OPERATION
     */

    public static void main(String[] args) {
        int num = 2;
        int power = 5;
        System.out.println("Factorial of num " + num + " = " + getFactorial(num));
        System.out.println(num + " ^ " + power + " = " + calculatePower(num, power));

        num = 123;
        System.out.println("Count of digits of num " + num + " = " + countDigits(num));
        //countDigits
        System.out.println(num + " ^ " + power + " = " + calculatePower(num, power));

        num = 5;
        printNumber(num);
        System.out.println();

        System.out.println(getSum(5));

        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(arr, 0)));
        printFibonacci(100, 0, 1);

        for (int i = 0; i < 10; i++) {
            System.out.println(printFibonacci(i) + " ");
        }
    }

    public static void printFibonacci(int n, int a, int b) {
        if (a + b > n) {
            return;
        }
        if (a == 0 && b == 1) {
            System.out.print(a + " ");
            System.out.print(b + " ");
        }
        System.out.print(a + b + " ");
        printFibonacci(n, b, a + b);
    }

    public static int printFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return printFibonacci(n - 1) + printFibonacci(n - 2);
    }

    public static int[] reverseArray(int[] arr, int idx) {
        if (arr == null || arr.length == 0 || arr.length == 1 || idx > arr.length / 2) {
            return arr;
        }
        // swap values
        int tmp = arr[idx];
        arr[idx] = arr[arr.length - 1 - idx];
        arr[arr.length - 1 - idx] = tmp;
        return reverseArray(arr, idx + 1);
    }

    public static int getSum(int num) {
        if (num == 0) {
            return 0;
        }
        return num + getSum(num - 1);
    }

    // num = 5 -> 1 2 3 4 5
    public static int printNumber(int num) {
        if (num == 0) {
            return 0;
        }
        printNumber(num - 1);
        System.out.print(num + " ");

        return 0;
    }

    public static int countDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + countDigits(num / 10);
    }

    public static int calculatePower(int num, int power) {
        if (power == 0) {
            return 1;
        }
        return num * calculatePower(num, power - 1);
    }

    public static int getFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        return getFactorial(num - 1) * num;
    }












    // factorial of a num = 5 -> 1*2*3*4*5 = factorial

//    public static int getFactorial(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//
//        int product = 1;
//        for (int i = 1; i <= n; i++) {
//            product *= i;
//        }
//        return product;
//    }

    public static void greet() {
        System.out.println("Hello World");

        greet();
    }
}
