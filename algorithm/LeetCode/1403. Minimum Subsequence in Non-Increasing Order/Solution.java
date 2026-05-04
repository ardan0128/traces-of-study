class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> result = new ArrayList<>();

        Arrays.sort(nums);

        int totalSum = 0;

        for(int num : nums){
            totalSum += num;
        }

        int sum = 0;

        for(int i = nums.length - 1; i >= 0; i--){
            totalSum -= nums[i];
            sum += nums[i];
            result.add(nums[i]);

            if(sum > totalSum){
                return result;
            }
        }

        return result;
    }
}