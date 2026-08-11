class Solution {
    public int countElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int count = 0;

        for(int num : nums){
            if(num < min){
                min = num;
            }

            if(max < num){
                max = num;
            }
        }

        for(int num : nums){
            if(min < num && num < max){
                count++;
            }
        }

        return count;
    }
}