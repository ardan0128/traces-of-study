class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;
        int max = Integer.MIN_VALUE;

        while(left < right){
            int sum = nums[left] + nums[right];

            if(sum == 0){
                max = Math.max(max, nums[right]);
                left++;
                right--;
            }else if(sum < 0){
                left++;
            }else{
                right--;
            }
        }

        return max != Integer.MIN_VALUE ? max : -1;
    }
}