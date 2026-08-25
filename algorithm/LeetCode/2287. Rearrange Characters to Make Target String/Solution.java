class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] sArr = new int[26];
        int[] tArr = new int[26];

        for(char c : s.toCharArray()){
            sArr[c - 'a']++;
        }

        for(char c : target.toCharArray()){
            tArr[c - 'a']++;
        }

        int result = Integer.MAX_VALUE;

        for(int i = 0; i < 26; i++){
            if(tArr[i] > 0){
                result = Math.min(result, sArr[i] / tArr[i]);
            }
        }

        return result;
    }
}