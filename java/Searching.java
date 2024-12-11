public class Searching {
    public static void main(String[] args) {
        int[] arr = {3,6,4,9,2};

        System.out.println(isPresent(arr, 90));
        // tc - O(n)

        // ASSIGNMENT - FIRST ELEMENT INDEX - indexOf, LAST ELEMENT INDEX - lastIndexOff

        // ASSIGNMENT - CHECK IS ARRAY IS SORTED

        int[] sortedArray = {1,3,5,7,9,11,13,15,17,19};

        // ASSIGNMENT - BINARY SEARCH IN ROTATED SORTED ARRAY

    }

    // O(n) - n is size of the input - linear
    public static boolean isPresent(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    /**
     * int val = arr[10];
     * When an operation is not dependent on the input - O(1) - ASSIGNMENT
     */

    public static boolean binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
