public class TimeComplexity {
    public static void main(String[] args) {
        System.out.println("Time Complexity");

        int[] arr = {0,1,2,3,4,5,6};
        int n = arr.length;

        System.out.println(arr[5]);         // 1 operation or constant number of operation = constant time complexity

        System.out.println(isPresent(arr, 1));      // 1 operation - best case
        System.out.println(isPresent(arr, 5));      //  ~5 operation - average case
        System.out.println(isPresent(arr, 0));      //  10 operation - worst case

        printArrayComb(arr);

        // worst case is dependent on array size - n
        // operations directly proportional to n
    }

    // linear search = O(N) - N size of the array
    // O(N) - linear time complexity
    public static boolean isPresent(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return true;
            }
        }
        return false;
    }

    // 2 nested loops
    // arr.length n = 10
    // operations = 100
    // TC = O(n^2) - quadratic
    public static void printArrayComb(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i] + " " + arr[j] + " , ");
            }
            System.out.println();
        }
    }



    // 3 loops
    // O(n^3)
}
