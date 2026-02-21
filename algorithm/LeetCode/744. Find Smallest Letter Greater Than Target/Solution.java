
class Solution {

    public char nextGreatestLetter(char[] letters, char target) {
        char result = letters[0];
        boolean flag = false;

        for (char letter : letters) {
            if (!flag) {
                if (letter > target) {
                    result = letter;
                    flag = !flag;
                }
            } else {
                if (letter > target && letter < result) {
                    result = letter;
                }
            }
        }

        return result;
    }
}
