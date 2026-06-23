class Solution {
    public int largestAltitude(int[] gain) {
        int now = 0;
        int max = 0;

        for(int g : gain){
            now += g;
            max = Math.max(max, now);
        }

        return max;
    }
}