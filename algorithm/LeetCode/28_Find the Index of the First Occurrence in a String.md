```java
class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
```

```java
class Solution {
    public int strStr(String haystack, String needle) {
        int[] lps = new int[needle.length()];
        int idx = 0;

        for (int i = 1; i < needle.length(); i++) {
            while (!(idx == 0 || needle.charAt(i) == needle.charAt(idx))) {
                idx = lps[idx - 1];
            }
            if (needle.charAt(i) == needle.charAt(idx)) {
                idx += 1;
                lps[i] = idx;
            }
        }

        idx = 0;

        for (int i = 0; i < haystack.length(); i++) {
            while (!(idx == 0 || haystack.charAt(i) == needle.charAt(idx))) {
                idx = lps[idx-1];
            }
            if (haystack.charAt(i) == needle.charAt(idx)) {
                if (idx == needle.length() - 1) {
                    return i - idx;
                }
                idx += 1;
            }
        }

        return -1;
    }
}
```
