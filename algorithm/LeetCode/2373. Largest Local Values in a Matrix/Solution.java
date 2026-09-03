class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] result = new int[n - 2][n - 2];

        for(int row = 0; row < n - 2; row++){
            for(int col = 0; col < n - 2; col++){
                result[row][col] = findLargest(grid, row, col);
            }
        }

        return result;
    }

    private int findLargest(int[][] grid, int row, int col){
        int max = grid[row][col];

        for(int i = row; i < row + 3; i++){
            for(int j = col; j < col + 3; j++){
                max = Math.max(max, grid[i][j]);
            }
        }

        return max;
    }
}