
class Solution {

    public int countPrimeSetBits(int left, int right) {
        int result = 0;

        for (int i = left; i <= right; i++) {
            int bitCount = Integer.bitCount(i);

            if (isPrime(bitCount)) {
                result++;
            }
        }

        return result;
    }

    private boolean isPrime(int bitCount) {
        if (bitCount <= 1) {
            return false;
        }

        for (int i = 2; i * i <= bitCount; i++) {
            if (bitCount % i == 0) {
                return false;
            }
        }

        return true;
    }
}
