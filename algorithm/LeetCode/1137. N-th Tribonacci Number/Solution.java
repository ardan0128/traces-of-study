
class Solution {

    public int tribonacci(int n) {
        int t1 = 0;
        int t2 = 1;
        int t3 = 1;

        for (int i = 1; i <= n; i++) {
            int t4 = t1 + t2 + t3;
            t1 = t2;
            t2 = t3;
            t3 = t4;
        }

        return t1;
    }
}
