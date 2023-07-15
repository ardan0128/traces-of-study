```java
class Solution {
    public void reverseString(char[] s) {
        int a = 0;
        int b = s.length - 1;

        while(a < b){
            char temp = s[b];
            s[b] = s[a];
            s[a] = temp;

            a++;
            b--;
        }
    }
}


```
