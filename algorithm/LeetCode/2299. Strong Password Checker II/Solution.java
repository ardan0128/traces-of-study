class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int n = password.length();

        if(n < 8){
            return false;
        }

        boolean isLow = false;
        boolean isUp = false;
        boolean isDigit = false;
        boolean isSpec = false;

        for(int i = 0; i < n; i++){
            char c = password.charAt(i);

            if(i != n - 1 && c == password.charAt(i + 1)){
                return false;
            }else if(c >= 'a' && c <= 'z'){
                isLow = true;
            }else if(c >= 'A' && c <= 'Z'){
                isUp = true;
            }else if(c >= '0' && c <= '9'){
                isDigit = true;
            }else if("!@#$%^&*()-+".indexOf(c) != -1){
                isSpec = true;
            }
        }

        return isLow && isUp && isDigit && isSpec;
    }
}