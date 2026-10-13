class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        long sum = 0;
        String temp = "";

        while(l <= r){
            if(l == r){
                temp = String.valueOf(nums[l]);
            }else{
                temp = String.valueOf(nums[l]) + String.valueOf(nums[r]);
            }

            sum += Integer.parseInt(temp);

            l++;
            r--;
        }

        return sum;
    }
}