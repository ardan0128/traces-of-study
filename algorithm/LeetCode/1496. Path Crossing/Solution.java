class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        Set<String> points = new HashSet<>();
        points.add(x + ", " + y);

        for(char p : path.toCharArray()){
            if(p == 'N'){
                y++;
            }else if(p == 'S'){
                y--;
            }else if(p == 'E'){
                x++;
            }else if(p == 'W'){
                x--;
            }

            if(points.contains(x + ", " + y)){
                return true;
            }

            points.add(x + ", " + y);
        }

        return false;
    }
}