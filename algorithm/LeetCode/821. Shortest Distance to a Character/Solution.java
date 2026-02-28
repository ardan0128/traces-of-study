
class Solution {

    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] result = new int[n];

        for (int i = 0; i < n; ++i) {
            result[i] = s.charAt(i) == c ? 0 : n;
        }

        for (int i = 1; i < n; ++i) {
            result[i] = Math.min(result[i], result[i - 1] + 1);
        }

        for (int i = n - 2; i >= 0; --i) {
            result[i] = Math.min(result[i], result[i + 1] + 1);
        }

        return result;
    }
}
