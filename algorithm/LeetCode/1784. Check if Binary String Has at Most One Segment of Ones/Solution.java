class Solution {
    public boolean checkOnesSegment(String s) {
        boolean isFlag = false;

        for(char c : s.toCharArray()){
            if(c == '0'){
                isFlag = true;
            }else if(isFlag){
                return false;
            }
        }

        return true;
    }
}