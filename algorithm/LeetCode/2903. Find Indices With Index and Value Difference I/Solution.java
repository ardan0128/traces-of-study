class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int min = 0;
        int max = 0;

        for(int i = indexDifference; i < nums.length; i++){
            if(nums[i - indexDifference] < nums[min]){
                min = i - indexDifference;
            }

            if(nums[i - indexDifference] > nums[max]){
                max = i - indexDifference;
            }

            if(nums[i] - nums[min] >= valueDifference){
                return new int[]{i, min};
            }

            if(nums[max] - nums[i] >= valueDifference){
                return new int[]{i, max};
            }
        }

        return new int[]{-1, -1};
    }
}