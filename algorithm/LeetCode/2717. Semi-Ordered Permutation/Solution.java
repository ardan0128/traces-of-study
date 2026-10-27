class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int n = nums.length;
        int min = 0;
        int max = 0;

        for(int i = 0; i < n; i++){
            int num = nums[i];

            if(num == 1){
                min = i;
            }

            if(nums[i] == n){
                max = i;
            }
        }

        int swap = min + (n - 1 - max);

        return min > max ? swap - 1 : swap;
    }
}