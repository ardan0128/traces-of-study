class Solution {
    public int minLength(String s) {
        int n = s.length();
        char[] chars = new char[n];
        int idx = 0;

        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            chars[idx++] = c;

            if(idx > 1 && ((c == 'B' && chars[idx - 2] == 'A') || (c == 'D' && chars[idx - 2] == 'C'))){
                idx -= 2;
                continue;
            }
        }

        return idx;
    }
}