
class Solution {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result = new ArrayList();
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            result.add(new ArrayList());
        }

        k %= rows * cols;

        int totalCell = rows * cols;
        int start = totalCell - k;
        int count = 0;

        for (int i = start; i < start + totalCell; i++) {
            int row = (i / cols) % rows;
            int col = i % cols;

            result.get(count / cols).add(grid[row][col]);
            count++;
        }

        return result;
    }
}
