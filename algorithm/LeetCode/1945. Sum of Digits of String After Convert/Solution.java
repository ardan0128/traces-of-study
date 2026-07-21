class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sNum = new StringBuilder();

        for(char c : s.toCharArray()){
            sNum.append(c - 'a' + 1);
        }

        while(k > 0){
            int sum = 0;

            for(char c : sNum.toString().toCharArray()){
                sum += c - '0';
            }

            sNum = new StringBuilder(String.valueOf(sum));
            k--;
        }

        return Integer.parseInt(sNum.toString());
    }
}