class Solution {
    public int maxScore(String s) {
        int oneTotal = 0;

        for(char c : s.toCharArray()){
            if(c == '1'){
                oneTotal++;
            }
        }

        int zeroCount = 0;
        int oneCount = 0;
        int score = Integer.MIN_VALUE;

        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == '0'){
                zeroCount++;
            }else{
                oneCount++;
            }

            int cur = zeroCount + (oneTotal - oneCount);
            score = Math.max(score, cur);
        }

        return score;
    }
}