class Solution {
    public List<String> stringMatching(String[] words) {
        int l = words.length;
        List<String> result = new ArrayList<>();

        for(int i = 0; i < l; i++){
            for(int j = 0; j < l; j++){
                if(i != j && words[j].contains(words[i])){
                    result.add(words[i]);
                    break;
                }
            }
        }

        return result;
    }
}