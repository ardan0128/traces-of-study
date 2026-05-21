class Solution {
    public String restoreString(String s, int[] indices) {
        int n = s.length();
        char[] c = new char[n];

        for(int i = 0; i < n; i++){
            c[indices[i]] = s.charAt(i);
        }

        return new String(c);
    }
}