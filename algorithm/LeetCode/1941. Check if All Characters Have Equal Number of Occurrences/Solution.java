class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] letters = new int[26];

        for(char c : s.toCharArray()){
            letters[c - 'a']++;
        }

        int num = letters[s.charAt(0) - 'a'];

        for(int letter : letters){
            if(letter != 0 && letter != num){
                return false;
            }
        }

        return true;
    }
}