class Solution {
    public int[] evenOddBit(int n) {
        int even = 0;
        int odd = 0;
        int idx = 0;

        while(n != 0){
            boolean isOne = (n & 1) == 1;

            if(isOne){
                if(idx % 2 == 0){
                    even++;
                }else{
                    odd++;
                }
            }

            idx++;
            n >>= 1;
        }

        return new int[]{even, odd};
    }
}