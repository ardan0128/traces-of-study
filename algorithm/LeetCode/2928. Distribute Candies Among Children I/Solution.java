class Solution {
    public int distributeCandies(int n, int limit) {
        int min = Math.max(0, n - 2 * limit);
        int max = Math.min(n, limit);
        int ways = 0;

        for(int i = min; i <= max; i++){
            int candy = n - i;
            int minCh = Math.max(0, candy - limit);
            int maxCh = Math.min(candy, limit);

            ways += maxCh - minCh + 1;
        }

        return ways;
    }
}