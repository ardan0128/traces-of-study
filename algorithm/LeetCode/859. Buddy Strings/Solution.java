
class Solution {

    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        int l = s.length();

        if (s.equals(goal)) {
            Set<Character> temp = new HashSet<>();

            for (char c : s.toCharArray()) {
                temp.add(c);
            }

            return temp.size() < goal.length();
        }

        int i = 0;
        int j = l - 1;

        while (i < j && s.charAt(i) == goal.charAt(i)) {
            i++;
        }

        while (j >= 0 && s.charAt(j) == goal.charAt(j)) {
            j--;
        }

        if (i < j) {
            char[] cArr = s.toCharArray();
            char temp = cArr[i];

            cArr[i] = cArr[j];
            cArr[j] = temp;
            s = new String(cArr);
        }

        return s.equals(goal);
    }
}
