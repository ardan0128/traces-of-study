class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        while(low <= high){
            if(isSymmetric(low)){
                count++;
            }

            low++;
        }

        return count;
    }

    private boolean isSymmetric(int num){
        if(num > 10 && num < 100){
            return num / 10 == num % 10;
        }else if(num > 1000 && num < 10000){
            int left = num / 100;
            int right = num % 100;

            return left / 10 + left % 10 == right / 10 + right % 10;
        }

        return false;
    }
}