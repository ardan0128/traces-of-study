class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26){
            return false;
        }

        boolean[] alphabet = new boolean[26];

        for(char c : sentence.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                alphabet[c - 'a'] = true;
            }
        }

        for(boolean flag : alphabet){
            if(!flag){
                return false;
            }
        }

        return true;
    }
}