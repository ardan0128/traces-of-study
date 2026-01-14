
class Solution {

    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long secoundMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for (int x : nums) {
            if (x > max) {
                thirdMax = secoundMax;
                secoundMax = max;
                max = x;

            } else if (x > secoundMax && max != x) {
                thirdMax = secoundMax;
                secoundMax = x;

            } else if (x > thirdMax && secoundMax != x && max != x) {
                thirdMax = x;
            }
        }
        if (thirdMax != Long.MIN_VALUE) {
            return (int) thirdMax; 
        }else {
            return (int) max;
        }
    }
}
