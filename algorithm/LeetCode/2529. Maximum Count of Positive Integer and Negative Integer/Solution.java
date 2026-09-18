class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int neg = 0;
        int pos = 0;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] < 0){
                neg = mid + 1;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        left = 0;
        right = n - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] > 0){
                pos = n - mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return Math.max(neg, pos);
    }
}