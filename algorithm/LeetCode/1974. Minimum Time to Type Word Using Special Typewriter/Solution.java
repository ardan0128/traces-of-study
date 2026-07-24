class Solution {
    public int minTimeToType(String word) {
        int result = 0;
        char pointer = 'a';

        for(char c : word.toCharArray()){
            int clockwise = Math.abs(c - pointer);
            int counterclockwise = 26 - clockwise;

            result += Math.min(clockwise, counterclockwise) + 1;
            pointer = c;
        }

        return result;
    }
}