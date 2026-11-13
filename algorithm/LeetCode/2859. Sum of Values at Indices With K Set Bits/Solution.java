class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;

        for(int i = 0; i < nums.size(); i++){
            if(bitCount(i) == k){
                sum += nums.get(i);
            }
        }

        return sum;
    }

    private int bitCount(int num){
        int count = 0;

        while(num != 0){
            count += num & 1;
            num >>= 1;
        }

        return count;
    }
}