public class Arrays {
    public static void main(String[] args) {
        System.out.println("### ARRAYS ###");

        // SYNTAX
        int [] arr;
        int arr1 [];

        // INITIALISE
        int [] arr2 = new int[5];

        System.out.println(java.util.Arrays.toString(arr2));        // [0, 0, 0, 0, 0]

        System.out.println(arr2);                                   // [I@7b23ec81
        /**
         * [I: Indicates it is a single-dimensional array of integers.
         * @hashcode: The memory address-like hash code of the array object (not the actual memory address but derived from the array's hash code).
         */


        // INITIALISING ARRAY
        int[] arr3 = {1,2,3,4,5};

        int[] arr4 = new int[10];
        for (int i = 1; i <= 10; i++) {
            arr4[i-1] = i * 2;
        }
        System.out.println(java.util.Arrays.toString(arr4));

        // ACCESSING INDEXES
        System.out.println(arr3[2]);
        // System.out.println(arr3[10]);       // EXCEPTION - Index 10 out of bounds for length 5

        // FOR EACH LOOP
        for (int el : arr4) {
            System.out.println(el);
        }




    }
}
