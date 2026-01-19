
class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCnt = 0;
        int cnt = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
                maxCnt = Math.max(maxCnt, cnt);
            } else {
                cnt = 0;
            }
        }

        return maxCnt;
    }
}
