class Solution {
    public String reorderSpaces(String text) {
        int spaces = 0;

        for(char c: text.toCharArray()) {
            if (c == ' ') {
                spaces++;
            }
        }
        
        List<String> words = splitInWords(text);
        int trailingSpaces = 0;
        StringBuilder result = new StringBuilder();
        
        if (words.size() == 1) {
            trailingSpaces = spaces;
            result.append(words.get(0));
        } else {
            int equalSpaces = spaces / (words.size() - 1);
            trailingSpaces = spaces - equalSpaces * (words.size() - 1);
            StringBuilder spacesString = new StringBuilder();

            for(int i=0; i<equalSpaces; i++) {
                spacesString.append(' ');
            }
         
            for(int i=0; i < words.size(); i++) {
                if (i > 0) {
                    result.append(spacesString.toString());
                }

                result.append(words.get(i));
            }
        }

        while(trailingSpaces > 0) {
            result.append(' ');
            trailingSpaces--;
        }

        return result.toString();
    }
    
    private List<String> splitInWords(String text) {
        List<String> words = new ArrayList<>();
        
        int index = 0;

        while(text.charAt(index) == ' ') {
            index++;
        }
        
        StringBuilder word = new StringBuilder();
        
        while(index < text.length()) {
            if (text.charAt(index) != ' ') {
                word.append(text.charAt(index));
            } else {
                if (word.length() > 0) {
                    words.add(word.toString());
                    word = new StringBuilder();
                }
            }

            index++;
        }
        
        if (word.length() > 0) {
            words.add(word.toString());
        }
        
        return words;
    }
}