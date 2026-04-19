
class Solution {

    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                int num = (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0');
                sb.append((char) (num - 1 + 'a'));
                i -= 2;
            } else {
                int num = s.charAt(i) - '0';
                sb.append((char) (num - 1 + 'a'));
            }
        }

        return sb.reverse().toString();
    }
}
