class Solution {
    public int minMaxDifference(int num) {
        String str = Integer.toString(num);
        char[] maxChars = str.toCharArray();
        char[] minChars = str.toCharArray();
        
        char replaceMax = ' ';
        for(char c : maxChars){
            if(c != '9'){
                replaceMax = c;
                break;
            }
        }

        for(int i = 0; i < maxChars.length; i++){
            if(maxChars[i] == replaceMax){
                maxChars[i] = '9';
            }
        }

        char replaceMin = minChars[0];
        for(int i = 0; i < minChars.length; i++){
            if(minChars[i] == replaceMin){
                minChars[i] = '0';
            }
        }

        int max = Integer.parseInt(new String(maxChars));
        int min = Integer.parseInt(new String(minChars));

        return max - min;
    }
}