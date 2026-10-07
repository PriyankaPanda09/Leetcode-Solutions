class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int xorAll = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                xorAll ^= grid[i][j];
            }
        }
        for (int i = 1; i <= n * n; i++) {
            xorAll ^= i;
        }
        int rightmostSetBit = xorAll & -xorAll;
        int repeat = 0;
        int missing = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((grid[i][j] & rightmostSetBit) != 0) {
                    repeat ^= grid[i][j];
                } else {
                    missing ^= grid[i][j];
                }
            }
        }
        for (int i = 1; i <= n * n; i++) {

            if ((i & rightmostSetBit) != 0) {
                repeat ^= i;
            } else {
                missing ^= i;
            }

        }
        int firstCount =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] == repeat) firstCount++;
            }
        }
        if(firstCount == 2){
            return new int[] { repeat, missing };
        }

        return new int[] {missing , repeat };
    }
}