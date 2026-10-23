class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] diff = new int[n];
        boolean[] seen = new boolean[51];
        int distinct = 0;

        for(int i = 0; i < n; i++){
            if(!seen[nums[i]]){
                seen[nums[i]] = true;
                distinct++;
            }

            prefix[i] = distinct;
        }

        seen = new boolean[51];
        distinct = 0;

        for(int i = n - 1; 0 <= i; i--){
            suffix[i] = distinct;

            if(!seen[nums[i]]){
                seen[nums[i]] = true;
                distinct++;
            }
        }

        for(int i = 0; i < n; i++){
            diff[i] = prefix[i] - suffix[i];
        }

        return diff;
    }
}