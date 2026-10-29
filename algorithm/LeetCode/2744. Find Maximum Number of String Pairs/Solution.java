class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int n = words.length;
        int count = 0;

        for(int i = 0; i < n - 1; i++){
            String word = words[i];
            char c1 = word.charAt(0);
            char c2 = word.charAt(1);
            int start = i + 1;
            int end = n - 1;

            while(start <= end){
                String s1 = words[start];
                String s2 = words[end];

                if(s1.charAt(0) == c2 && s1.charAt(1) == c1){
                    count++;
                }

                if(start != end && s2.charAt(0) == c2 && s2.charAt(1) == c1){
                    count++;
                }

                start++;
                end--;
            }
        }

        return count;
    }
}