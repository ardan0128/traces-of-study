class Solution {
    public int pivotInteger(int n) {
        int sum = n * (n + 1) / 2;
        double temp = Math.sqrt(sum);

        if(temp - Math.ceil(temp) == 0){
            return (int) temp;
        }else{
            return -1;
        }
    }
}