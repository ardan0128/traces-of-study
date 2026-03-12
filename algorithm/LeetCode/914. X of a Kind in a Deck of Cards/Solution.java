
class Solution {

    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> count = new HashMap<>();
        int result = 0;

        for (int d : deck) {
            count.put(d, count.getOrDefault(d, 0) + 1);
        }

        for (int c : count.values()) {
            result = gcd(c, result);
        }

        return result > 1;
    }

    private int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }
}
