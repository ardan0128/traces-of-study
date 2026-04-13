
class Solution {

    public int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] cols = new int[n];

        for (int[] index : indices) {
            rows[index[0]]++;
            cols[index[1]]++;
        }

        int oddRows = 0;
        int oddCols = 0;

        for (int r : rows) {
            if (r % 2 == 1) {
                oddRows++;
            }
        }

        for (int c : cols) {
            if (c % 2 == 1) {
                oddCols++;
            }
        }

        return oddRows * (n - oddCols) + (m - oddRows) * oddCols;
    }
}
