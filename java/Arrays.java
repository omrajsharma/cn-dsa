public class Arrays {
    public static void main(String[] args) {
        System.out.println("### ARRAYS ###");

        /**
         * What is an array?
         * Collection of similar data types
         */

        int a;      // declaration
        a = 10;     // initialisation

        // DECLARATION OF ARRAYS
        int[] arr;
        int arr1[];

        // INITIALISATION
        int [] arr3 = new int[15];
        System.out.println("arr3 " + java.util.Arrays.toString(arr3));

        int [] arr4 = {1,2,3,4,5,6,7,8};
        System.out.println("arr4 " + java.util.Arrays.toString(arr4));

        for (int i = 0; i < 15; i++) {
            arr3[i] = i * 3;
        }
        System.out.println("arr3 " + java.util.Arrays.toString(arr3));

        // ACCESSING ELEMENTS IN AN ARRAY
        System.out.println(arr3[5]);
        // System.out.println(arr3[15]);       // exception - index out of bound

        // System.out.println("arr3 " + arr3);      // why do we print array like java.util.Arrays.toString(arr3)

        // QUESTION - PRINT ALL VALUES IN THE ARRAY arr3
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + ", ");
        }
        System.out.println();

        // FOR EACH LOOP
        for (int el : arr3) {
            System.out.print(el + ", ");
        }
        System.out.println();

        int[] arr5 = {1,2,3,4,5};
        int[] arr6 = {6,7,8,9,0};

        System.out.println("arr5 " + java.util.Arrays.toString(arr5));
        System.out.println("arr6 " + java.util.Arrays.toString(arr6));

        arr6 = arr5;
        arr5[0] = 11;

        System.out.println("arr5 " + java.util.Arrays.toString(arr5));
        System.out.println("arr6 " + java.util.Arrays.toString(arr6));

        modifyArr(arr6);

        System.out.println("arr5 " + java.util.Arrays.toString(arr5));
        System.out.println("arr6 " + java.util.Arrays.toString(arr6));

        reassign(arr6);

        System.out.println("What is the output");

        System.out.println("arr5 " + java.util.Arrays.toString(arr5));
        System.out.println("arr6 " + java.util.Arrays.toString(arr6));


        // question - find max and min value in the array
        int[] arr8 = {5,1,4,9,2,12,11,8};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int el : arr8) {
            if (el < min) {
                min = el;
            }
            if (el > max) {
                max = el;
            }
        }
        System.out.println("min : " + min);
        System.out.println("max : " + max);

        // question - sum of elements
        int sum = 0;
        for (int el : arr8) {
            sum += el;
        }
        System.out.println(sum);

        // question - reverse of an array
        int[] arr9 = new int[arr8.length];

        for (int i = arr8.length-1; i >= 0; i--) {
            arr9[arr8.length - i - 1] = arr8[i];
        }
        System.out.println("arr8 " + java.util.Arrays.toString(arr8));
        System.out.println("arr9 " + java.util.Arrays.toString(arr9));

        // question - find second largest in the array
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int el : arr8) {
            if (largest < el) {
                secondLargest = largest;
                largest = el;
            } else if (secondLargest < el) {
                secondLargest = el;
            }
        }
        System.out.println(secondLargest);

        // question - WAF to search a value in the array
        System.out.println(isPresent(arr8, 90));

        // question - find third largest in the array - hw
    }

    public static boolean isPresent(int[] arr, int val) {
        for (int el : arr) {
            if (el == val) return true;
        }
        return false;
    }

    public static void reassign(int[] arr) {
        arr = new int[] {1,2,3,4,5};
    }

    public static void modifyArr(int[] arr) {
        arr[0] = 99;
    }
}
