class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> hs = new HashSet<>();
        char result = 'a';

        for(int i = 0; i < s.length(); i++){
            if(hs.contains(s.charAt(i))){
                result = s.charAt(i);
                break;
            }

            hs.add(s.charAt(i));
        }

        return result;
    }
}