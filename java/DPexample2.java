public class DPexample2 {
    public static void main(String[] args) {

    }

    // grid - given matrix
    private int minPathSum(int[][] grid) {
        int m = grid.length;        // rows
        int n = grid[0].length;     // columns
        int[][] dp = new int[m][n];

        dp[0][0] = grid[0][0];

        // fill first row
        for (int i = 1; i < m; i++) {
            dp[0][i] = dp[0][i-1] + grid[0][i];
        }

        // fill first column
        for (int j = 1; j < n; j++) {
            dp[j][0] = dp[j-1][0] + grid[j][0];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
            }
        }

        return dp[m-1][n-1];
    }

//    longest increasing subsequence
//    total number of subsequences having sum k
    private int longestCommonSubsequence(String x, String y) {
        int m = x.length();
        int n = y.length();
        int[][] dp = new int[m+1][n+1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[m][n];
    }
}
