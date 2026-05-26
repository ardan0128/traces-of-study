class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        for (int i = 0; i + m * k <= arr.length; i++) {
            boolean valid = true;

            for (int j = 0; j < m * (k - 1); j++) {
                if (arr[i + j] != arr[i + j + m]) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                return true;
            }
        }

        return false; 
    }
}