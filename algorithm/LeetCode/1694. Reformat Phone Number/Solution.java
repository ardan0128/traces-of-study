class Solution {
    public String reformatNumber(String number) {
        int n = number.length();
        char[] chars = new char[n + n / 3];
        int idx = 0;

        for(int i = 0; i < n; i++){
            char c = number.charAt(i);

            if(c >= '0' && c <= '9'){
                chars[idx++] = c;

                if(idx % 4 == 3){
                    chars[idx++] = '-';
                }
            }
        }

        if(idx % 4 == 0){
            idx--;
        }

        if(chars[idx - 2] == '-'){
            chars[idx - 2] = chars[idx - 3];
            chars[idx - 3] = '-';
        }

        return new String(chars, 0, idx);
    }
}