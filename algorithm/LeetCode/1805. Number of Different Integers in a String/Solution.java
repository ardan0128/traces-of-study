class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        int n = word.length();
        int start = 0;

        while(start < n){
            if(Character.isDigit(word.charAt(start))){
                int end = start;

                while(end < n && Character.isDigit(word.charAt(end))){
                    end++;
                }

                while(start < end && word.charAt(start) == '0'){
                    start++;
                }

                set.add(word.substring(start, end));
                start = end;
            }else{
                start++;
            }
        }

        return set.size();
    }
}