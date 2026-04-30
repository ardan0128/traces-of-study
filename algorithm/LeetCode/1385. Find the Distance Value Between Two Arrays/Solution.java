class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int distance = 0;

        for(int num : arr1) {
            if(isRange(arr2, num, d)){
                distance++;
            }
        }

        return distance;
    }

    private boolean isRange(int[] arr, int val, int d){
        for(int num : arr) {
            if(Math.abs(val - num) <= d){
                return false;
            }
        }

        return true;
    }
}