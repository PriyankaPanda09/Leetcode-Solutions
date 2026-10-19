//Brute Force Approach
class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // initialize the top neighbours; defaults to -1 if out of boundart
                int up = -1;
                if(i>0){
                    //current cell is not in the top row, so fetch the upper neighbor
                    up = mat[i - 1][j];
                }

                // Initialize bottom neighbor; defaults to -1 if out of boundary
                int down = -1;
                if(i+1 < rows){
                // Current cell is not in the bottom row, so fetch the lower neighbor
                    down = mat[i+1][j];
                }
                // Initialize left neighbor; defaults to -1 if out of boundary
                int left = -1;
                if (j > 0) {
                    // Current cell is not in the leftmost column, so fetch the left neighbor
                    left = mat[i][j - 1];
                }

                // Initialize right neighbor; defaults to -1 if out of boundary
                int right = -1;
                if (j + 1 < cols) {
                    // Current cell is not in the rightmost column, so fetch the right neighbor
                    right = mat[i][j + 1];
                }

                // Check if current cell is strictly greater than all valid neighbors
                if (mat[i][j] > up && mat[i][j] > down &&
                    mat[i][j] > left && mat[i][j] > right) {
                    // Found a valid peak, return its coordinates immediately
                    return new int[]{i, j};
                }
            }
        }
         return new int[]{-1, -1};
    }
}