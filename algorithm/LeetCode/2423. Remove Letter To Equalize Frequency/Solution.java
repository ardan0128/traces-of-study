class Solution {
    public boolean equalFrequency(String word) {
        int[] letters = new int[26];

        for(char c : word.toCharArray()){
            letters[c - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(letters[i] == 0){
                continue;
            }

            letters[i]--;

            if(isValid(letters)){
                return true;
            }

            letters[i]++;
        }

        return false;
    }
    
    private boolean isValid(int[] letters){
        int expected = 0;

        for(int letter : letters){
            if(letter == 0){
                continue;
            }

            if(expected == 0){
                expected = letter;
            }else if(letter != expected){
                return false;
            }
        }

        return true;
    }
}