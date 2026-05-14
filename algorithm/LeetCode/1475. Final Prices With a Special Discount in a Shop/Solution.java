class Solution {
    public int[] finalPrices(int[] prices) {
        for(int i = 0; i < prices.length; i++){
            prices[i] = getDiscount(prices, i);
        }

        return prices;
    }

    public int getDiscount(int[] prices, int index){
        for(int i = index + 1; i < prices.length; i++){
            if(prices[i] <= prices[index]){
                return prices[index] - prices[i];
            }
        }

        return prices[index];
    }
}