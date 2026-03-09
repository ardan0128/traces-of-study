
class Solution {

    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> count = new HashMap<>();

        for (String s : (s1 + " " + s2).split(" ")) {
            count.put(s, count.getOrDefault(s, 0) + 1);
        }

        ArrayList<String> result = new ArrayList<>();

        for (String c : count.keySet()) {
            if (count.get(c) == 1) {
                result.add(c);
            }
        }

        return result.toArray(new String[0]);
    }
}
