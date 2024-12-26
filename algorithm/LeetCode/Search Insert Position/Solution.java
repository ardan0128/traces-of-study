
class Solution {

    public int searchInsert(int[] nums, int target) {
        int L = 0;
        int R = nums.length - 1;
        int M = 0;

        while (L <= R) {
            M = (L + R) / 2;

            if (nums[M] == target) {
                return M;
            } else if (nums[M] < target) {
                L = M + 1;
            } else if (nums[M] > target) {
                R = M - 1;
            }
        }

        if (nums[M] <= target) {
            return M + 1;
        }

        return M;
    }
}
