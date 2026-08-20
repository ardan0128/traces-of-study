class Solution {
    public int findClosestNumber(int[] nums) {
        int distance = Math.abs(nums[0] - 0);
        int num = nums[0];

        for(int i = 1; i < nums.length; i++){
            int nowDistance = Math.abs(nums[i] - 0);

            if(nowDistance < distance || (nowDistance == distance && nums[i] > num)){
                num = nums[i];
                distance = nowDistance;
            }
        }

        return num;
    }
}