class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int n = words.length;
        int count = 0;

        for(String word: words){
            for(char c : word.toCharArray()){
                if(!allowed.contains(String.valueOf(c))){
                    count++;
                    break;
                }
            }
        }

        return n - count;
    }
}