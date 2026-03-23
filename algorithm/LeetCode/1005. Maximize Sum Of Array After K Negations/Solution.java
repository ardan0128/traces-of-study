
class Solution {

    public int largestSumAfterKNegations(int[] nums, int k) {
        int[] numbers = new int[201];
        int result = 0;
        int max = 0;

        for (int num : nums) {
            max = Math.max(max, Math.abs(num));
            numbers[100 + num]++;
            result += num;
        }

        if (max == 0) {
            return 0;
        }

        while (k-- != 0) {
            int i = 100 - max;

            while (numbers[i] == 0) {
                i++;
            }

            numbers[i]--;
            numbers[200 - i]++;
            result -= 2 * (i - 100);
        }

        return result;
    }
}
