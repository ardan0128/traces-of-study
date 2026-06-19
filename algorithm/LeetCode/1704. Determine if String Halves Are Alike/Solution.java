class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        int count = 0;
        int mid = s.length() / 2;

        for(int i = 0; i < mid; i++){
            char a = s.charAt(i);
            char b = s.charAt(i + mid);

            if(vowels.contains(a)){
                count++;
            }

            if(vowels.contains(b)){
                count--;
            }
        }

        return count == 0;
    }
}