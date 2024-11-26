public class Arrays2 {
    public static void main(String[] args) {
        System.out.println("### ARRAYS 2 ###");

        /**
         * INSERT INTO AN ARRAY
         * REVERSING AN ARRAY
         * - WITH SPACE
         * - WITHOUT SPACE
         * ROTATION OF ARRAY
         * - LEFT
         * - RIGHT
         * - OPTIMISED
         */

        int[] arr = {1,2,3,4,5};
        System.out.println(java.util.Arrays.toString(arr));

        int pos = 2;        // index position
        int newEl = 10;

        arr = insertIntoArr(arr, pos, newEl);
        System.out.println(java.util.Arrays.toString(arr));


        int deleteIdx = 1;
        arr = removeFromArray(arr, deleteIdx);
        System.out.println(java.util.Arrays.toString(arr));

        arr = reverseArray(arr);
        System.out.println(java.util.Arrays.toString(arr));

        int[] arr1 = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(java.util.Arrays.toString(arr1));

        int rotateBy = 6;
//        arr1 = rotateArr(arr1, rotateBy);
        System.out.println(java.util.Arrays.toString(arr1));

        reverse(arr1, 0, arr1.length - 1);

        reverse(arr1, 0, rotateBy - 1);

        reverse(arr1, rotateBy, arr1.length - 1);

        System.out.println(java.util.Arrays.toString(arr1));
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static int[] rotateArr(int[] arr, int rotateBy) {
        int[] newArr = new int[arr.length];

        for (int i = 0; i < rotateBy; i++) {
            newArr[i] = arr[arr.length - rotateBy + i];
        }

        for (int i = 0; i < arr.length - rotateBy; i++) {
            newArr[i + rotateBy] = arr[i];
        }

        return newArr;
    }

    private static int[] insertIntoArr(int[] arr, int pos, int newEl) {
        if (pos < 0 || pos >= arr.length) {
            System.out.println("Invalid position");
            return arr;
        }

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        newArr[pos] = newEl;

        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }

    // WAF to remove an element from the array
    private static int[] removeFromArray(int[] arr, int pos) {
        if (pos < 0 || pos >= arr.length) {
            System.out.println("Invalid position");
            return arr;
        }

        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        for (int i = pos + 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }

        return newArr;
    }

    private static int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start ++;
            end--;
        }

        return arr;
    }
}
