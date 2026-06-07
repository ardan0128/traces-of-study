class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int[][] map = new int[101][];

        for (int[] p : pieces) {
            map[p[0]] = p;
        }

        for (int i = 0; i < arr.length;) {
            int e = arr[i];

            if (map[e] == null) {
                return false;
            }

            int[] part = map[e];

            for (int j = 1; j < part.length; j++) {
                if (arr[i + j] != part[j]) {
                    return false;
                }
            }

            i += part.length;
        }

        return true;
    }
}