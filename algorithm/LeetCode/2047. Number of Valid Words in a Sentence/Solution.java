class Solution {
    public int countValidWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        int count = 0;

        for(String word : words){
            if(
                hyphenCheck(word) &&
                digitCheck(word) &&
                punctuationCheck(word)
            ){
                count++;
            }
        }

        return count;
    }

    private boolean hyphenCheck(String s){
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '-'){
                count++;
                
                if(count > 1){
                    return false;
                }

                if(i == 0 || i == s.length() - 1){
                    return false;
                }

                if(
                    !Character.isLowerCase(s.charAt(i - 1)) ||
                    !Character.isLowerCase(s.charAt(i + 1))
                ){
                    return false;
                }
            }
        }

        return true;
    }

    private boolean digitCheck(String s){
        for(char c : s.toCharArray()){
            if(c >= '0' && c <= '9'){
                return false;
            }
        }

        return true;
    }

    private boolean punctuationCheck(String s){
        for(int i = 0; i < s.length() - 1; i++){
            if(
                s.charAt(i) == '.' ||
                s.charAt(i) == '!' ||
                s.charAt(i) == ','
            ){
                return false;
            }
        }

        return true;
    }
}