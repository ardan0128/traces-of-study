class Solution {
    public String decodeMessage(String key, String message) {
        int a = 97;
        Map<Character, Character> dictionary = new HashMap<>(key.length());

        for(int i = 0; i < key.length(); i++){
            char k = key.charAt(i);

            if(k != ' '){
                if(!dictionary.containsKey(k)){
                    dictionary.put(k, (char) a++);
                }
            }
        }

        StringBuilder sb = new StringBuilder(message.length());

        for(int i = 0; i < message.length(); i++){
            char decoded = ' ';

            if(message.charAt(i) != ' '){
                decoded = dictionary.get(message.charAt(i));
                sb.append(decoded);
            }else{
                sb.append(decoded);
            }
        }

        return sb.toString();
    }
}