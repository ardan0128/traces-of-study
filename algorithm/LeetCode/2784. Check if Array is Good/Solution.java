class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length - 1;

        for(int num : nums){
            if(num > n){
                return false;
            }
        }

        int[] arr = new int[201];

        for(int num : nums){
            arr[num]++;
        }

        if(arr[n] != 2){
            return false;
        }

        for(int i = 1; i < n; i++){
            if(arr[i] != 1){
                return false;
            }
        }

        return true;
    }
}