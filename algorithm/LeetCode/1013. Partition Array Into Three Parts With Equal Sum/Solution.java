
class Solution {

    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;

        for (int a : arr) {
            sum += a;
        }

        if (sum % 3 != 0) {
            return false;
        }

        int target = sum / 3;
        sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i];

            if (sum == target) {
                sum = 0;
                count++;

                if (count == 2) {
                    return true;
                }
            }
        }

        return false;
    }
}
