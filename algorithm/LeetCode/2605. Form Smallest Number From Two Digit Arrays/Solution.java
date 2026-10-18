class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        boolean[] seen1 = new boolean[10];
        boolean[] seen2 = new boolean[10];
        int min1 = 10;
        int min2 = 10;

        for(int num : nums1){
            seen1[num] = true;
            min1 = num < min1 ? num : min1;
        }

        for(int num : nums2){
            seen2[num] = true;
            min2 = num < min2 ? num : min2;
        }

        for(int i = 1; i < 10; i++){
            if(seen1[i] && seen2[i]){
                return i;
            }
        }

        return min1 < min2 ? min1 * 10 + min2 : min2 * 10 + min1;
    }
}