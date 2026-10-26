class Solution {
    public int buyChoco(int[] prices, int money) {
        int one = Integer.MAX_VALUE;
        int two = Integer.MAX_VALUE;

        for(int price : prices){
            if(price < one){
                two = one;
                one = price;
            }else{
                two = Math.min(two, price);
            }
        }

        int over = money - (one + two);

        return over >= 0 ? over : money;
    }
}