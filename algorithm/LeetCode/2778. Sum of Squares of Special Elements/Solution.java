class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for(int i = 1; i <= n; i++){
            int temp = nums[i - 1];
            
            if(n % i == 0){
                sum += temp * temp;
            }
        }

        return sum;
    }
}