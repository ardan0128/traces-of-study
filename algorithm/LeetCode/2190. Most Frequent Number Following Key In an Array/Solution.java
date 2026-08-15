class Solution {
    public int mostFrequent(int[] nums, int key) {
        int[] arr = new int[1001];

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == key){
                arr[nums[i + 1]]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int idx = 0;

        for(int i = 0; i < 1001; i++){
            if(arr[i] > max){
                max = arr[i];
                idx = i;
            }
        }

        return idx;
    }
}