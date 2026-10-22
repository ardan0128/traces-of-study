class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = 0;

        for(int num : nums){
            max = max < num ? num : max;
        }

        return k * max + (k * (k - 1)) / 2;
    }
}