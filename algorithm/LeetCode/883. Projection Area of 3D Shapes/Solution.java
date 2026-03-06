
class Solution {

    public int projectionArea(int[][] grid) {
        int result = 0;
        int n = grid.length;

        for (int i = 0; i < n; ++i) {
            int x = 0;
            int y = 0;

            for (int j = 0; j < n; ++j) {
                x = Math.max(x, grid[i][j]);
                y = Math.max(y, grid[j][i]);

                if (grid[i][j] > 0) {
                    ++result;
                }
            }

            result += x + y;
        }

        return result;
    }
}
