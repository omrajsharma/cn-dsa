public class Sorting {
    public static void main(String[] args) {
        int[] arr = {12,11,13,7,6,5};

        System.out.println("Original Array: " + java.util.Arrays.toString(arr));

        mergeSort(arr, 0, arr.length-1);

        System.out.println("Merge Sorted Array: " + java.util.Arrays.toString(arr));

        arr = new int[]{12, 11, 13, 7, 6, 5};
        System.out.println("Original Array: " + java.util.Arrays.toString(arr));

        quickSort(arr, 0, arr.length-1);
        System.out.println("Quick Sorted Array: " + java.util.Arrays.toString(arr));
    }

    /**
     * Quick Sort
     * - Pivot
     * - Partition
     */
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);

            quickSort(arr, left, pivot-1);      // left partition sort
            quickSort(arr, pivot+1, right);      // right partition sort
        }
    }

    /**
     * 1. Place pivot at the right location in the array
     * 2. return the right location
     */
    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];     // last element
        System.out.println();
        System.out.println(String.format("pivot = %d, left = %d, right = %d", pivot, left, right));


        int i = left - 1;       // i = -1

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;

        System.out.println("Running: Before Swap " + java.util.Arrays.toString(arr));

        int temp = arr[i];
        arr[i] = arr[right];
        arr[right] = temp;

        System.out.println("Running: After Swap Swap " + java.util.Arrays.toString(arr));
        System.out.println("Pivot Index: " + i);

        return i;
    }


    // sorts the array
    private static void mergeSort(int[] arr, int left, int right) {
        // arr = {12,11,13,7,6,5}
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);              // 11, 12, 13, 7, 6, 5
            mergeSort(arr, mid + 1, right);     // 11, 12, 13, 5, 6, 7

            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        // 11, 12, 13, 5, 6, 7
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];        // 0, 0, 0
        int[] rightArr = new int[n2];       // 0, 0, 0

        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        // leftArr = 11, 12, 13

        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }
        // rightArr = 5, 6, 7

        // sort two sorted array into one array
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            }
            else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }



    // ASSIGNMENT - WHY IT'S TIME COMPLEXITY IS N^2

    /**
     * n = 10
     *
     * N * N = O(N^2)
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * tc - O(N^2)
     */
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            System.out.println(java.util.Arrays.toString(arr));
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];

            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = temp;
        }
    }
}
