class Solution {
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int max = 0;

        for(int i = 0; i < n; i++){
            int main = nums[i][i];
            int sec = nums[i][n - 1 - i];
            
            if(main > max && isPrime(main)){
                max = main;
            }

            if(sec > max && isPrime(sec)){
                max = sec;
            }
        }

        return max;
    }

    private boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}