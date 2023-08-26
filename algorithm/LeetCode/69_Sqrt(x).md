```java
class Solution {
    public int mySqrt(int x) {
        int result = 0;

        while(x >= (result + 1) * ((long) result + 1)){
            result++;
        }

        return result;
    }
}
```

```java
class Solution {
    public int mySqrt(int x) {
        if(x < 2){
            return x;
        }

        int L = 1;
        int R = x / 2;
        int M = 0;
        int result = 0;

        while(L <= R){
            M = (L + R) / 2;
            long value = (long) M * M;

            if(x == value){
                return M;
            }else if(x > value){
                L = M + 1;
                result = M;
            }else{
                R = M - 1;
            }
        }

        return result;
    }
}
```
