class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for(int[] account : accounts){
            int sum = 0;
            
            for(int i = 0; i < account.length; i++){
                sum += account[i];
            }

            max = Math.max(max, sum);
        }

        return max;
    }
}