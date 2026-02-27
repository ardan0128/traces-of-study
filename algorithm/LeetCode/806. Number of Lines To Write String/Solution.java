
class Solution {

    public int[] numberOfLines(int[] widths, String s) {
        int result = 1;
        int current = 0;

        for (char c : s.toCharArray()) {
            int width = widths[c - 'a'];
            result = current + width > 100 ? result + 1 : result;
            current = current + width > 100 ? width : current + width;
        }

        return new int[]{result, current};
    }
}
