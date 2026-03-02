
class Solution {

    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for (int[] i : image) {
            for (int j = 0; j * 2 < n; j++) {
                if (i[j] == i[n - j - 1]) {
                    i[j] = i[n - j - 1] ^= 1;
                }
            }
        }

        return image;
    }
}
