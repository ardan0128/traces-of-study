class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        String s = "";

        for(String word : words){
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String temp = new String(c);

            if(!temp.equals(s)){
                result.add(word);
                s = temp;
            }
        }

        return result;
    }
}