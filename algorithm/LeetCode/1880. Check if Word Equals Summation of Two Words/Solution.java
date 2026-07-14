class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int firstValue = getNumValue(firstWord);
        int secondValue = getNumValue(secondWord);
        int targetValue = getNumValue(targetWord);

        return firstValue + secondValue == targetValue;
    }

    private int getNumValue(String s){
        int value = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int num = c - 'a';
            value = value * 10 + num;
        }

        return value;
    }
}