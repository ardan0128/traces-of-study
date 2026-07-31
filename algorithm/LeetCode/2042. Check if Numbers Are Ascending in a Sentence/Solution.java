class Solution {
    public boolean areNumbersAscending(String s) {
        String[] tokens = s.split(" ");
        int prev = -1;

        for(String token : tokens){
            if(token.matches("\\d+")){
                int num = Integer.parseInt(token);

                if(num <= prev){
                    return false;
                }

                prev = num;
            }
        }

        return true;
    }
}