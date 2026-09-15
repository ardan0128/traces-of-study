class Solution {
    public int maximumValue(String[] strs) {
        int n = strs.length;
        int max = 0;

        for(String s : strs){
            if(isInteger(s)){
                max = Math.max(max, Integer.parseInt(s));
            }else{
                max = Math.max(max, s.length());
            }
        }

        return max;
    }

    private boolean isInteger(String s){
        for(char c : s.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
            }
        }

        return true;
    }
}