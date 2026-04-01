
class Solution {

    public void duplicateZeros(int[] arr) {
        int[] result = new int[arr.length];
        int idx = 0;

        for (int i = 0; i < arr.length && idx < arr.length; i++) {
            if (arr[i] == 0) {
                idx += 2;
            } else {
                result[idx] = arr[i];
                idx++;
            }
        }

        for (int i = 0; i < result.length; i++) {
            arr[i] = result[i];
        }
    }
}
