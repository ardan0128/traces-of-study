
class Solution {

    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> charMap = new HashMap<>();

        for (char c : chars.toCharArray()) {
            charMap.put(c, 1 + charMap.getOrDefault(c, 0));
        }

        int result = 0;

        for (String word : words) {
            Map<Character, Integer> copyMap = new HashMap<>(charMap);

            for (char c : word.toCharArray()) {
                if (copyMap.containsKey(c) && copyMap.get(c) != 0) {
                    copyMap.put(c, copyMap.get(c) - 1);
                } else {
                    result -= word.length();
                    break;
                }
            }

            result += word.length();
        }

        return result;
    }
}
