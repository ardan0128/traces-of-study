
class Solution {

    public int lengthOfLastWord(String s) {
        String[] sArr = s.split(" ");
        return sArr[sArr.length - 1].length();
    }
}
