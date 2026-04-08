
class Solution {

    public int maxNumberOfBalloons(String text) {
        int[] f = new int[26];

        for (char c : text.toCharArray()) {
            f[c - 'a']++;
        }

        if (f['l' - 'a'] <= 1 || f['o' - 'a'] <= 1) {
            return 0;
        }

        if (f['b' - 'a'] < 1 || f['a' - 'a'] < 1 || f['n' - 'a'] < 1) {
            return 0;
        }

        int minLO = Math.min(f['l' - 'a'], f['o' - 'a']);
        int minBAN = Math.min(f['b' - 'a'], Math.min(f['a' - 'a'], f['n' - 'a']));

        return Math.min(minLO / 2, minBAN);
    }
}
