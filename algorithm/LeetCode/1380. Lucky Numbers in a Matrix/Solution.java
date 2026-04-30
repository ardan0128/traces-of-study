class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int N = matrix.length;
        int M = matrix[0].length;
        
        int rln = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){
            int rMin = Integer.MAX_VALUE;

            for(int j = 0; j < M; j++){
                rMin = Math.min(rMin, matrix[i][j]);
            }

            rln = Math.max(rln, rMin);
        }

        int cln = Integer.MAX_VALUE;

        for(int i = 0; i < M; i ++){
            int cMax = Integer.MIN_VALUE;

            for(int j = 0; j < N; j++){
                cMax = Math.max(cMax, matrix[j][i]);
            }

            cln = Math.min(cln, cMax);
        }

        if(rln == cln){
            return new ArrayList<>(Arrays.asList(rln));
        }

        return new ArrayList<>();
    }
}