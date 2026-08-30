class Solution {
    public int[] numberOfPairs(int[] nums) {
        int pairs = 0;
        int leftover = 0;
        int[] arr = new int[101];

        for(int num : nums){
            arr[num]++;
        }

        for(int num : arr){
            pairs += num / 2;
            leftover += num % 2;
        }

        return new int[]{pairs, leftover};
    }
}