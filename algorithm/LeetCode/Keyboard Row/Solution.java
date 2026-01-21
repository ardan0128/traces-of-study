
class Solution {

    public String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        List<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String[] word = words[i].toLowerCase().split("");
            String temp = "";
            boolean flag = true;

            if (s1.contains(word[0])) {
                temp = s1; 
            }else if (s2.contains(word[0])) {
                temp = s2; 
            }else {
                temp = s3;
            }

            for (int j = 1; j < word.length; j++) {
                if (!temp.contains(word[j])) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                list.add(words[i]);
            }
        }

        return list.toArray(new String[list.size()]);
    }
}
