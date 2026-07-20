class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = 0;

        for(String word : words){
            boolean isType = true;

            for(char c : brokenLetters.toCharArray()){
                if(word.indexOf(c) != -1){
                    isType = false;
                    break;
                }
            }

            if(isType){
                count++;
            }
        }

        return count;
    }
}