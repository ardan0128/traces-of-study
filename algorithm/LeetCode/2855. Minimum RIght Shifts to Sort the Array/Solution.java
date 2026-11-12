class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int n = nums.size();

        if(n == 1){
            return 0;
        }

        int count = 0;
        int idx = 0;

        if(nums.get(n - 1) > nums.get(0)){
            count++;
        }

        for(int i = 1; i < n; i++){
            if(nums.get(i - 1) > nums.get(i)){
                idx = i;
                count++;

                if(count > 1){
                    return -1;
                }
            }
        }

        return (n - idx) % n;
    }
}