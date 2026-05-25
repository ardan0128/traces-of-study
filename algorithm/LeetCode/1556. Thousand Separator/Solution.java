class Solution {
    public String thousandSeparator(int n) {
        StringBuilder sb = new StringBuilder();
        String num = String.valueOf(n);

        for(int i = 0; i < num.length(); i++){
            if(i != 0 && (num.length() - i) % 3 == 0){
                sb.append(".");
            }
            sb.append(num.charAt(i));
        }

        return sb.toString();
    }
}