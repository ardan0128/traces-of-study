class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for(int i = 0; i < n; i++){
            Set<Integer> rs = new HashSet<>();
            Set<Integer> cs = new HashSet<>();

            for(int j = 0; j < n; j++){
                rs.add(matrix[i][j]);
                cs.add(matrix[j][i]);
            }

            if(rs.size() != n || cs.size() != n){
                return false;
            }
        }

        return true;
    }
}