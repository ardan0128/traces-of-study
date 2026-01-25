
class Solution {

    public boolean detectCapitalUse(String word) {
        if (word.length() == 0 || word.length() == 1) {
            return true;
        }

        boolean isFirstUpper = Character.isUpperCase(word.charAt(0));
        boolean isSecondUpper = Character.isUpperCase(word.charAt(1));

        if (isFirstUpper == false && isSecondUpper == true) {
            return false;
        }

        for (int i = 2; i < word.length(); i++) {
            if (isFirstUpper == true && isSecondUpper == true && Character.isUpperCase(word.charAt(i)) == false) {
                return false;
            } else if (isFirstUpper == true && isSecondUpper == false && Character.isUpperCase(word.charAt(i)) == true) {
                return false;
            } else if (isFirstUpper == false && isSecondUpper == false && Character.isUpperCase(word.charAt(i)) == true) {
                return false;
            }
        }

        return true;
    }
}
