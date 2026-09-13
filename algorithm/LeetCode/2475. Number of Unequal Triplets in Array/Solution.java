class Solution {
    public int unequalTriplets(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int ans = n * (n - 1) * (n - 2) / 6;

        for(int cnt : map.values()){
            if(cnt < 2){
                continue;
            }

            int same3 = cnt * (cnt - 1) * (cnt - 2) / 6;
            int same2 = (n - cnt) * cnt * (cnt - 1) / 2;
            ans -= same3 + same2;
        }

        return ans;
    }
}