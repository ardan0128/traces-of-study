
class Solution {

    public int findSpecialInteger(int[] arr) {
        int length = arr.length;
        int quarter = length / 4;

        for (int i = 0; i < length - quarter; i++) {
            if (arr[i] == arr[i + quarter]) {
                return arr[i];
            }
        }

        return -1;
    }
}
