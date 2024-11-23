public class Loops {
    public static void main(String[] args) {
        System.out.println("Loops Class");

        /**
         * For, while, do while
         */

        int[] arr = {100,200,300,400};

//        for (int i = 0; i < 4; i++) {
//            System.out.println( arr[i] );
//        }

//        int i = 0;
//        while(i < 4) {
//            System.out.println(arr[i]);
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.println(arr[i]);
//            i++;
//        } while( i < 4);



        // write a loop to print 1 - 100
        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
        }

        // write a loop to print even numbers
        for (int i = 2; i <= 100; i+=2) {
            System.out.println(i);
        }

        // write a loop to print sum of n numbers
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum : " + sum);

        // write a loop to print multiplication table
        int num = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (i*num));
        }

        // Count digits in a number
        num = 123456789;
        int ans = 0;
        while (num > 0) {
            num /= 10;
            ans++;
        }
        System.out.println(ans);

        // Sum of digits
        // Reverse a number

        // Fibonacci series
        // 0 1 1 2 3 5 8 13 21 .....
        int first = 0, second = 1;
        int maxVal = 100;

        System.out.println("FIBONACCI SERIES");
        System.out.println(first);
        System.out.println(second);
        while ( (first + second) < maxVal) {
            System.out.println(first + second);

            int next = first + second;
            first = second;
            second = next;
        }

        // check a number is prime or not
        num = 10;
        System.out.println(isPrime(11));

        // find prime numbers between two numbers
        System.out.println("PRIME NUMBERS BETWEEN TWO NUMBERS");
        int a = 10 ;
        int b = 40;
        while (a <= b) {
            boolean isPrime = isPrime(a);
            if (isPrime) {
                System.out.println(a);
            }
            a++;
        }


        /**
         *     *
         *    ***
         *   *****
         *  *******
         */

        num = 10 ;
        for (int i = 1; i <= num; i++ ) {

            // adds spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            // adds stars
            for (int k = 1; k <= (2*i - 1); k++) {
                System.out.print("#");
            }

            System.out.println();
        }

        // mirror image of this tree

        // make diamond
    }


    public static boolean isPrime(int n) {
        if (n < 0) return false;

        for (int i = 2; i <= Math.sqrt(n); i ++) {
            if (n % i == 0) return false;
        }

        return true;
    }

}
