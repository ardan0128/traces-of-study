class Solution {
    public int captureForts(int[] forts) {
        int max = 0;
        int idx = -1;

        for(int i = 0; i < forts.length; i++){
            if(forts[i] != 0){
                if(idx != -1 && forts[i] != forts[idx]){
                    max = Math.max(max, i - idx - 1);
                }

                idx = i;
            }
        }

        return max;
    }
}