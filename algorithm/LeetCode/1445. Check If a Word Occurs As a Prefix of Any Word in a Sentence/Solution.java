class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int index = 0;

        for(String s : sentence.split(" ")){
            if(s.startsWith(searchWord)){
                return index + 1;
            }

            index++;
        }

        return -1;
    }
}