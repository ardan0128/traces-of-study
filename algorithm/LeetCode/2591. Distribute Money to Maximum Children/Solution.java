class Solution {
    public int distMoney(int money, int children) {
        if (money < children) {
            return -1;
        }

        money -= children;
        int count = money / 7;
        int remainder = money % 7;

        if (count == children && remainder == 0) {
            return children;
        }
        if (count >= children) {
            return children  - 1;
        }
        if (count == children - 1 && remainder == 3) {
            return count - 1;
        }
        return count;
    }
}