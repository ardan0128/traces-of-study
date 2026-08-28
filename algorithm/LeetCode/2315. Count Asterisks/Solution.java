class Solution {
    public int countAsterisks(String s) {
        int star = 0;
        boolean isInsideBar = false;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '|'){
                isInsideBar = !isInsideBar;
            }

            if(!isInsideBar && s.charAt(i) == '*'){
                star++;
            }
        }

        return star;
    }
}