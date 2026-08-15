class Solution {
    public List<String> cellsInRange(String s) {
        char c1 = s.charAt(0);
        char r1 = s.charAt(1);
        char c2 = s.charAt(3);
        char r2 = s.charAt(4);
        List<String> result = new ArrayList<>();

        for(char c = c1; c <= c2; c++){
            for(char r = r1; r <= r2; r++){
                result.add(new String(new char[]{c, r}));
            }
        }

        return result;
    }
}