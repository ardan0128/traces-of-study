
class Solution {

    public int balancedStringSplit(String s) {
        int count = 0;
        int balanced = 0;

        for (char c : s.toCharArray()) {
            if (c == 'L') {
                balanced++;
            } else {
                balanced--;
            }

            if (balanced == 0) {
                count++;
            }
        }

        return count;
    }
}
