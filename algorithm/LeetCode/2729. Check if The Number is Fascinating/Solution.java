class Solution {
    public boolean isFascinating(int n) {
        int[] count = new int[10];
        int digits = 0;
        int n2 = n * 2;
        int n3 = n * 3;

        while(n != 0){
            int temp = n % 10;

            if(temp == 0 || ++count[temp] > 1){
                return false;
            }

            digits++;
            n /= 10;
        }

        while(n2 != 0){
            int temp = n2 % 10;

            if(temp == 0 || ++count[temp] > 1){
                return false;
            }

            digits++;
            n2 /= 10;
        }

        while(n3 != 0){
            int temp = n3 % 10;

            if(temp == 0 || ++count[temp] > 1){
                return false;
            }

            digits++;
            n3 /= 10;
        }

        return digits == 9;
    }
}