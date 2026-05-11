class Solution {
    public int maxPower(String s) {
        int result = 1;
        int current = 1;

        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                current++;
                result = Math.max(result, current);
            }else{
                current = 1;
            }
        }

        return result;
    }
}