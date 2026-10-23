class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int p1 = getScore(player1);
        int p2 = getScore(player2);

        if(p1 == p2){
            return 0;
        }

        return p1 > p2 ? 1 : 2;
    }

    private int getScore(int[] player){
        int score = 0;
        int prev1 = -1;
        int prev2 = -1;

        for(int pins : player){
            if(prev1 == 10 || prev2 == 10){
                score += pins * 2;
            }else{
                score += pins;
            }

            prev2 = prev1;
            prev1 = pins;
        }

        return score;
    }
}