
class Solution {

    public String reverseStr(String s, int k) {
        char[] str = s.toCharArray();
        int n = str.length;

        for (int i = 0; i <= n - 1; i += 2 * k) {
            if (i + k <= n - 1) {
                reverseStr(i, i + k - 1, str);
            } else {
                reverseStr(i, n - 1, str);
            }
        }

        String ans = new String(str);

        return ans;
    }

    public void reverseStr(int i, int j, char[] str) {
        while (i < j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;

            i++;
            j--;
        }
    }
}
