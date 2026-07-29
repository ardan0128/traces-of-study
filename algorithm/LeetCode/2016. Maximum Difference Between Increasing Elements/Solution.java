class Solution {
    public int maximumDifference(int[] nums) {
        int diff = -1;
        int num = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > num){
                diff = Math.max(diff, nums[i] - num);
            }

            if(nums[i] < num){
                num = nums[i];
            }
        }

        return diff;
    }
}