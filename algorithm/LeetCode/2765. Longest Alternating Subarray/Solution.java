class Solution {
    public int alternatingSubarray(int[] nums) {
        int max = -1;
        int n = 1;
        int expected = 1;

        for(int i = 1; i < nums.length; i++){
            int diff = nums[i] - nums[i - 1];

            if(diff == expected){
                n++;
                expected *= -1;
            }else if(diff == 1){
                n = 2;
                expected = -1;
            }else{
                n = 1;
                expected = 1;
            }

            if(n > 1){
                max = Math.max(max, n);
            }
        }

        return max;
    }
}