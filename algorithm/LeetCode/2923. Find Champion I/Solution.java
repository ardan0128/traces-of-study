class Solution {
    public int findChampion(int[][] grid) {
        int team = 0;
        int n = grid.length;

        for(int i = 0; i < n; i++){
            if(i == team){
                continue;
            }

            if(grid[team][i] == 0){
                team = i;
            }
        }

        return team;
    }
}