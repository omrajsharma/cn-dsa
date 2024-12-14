public class Sorting {
    public static void main(String[] args) {
        int[] arr = {12,11,13,7,6,5};

        System.out.println("Original Array: " + java.util.Arrays.toString(arr));

        mergeSort(arr, 0, arr.length-1);

        System.out.println("Sorted Array: " + java.util.Arrays.toString(arr));
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
