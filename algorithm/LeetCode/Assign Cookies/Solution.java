
class Solution {

    public int findContentChildren(int[] g, int[] s) {
        int cookieSize = s.length;

        if (cookieSize == 0) {
            return 0;
        }

        Arrays.sort(g);
        Arrays.sort(s);

        int maxNum = 0;
        int cookieIndex = cookieSize - 1;
        int childIndex = g.length - 1;

        while (cookieIndex >= 0 && childIndex >= 0) {
            if (s[cookieIndex] >= g[childIndex]) {
                maxNum++;
                cookieIndex--;
                childIndex--;
            } else {
                childIndex--;
            }
        }

        return maxNum;
    }
}
