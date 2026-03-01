
class Solution {

    public String toGoatLatin(String sentence) {
        Set<Character> vowels = new HashSet<>(
                Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        );
        String result = "";
        int i = 0;
        int j = 0;

        for (String s : sentence.split("\\s")) {
            result += " " + (vowels.contains(s.charAt(0)) ? s : s.substring(1) + s.charAt(0)) + "ma";

            for (j = 0, ++i; j < i; ++j) {
                result += "a";
            }
        }

        return result.substring(1);
    }
}
