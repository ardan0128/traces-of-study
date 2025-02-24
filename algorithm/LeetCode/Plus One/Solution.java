
class Solution {

    public int[] plusOne(int[] digits) {
        int lastIdx = digits.length - 1;

        digits[lastIdx]++;

        for (int i = lastIdx; i > 0; i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i - 1]++;
            } else {
                break;
            }
        }

        if (digits[0] == 10) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            result[1] = 0;

            if (digits.length > 2) {
                for (int i = 2; i < result.length; i++) {
                    result[i] = digits[i - 1];
                }
            }

            return result;
        }

        return digits;
    }
}
