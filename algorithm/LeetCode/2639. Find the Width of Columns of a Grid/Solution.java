class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] ans = new int[n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int l = getLen(grid[i][j]);

                if(ans[j] < l){
                    ans[j] = l;
                }
            }
        }

        return ans;
    }

    private int getLen(int num){
        int n = num <= 0 ? 1 : 0;

        while(num != 0){
            num /= 10;
            n++;
        }

        return n;
    }
}