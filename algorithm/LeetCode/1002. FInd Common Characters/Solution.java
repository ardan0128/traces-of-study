
class Solution {

    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();

        for (char c = 'a'; c <= 'z'; c++) {
            int min = Integer.MAX_VALUE;

            for (String word : words) {
                int count = 0;

                for (char w : word.toCharArray()) {
                    if (w == c) {
                        count++;
                    }
                }

                min = Math.min(min, count);

                if (min == 0) {
                    break;
                }
            }

            for (int i = 0; i < min; i++) {
                result.add(String.valueOf(c));
            }
        }

        return result;
    }
}
