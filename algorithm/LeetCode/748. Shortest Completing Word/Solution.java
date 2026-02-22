
class Solution {

    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] required = new int[26];

        for (char c : licensePlate.toCharArray()) {
            if (Character.isLetter(c)) {
                required[Character.toLowerCase(c) - 'a']++;
            }
        }

        String result = null;

        for (String word : words) {

            int[] freq = new int[26];

            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
            }

            if (matches(required, freq)) {
                if (result == null || word.length() < result.length()) {
                    result = word;
                }
            }
        }

        return result;
    }

    private boolean matches(int[] required, int[] freq) {
        for (int i = 0; i < 26; i++) {
            if (freq[i] < required[i]) {
                return false;
            }
        }
        return true;
    }
}
