
class Solution {

    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] result = new int[rows * cols][];
        result[0] = new int[]{rCenter, cCenter};
        int idx = 1;
        int lim = Math.max(rCenter, rows - rCenter - 1) + Math.max(cCenter, cols - cCenter - 1);

        for (int i = 1; i <= lim; i++) {
            int r = rCenter - i;
            int c = cCenter;

            for (int j = i; j > 0; j--) {
                if (r >= 0 && c >= 0) {
                    result[idx++] = new int[]{r, c};
                }

                r++;
                c--;
            }

            for (int j = i; j > 0; j--) {
                if (r < rows && c >= 0) {
                    result[idx++] = new int[]{r, c};
                }

                r++;
                c++;
            }

            for (int j = i; j > 0; j--) {
                if (r < rows && c < cols) {
                    result[idx++] = new int[]{r, c};
                }

                r--;
                c++;
            }

            for (int j = i; j > 0; j--) {
                if (r >= 0 && c < cols) {
                    result[idx++] = new int[]{r, c};
                }

                r--;
                c--;
            }
        }

        return result;
    }
}
