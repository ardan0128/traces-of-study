class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int n = word1.length();
        int[] counts = new int[26];

        for(int i = 0; i < n; i++){
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);

            counts[c1 - 'a']++;
            counts[c2 - 'a']--;
        }

        for(int count : counts){
            if(count > 3 || count < -3){
                return false;
            }
        }

        return true;
    }
}