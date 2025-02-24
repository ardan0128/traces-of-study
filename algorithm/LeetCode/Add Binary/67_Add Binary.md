```java
class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int temp = 0;
        StringBuilder sb = new StringBuilder();

        while(i >= 0 || j >= 0 || temp > 0){
            if(i >= 0){
                temp = temp + a.charAt(i) - '0';
                i--;
            }

            if(j >= 0){
                temp = temp + b.charAt(j) - '0';
                j--;
            }

            sb.append(temp % 2);
            temp = temp / 2;
        }

        return sb.reverse().toString();
    }
}
```
