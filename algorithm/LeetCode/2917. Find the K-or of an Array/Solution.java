class Solution {
    public int findKOr(int[] nums, int k) {
        int result = 0;
        
        for(int b = 0; b < 31; b++){
            int count = 0;

            for(int num : nums){
                count += (num >> b) & 1;
            }

            if(count >= k){
                result |= (1 << b);
            }
        }

        return result;
    }
}