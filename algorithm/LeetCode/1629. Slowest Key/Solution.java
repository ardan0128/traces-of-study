class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char key = keysPressed.charAt(0);
        int max = releaseTimes[0];

        for(int i = 1; i < releaseTimes.length; i++){
            int diff = Math.abs(releaseTimes[i] - releaseTimes[i - 1]);

            if(diff > max || (diff == max && keysPressed.charAt(i) > key)){
                key = keysPressed.charAt(i);
                max = diff;
            }
        }

        return key;
    }
}