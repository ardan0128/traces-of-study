class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        for(int i = left; i <= right; i++){
            boolean isCovered = false;

            for(int[] range : ranges){
                if(range[0] <= i && range[1] >= i){
                    isCovered = true;
                    break;
                }
            }

            if(!isCovered){
                return false;
            }
        }

        return true;
    }
}