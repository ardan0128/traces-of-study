class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int pointer1 = 0;
        int pointer2 = 0;
        int index1 = 0;
        int index2 = 0;

        while(pointer1 < word1.length && pointer2 < word2.length){
            char char1 = word1[pointer1].charAt(index1);
            char char2 = word2[pointer2].charAt(index2);

            if(char1 != char2){
                return false;
            }

            index1++;
            index2++;

            if(index1 == word1[pointer1].length()){
                index1 = 0;
                pointer1++;
            }

            if(index2 == word2[pointer2].length()){
                index2 = 0;
                pointer2++;
            }
        }

        return pointer1 == word1.length && pointer2 == word2.length;
    }
}