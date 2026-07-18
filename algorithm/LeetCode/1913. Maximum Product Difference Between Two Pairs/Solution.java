class Solution {
    public int maxProductDifference(int[] nums) {
        int minFirst = Integer.MAX_VALUE;
        int minSecond = Integer.MAX_VALUE;
        int maxFirst = 0;
        int maxSecond = 0;

        for(int num : nums){
            if(num < minFirst){
                minSecond = minFirst;
                minFirst = num;
            }else if(num < minSecond){
                minSecond = num;
            }

            if(num > maxFirst){
                maxSecond = maxFirst;
                maxFirst = num;
            }else if(num > maxSecond){
                maxSecond = num;
            }
        }

        return maxFirst * maxSecond - minFirst * minSecond;
    }
}