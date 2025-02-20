public class DPexample {
    public static int fibonacci(int n, int[] dp) {
        if (n <= 1) {
            return n;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        return dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);
    }

    public static int climbStairsRecursive(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        return climbStairsRecursive(n - 1) + climbStairsRecursive(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("DP Example");

        // 0 1 1 2 3 5 8 13 21 ....

        int n = 7;
        int[] dp = new int[n + 1];

        System.out.println(fibonacci(n, dp));
    }
}
