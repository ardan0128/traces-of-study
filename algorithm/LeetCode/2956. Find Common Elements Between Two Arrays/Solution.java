class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        boolean[] bool1 = new boolean[101];
        boolean[] bool2 = new boolean[101];
        int answer1 = 0;
        int answer2 = 0;

        for(int num : nums1){
            bool1[num] = true;
        }

        for(int num : nums2){
            bool2[num] = true;
        }

        for(int num : nums1){
            if(bool2[num]){
                answer1++;
            }
        }

        for(int num : nums2){
            if(bool1[num]){
                answer2++;
            }
        }

        return new int[]{answer1, answer2};
    }
}