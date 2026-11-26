class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int count = 0;

        for(int device : batteryPercentages){
            if(device - count > 0){
                count++;
            }
        }

        return count;
    }
}