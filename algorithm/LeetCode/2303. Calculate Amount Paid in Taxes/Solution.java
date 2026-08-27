class Solution {
    public double calculateTax(int[][] brackets, int income) {
        int prev = 0;
        double tax = 0.0;

        for(int i = 0; i < brackets.length; i++){
            int cur = brackets[i][0];
            int per = brackets[i][1];

            if(income <= prev){
                break;
            }

            int temp = Math.min(income, cur) - prev;
            tax += temp * per / 100.0;

            prev = cur;
        }

        return tax;
    }
}