class Solution {
    public int passThePillow(int n, int time) {
        int completed = time / (n - 1);
        int remaining = time % (n - 1);
        int result = 0;

        if(completed % 2 != 0){
            result = n - remaining;
        }else{
            result = remaining + 1;
        }

        return result;
    }
}