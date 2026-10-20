class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int row = -1;
        int max = -1;

        for(int i = 0; i < mat.length; i++){
            int now = 0;

            for(int num : mat[i]){
                now += num;
            }

            if(now > max){
                max = now;
                row = i;
            }
        }

        return new int[] {row, max};
    }
}