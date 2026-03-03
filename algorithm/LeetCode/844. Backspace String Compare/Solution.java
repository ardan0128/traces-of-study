
class Solution {

    public boolean backspaceCompare(String s, String t) {
        int sl = s.length() - 1;
        int tl = t.length() - 1;

        while (sl >= 0 || tl >= 0) {
            sl = getNextIndex(s, sl);
            tl = getNextIndex(t, tl);

            if (sl < 0 && tl < 0) {
                return true;
            }

            if (sl < 0 || tl < 0) {
                return false;
            } else if (s.charAt(sl) != t.charAt(tl)) {
                return false;
            }

            sl--;
            tl--;
        }

        return true;
    }

    private int getNextIndex(String s, int e) {
        int backspaceCount = 0;

        while (e >= 0) {
            if (s.charAt(e) == '#') {
                backspaceCount++;
            } else if (backspaceCount > 0) {
                backspaceCount--;
            } else {
                break;
            }

            e--;
        }

        return e;
    }
}
