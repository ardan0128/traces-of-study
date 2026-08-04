class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> word1 = new HashMap<>();
        Map<String, Integer> word2 = new HashMap<>();

        for(String word : words1){
            word1.put(word, word1.getOrDefault(word, 0) + 1);
        }

        for(String word : words2){
            word2.put(word, word2.getOrDefault(word, 0) + 1);
        }

        int count = 0;

        for(String word : words1){
            if(word1.get(word) == 1 && word2.getOrDefault(word, 0) == 1){
                count++;
            }
        }

        return count;
    }
}