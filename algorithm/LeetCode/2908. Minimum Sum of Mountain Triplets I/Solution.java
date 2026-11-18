class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                if(nums[i] < nums[j]){
                    for(int k = j + 1; k < n; k++){
                        if(nums[k] < nums[j]){
                            min = Math.min(min, nums[i] + nums[j] + nums[k]);
                        }
                    }
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}