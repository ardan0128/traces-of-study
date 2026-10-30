class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int max = 0;
        int n = 0;

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];

            if(num > threshold){
                n = 0;
            }else if(n == 0){
                n = num % 2 == 0 ? 1 : 0;
            }else if(num % 2 != nums[i - 1] % 2){
                n++;
            }else{
                n = num % 2 == 0 ? 1 : 0;
            }

            max = Math.max(max, n);
        }

        return max;
    }
}