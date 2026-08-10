class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int total = 0;
        int n = cost.length;

        for(int i = 0; i < n; i += 3){
            total += cost[n - 1 -i];

            if(i + 1 < n){
                total += cost[n - 1 - (i + 1)];
            }
        }

        return total;
    }
}