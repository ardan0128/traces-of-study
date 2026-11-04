class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>(words.size() * 3);

        for(String word : words){
            int sIdx = 0;
            int n = word.length();

            for(int i = 0; i < n; i++){
                if(word.charAt(i) == separator){
                    if(sIdx < i){
                        result.add(word.substring(sIdx, i));
                    }

                    sIdx = i + 1;
                }
            }

            if(sIdx < n){
                result.add(word.substring(sIdx));
            }
        }

        return result;
    }
}