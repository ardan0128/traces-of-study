```java
class Solution {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if('A' <= s.charAt(i) && s.charAt(i) <= 'Z'){
                result.append((char)('a' + s.charAt(i) - 'A'));
            }else{
                result.append((char)(s.charAt(i)));
            }
        }

        return result.toString();
    }
}
```
