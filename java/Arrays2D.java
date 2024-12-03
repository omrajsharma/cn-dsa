public class Arrays2D {
    public static void main(String[] args) {
        System.out.println("### 2D Arrays class ###");

        int[] arr = {1,2,3,4,5};

        System.out.println(java.util.Arrays.toString(arr));

        int[][] arr2d = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(java.util.Arrays.toString(arr2d));

        // Print 2d array row and column wise
        print2DArray(arr2d);

        int[][] arr2d1 = new int[4][4];
        int[][] arr2d2 = new int[4][4];


        System.out.println(arr2d1.length);
        System.out.println(arr2d1[0].length);

        // print 2d array
        print2DArray(arr2d1);

        // update array
        int counter = 1;
        for (int i = 0; i < arr2d1.length; i++) {
            for (int j = 0; j < arr2d1[0].length; j++) {
                arr2d1[i][j] = counter++;
                arr2d2[i][j] = counter * 2;
            }
            System.out.println();
        }

        // print array
        print2DArray(arr2d1);

        // print spiral
        printSpiral(arr2d1);

        System.out.println();
        multiplyMatrix(arr2d1, arr2d2);
    }

    public static void multiplyMatrix(int[][] arr1, int[][] arr2) {
        // base condition
        if (arr1[0].length != arr2.length) {
            System.out.println("Multiplication not possible");
            return;
        }

        // create new matrix
        int[][] resultMatrix = new int[arr1.length][arr2[0].length];

        // put multiplication values
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    resultMatrix[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        // print

        print2DArray(arr1);
        print2DArray(arr2);
        print2DArray(resultMatrix);

    }

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printSpiral(int[][] arr) {
        if (arr == null || arr.length == 0) return;

        int top = 0, bottom = arr.length - 1, left = 0, right = arr[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;

            for (int i = top; i <= bottom ; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }


}
