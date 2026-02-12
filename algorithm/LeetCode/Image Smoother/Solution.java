
class Solution {

    public int[][] imageSmoother(int[][] img) {
        int rows = img.length;
        int cols = img[0].length;
        int[][] result = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                result[row][col] = average(img, row, col, rows, cols);
            }
        }

        return result;
    }

    private int average(int[][] img, int row, int col, int rows, int cols) {
        int total = 0;
        int count = 0;
        int top = Math.max(0, row - 1);
        int bottom = Math.min(rows, row + 2);
        int left = Math.max(0, col - 1);
        int right = Math.min(cols, col + 2);

        for (int r = top; r < bottom; r++) {
            for (int c = left; c < right; c++) {
                total += img[r][c];
                count++;
            }
        }

        return total / count;
    }
}
