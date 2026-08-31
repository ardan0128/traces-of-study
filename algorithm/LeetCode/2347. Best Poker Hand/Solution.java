class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        int suitArr[] = new int[4];
        int rankArr[] = new int[14];

        for(int i = 0; i < 5; i++){
            rankArr[ranks[i]]++;
        }

        for(int i = 0; i < 5; i++){
            suitArr[suits[i] - 'a']++;
        }

        int suit = 0;
        int rank = 0;
        
        for(int i = 1; i < 14; i++){
            rank = Math.max(rank, rankArr[i]);
        }

        for(int i = 0; i < 4; i++){
            suit = Math.max(suit, suitArr[i]);
        }

        if(suit == 5){
            return "Flush";
        }else if(rank >= 3){
            return "Three of a Kind";
        }else if(rank >= 2){
            return "Pair";
        }else{
            return "High Card";
        }
    }
}