class Solution {
    public int divisorSubstrings(int num, int k) {
        int nums = num;
        int count = 0;
        int div = (int) Math.pow(10,k);

        while(nums >= div / 10){
            int substr = nums % div;

            if(substr != 0 && num % substr == 0){
                count++;
            }

            nums /= 10;
        }
        
        return count;
    }
}