class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int result = nums[k - 1] - nums[0];

        for(int i = 0; i + k <= nums.length; i++){
            result = Math.min(result, nums[i + k - 1] - nums[i]);
        }

        return result;
    }
}