import java.util.Arrays;

// BACK TRACKING
public class NQueens {
    private static void solveNQueens(int[] board,  int row, int n) {
        if (row == n) {
            System.out.println(Arrays.toString(board));
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row] = col;
                solveNQueens(board, row + 1, n);
                board[row] = -1;
            }
        }
    }

    private static boolean isSafe(int[] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col ||
                    board[i] - i == col - row ||
                    board[i] + i == col + row) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("NQueens using back tracking");

        int n = 4;
        int[] board = new int[n];
        // board = [0,0,0,0]
        Arrays.fill(board, -1);
        // board = [-1,-1,-1,-1]
        solveNQueens(board, 0, n);
    }
}
