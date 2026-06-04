class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(map.containsKey(c)){
                int diff = i - map.get(c);
                max = Math.max(max, diff);
            }else{
                map.put(c, i);
            }
        }

        return max - 1;
    }
}