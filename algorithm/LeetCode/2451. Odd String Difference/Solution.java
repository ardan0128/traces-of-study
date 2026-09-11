class Solution {
    public String oddString(String[] words) {
        Map<List<Integer>, Integer> map1 = new HashMap<>();
        Map<String, List<Integer>> map2 = new HashMap<>();

        for(int i = 0; i < words.length; i++){
            List<Integer> diff = indexDiff(words[i]);
            map2.put(words[i], diff);
            map1.put(diff, map1.getOrDefault(diff, 0) + 1);
        }

        for(String key: map2.keySet()){
            if(map1.get(map2.get(key)) == 1){
                return key;
            }
        }

        return "";
    }

    private List<Integer> indexDiff(String s){
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i < s.length(); i++){
            list.add((s.charAt(i) - 'a') - (s.charAt(i - 1) - 'a'));
        }

        return list;
    }
}