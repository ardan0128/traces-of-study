class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;
        int days = n % 7;
        int total = ((weeks * (weeks - 1)) / 2) * 7;
        total += weeks * 28;
        total += ((days * (days + 1)) / 2) + (weeks * days);

        return total;
    }
}