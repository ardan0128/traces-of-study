class Solution {
    public String reversePrefix(String word, char ch) {
        int firstCh = word.indexOf(ch);

        if(firstCh == -1){
            return word;
        }

        StringBuilder sb = new StringBuilder(word.substring(0, firstCh + 1)).reverse();

        if(firstCh < word.length()){
            sb.append(word.substring(firstCh + 1));
        }

        return sb.toString();
    }
}