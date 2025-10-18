import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NQueens {
    public static boolean isSafe(int[][] board, int row, int col, int n) {
        // Check column above (no need to check below, we place top to bottom)
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }
        
        // Check upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        
        // Check upper right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        
        // Position is safe
        return true;
    }
    public static void solve(int[][] board, int row, int n, List<int[][]> solutions) {
        // Base case: all queens placed successfully
        if (row == n) {
            // Create a copy of the board and add to solutions
            int[][] solution = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    solution[i][j] = board[i][j];
                }
            }
            solutions.add(solution);
            return;
        }
        
        // Try placing queen in each column of current row
        for (int col = 0; col < n; col++) {
            // Check if placing queen here is safe
            if (isSafe(board, row, col, n)) {
                // Place queen
                board[row][col] = 1;
                
                // Recursively place queens in next rows
                solve(board, row + 1, n, solutions);
                
                // Backtrack: remove queen
                board[row][col] = 0;
            }
        }
    }
    
    /**
     * Solve the N-Queens problem
     * 
     * @param n Size of the board
     * @return List of all valid board configurations
     */
    public static List<int[][]> solveNQueens(int n) {
        List<int[][]> solutions = new ArrayList<>();
        int[][] board = new int[n][n];
        
        // Start solving from row 0
        solve(board, 0, n, solutions);
        
        return solutions;
    }

    public static void printBoard(int[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input
        System.out.print("n = ");
        int n = scanner.nextInt();
        
        // Validate input
        if (n < 1 || n > 9) {
            System.out.println("n must be between 1 and 9");
            scanner.close();
            return;
        }
        
        // Solve N-Queens
        List<int[][]> solutions = solveNQueens(n);
        
        // Print first solution (if exists)
        if (solutions.size() > 0) {
            printBoard(solutions.get(0), n);
        } else {
            System.out.println("No solution found");
        }
        
        scanner.close();
    }
}
