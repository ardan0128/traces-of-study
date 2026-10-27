class Solution {
    public int minimizedStringLength(String s) {
        boolean[] temp = new boolean[26];
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            int idx = s.charAt(i) - 'a';

            if(!temp[idx]){
                temp[idx] = true;
                count++;
            }
        }

        return count;
    }
}