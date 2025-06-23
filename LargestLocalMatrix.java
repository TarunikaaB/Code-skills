import java.util.Scanner;

public class LargestLocalMatrix {

    // Method to find the max value in a 3x3 subgrid
    public static int largestValue(int[][] grid, int r, int c) {
        int maxValue = 0;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                maxValue = Math.max(maxValue, grid[i][j]);
            }
        }
        return maxValue;
    }

    // Method to build the largest local matrix
    public static int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] ans = new int[n - 2][n - 2];

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                ans[i][j] = largestValue(grid, i, j);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter the size of the square matrix (n >= 3): ");
        int n = scanner.nextInt();
        int[][] grid = new int[n][n];

        // Input matrix values
        System.out.println("Enter the matrix values row-wise:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        int[][] result = largestLocal(grid);

        // Output result
        System.out.println("Resulting matrix with local maximums:");
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
