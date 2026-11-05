class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder(s.length());

        for(char c : s.toCharArray()){
            if(c == 'i'){
                sb.reverse();
                continue;
            }

            sb.append(c);
        }

        return sb.toString();
    }
}