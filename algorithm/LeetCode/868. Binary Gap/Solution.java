
class Solution {

    public int binaryGap(int n) {
        int maxGap = 0;
        int currGap = -1;

        while (n != 0) {
            if ((n & 1) == 1) {
                if (currGap != -1) {
                    maxGap = Math.max(maxGap, currGap);
                }

                currGap = 1;
            } else {
                if (currGap != -1) {
                    currGap++;
                }
            }

            n >>= 1;
        }

        return maxGap;
    }
}
