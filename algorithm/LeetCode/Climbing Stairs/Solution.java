
class Solution {

    public int climbStairs(int n) {
        int[] arr = new int[n + 2];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i < n + 1; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        return arr[n];
    }
}
