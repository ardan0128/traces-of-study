class Solution {
    public int specialArray(int[] nums) {
        for(int i = 0; i <= nums.length; i++){
            int count = 0;

            for(int num : nums){
                if(num >= i){
                    count++;
                }
            }

            if(i == count){
                return i;
            }
        }

        return -1;
    }
}