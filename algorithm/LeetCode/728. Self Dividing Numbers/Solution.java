
class Solution {

    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isDivide(i)) {
                result.add(i);
            }
        }

        return result;
    }

    private boolean isDivide(int n) {
        int num = n;

        while (n > 0) {
            int rem = n % 10;

            if (rem == 0 || num % rem != 0) {
                return false;
            }

            n /= 10;
        }

        return true;
    }
}
