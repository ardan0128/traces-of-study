class Solution {
    public int minimumMoves(String s) {
        int move = 0;

        for(int i = 0; i < s.length();){
            if(s.charAt(i) == 'X'){
                move++;
                i += 3;
            }else{
                i++;
            }
        }

        return move;
    }
}