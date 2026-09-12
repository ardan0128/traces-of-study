class Solution {
    public int distinctAverages(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;

        Arrays.sort(nums);

        for(int i = 0; i < n / 2; i++){
            int sum = nums[i] + nums[n - 1 - i];
            set.add(sum);
        }

        return set.size();
    }
}