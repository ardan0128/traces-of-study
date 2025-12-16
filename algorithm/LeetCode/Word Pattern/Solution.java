
class Solution {

    public boolean wordPattern(String pattern, String s) {
        String[] patterns = pattern.split("");
        String[] words = s.split(" ");

        if (patterns.length != words.length) {
            return false;
        }

        Map<String, String> seen = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            String p = patterns[i];
            String w = words[i];
            String keyP = "p_" + p;
            String keyW = "w_" + w;

            if (seen.containsKey(keyP) && !seen.get(keyP).equals(w)) {
                return false;
            }
            if (seen.containsKey(keyW) && !seen.get(keyW).equals(p)) {
                return false;
            }

            seen.put(keyP, w);
            seen.put(keyW, p);
        }

        return true;
    }
}
