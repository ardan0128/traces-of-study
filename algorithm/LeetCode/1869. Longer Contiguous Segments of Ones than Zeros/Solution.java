class Solution {
    public boolean checkZeroOnes(String s) {
        int max0 = 0;
        int max1 = 0;
        int zero = 0;
        int one = 0;

        for(char c : s.toCharArray()){
            if(c == '1'){
                one++;
                zero = 0;
                max1 = Math.max(max1, one);
            }else{
                zero++;
                one = 0;
                max0 = Math.max(max0, zero);
            }
        }

        return max0 < max1;
    }
}