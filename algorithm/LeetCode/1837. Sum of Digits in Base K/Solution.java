class Solution {
    public int sumBase(int n, int k) {
        int result = 0;

        while(n >= k){
            result += (n % k);
            n /= k;
        }

        if(n > 0){
            result += n;
        }

        return result;
    }
}