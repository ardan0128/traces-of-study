
class Solution {

    public boolean checkPerfectNumber(int num) {
        int sum = 0;

        for (int i = 1; i * i < num - 1; i++) {
            if (num % i == 0) {
                if (i != (num / i)) {
                    sum += (num / i);
                }

                sum += i;
            }
        }

        if (num == sum - num) {
            return true;
        }

        return false;
    }
}
