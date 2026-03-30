
class Solution {

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int lengthGCD = gcd(str1.length(), str2.length());

        return str1.substring(0, lengthGCD);
    }

    private int gcd(int length1, int length2) {
        while (length2 != 0) {
            int temp = length1 % length2;
            length1 = length2;
            length2 = temp;
        }

        return length1;
    }
}
