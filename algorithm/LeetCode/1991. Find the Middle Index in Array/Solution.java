class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n + 1];
        leftSum[0] = 0;
        int total = 0;

        for(int i = 1; i <= n; i++){
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
            total += nums[i - 1];
        }

        for(int i = 0; i < n; i++){
            int rightSum = total - nums[i] - leftSum[i];

            if(leftSum[i] == rightSum){
                return i;
            }
        }

        return -1;
    }
}