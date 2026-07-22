class Solution {
    public String makeFancyString(String s) {
        int count = 1;
        char last = s.charAt(0);
        StringBuilder result = new StringBuilder();    
        result.append(last);

        for(int i = 1; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == last){
                count++;

                if(count < 3){
                    result.append(c);
                }
            }else{
                count = 1;
                last = c;
                result.append(c);
            }
        }

        return result.toString();
    }
}