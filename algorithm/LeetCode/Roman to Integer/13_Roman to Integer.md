```java
class Solution {
    public int romanToInt(String s) {
        int result = 0;
        String[] sArr = s.split("");

        for(int i = 0; i < sArr.length; i++){
            if(i == 0){
                if(sArr[i].equals("I")) result += 1;
                else if(sArr[i].equals("V")) result += 5;
                else if(sArr[i].equals("X")) result += 10;
                else if(sArr[i].equals("L")) result += 50;
                else if(sArr[i].equals("C")) result += 100;
                else if(sArr[i].equals("D")) result += 500;
                else if(sArr[i].equals("M")) result += 1000;
            }else{
                if(sArr[i].equals("I")){
                    result += 1;
                }else if(sArr[i].equals("V")){
                    if(sArr[i - 1].equals("I")) result += 3;
                    else result += 5;
                }else if(sArr[i].equals("X")){
                    if(sArr[i - 1].equals("I")) result += 8;
                    else result += 10;
                }else if(sArr[i].equals("L")){
                    if(sArr[i - 1].equals("X")) result += 30;
                    else result += 50;
                }else if(sArr[i].equals("C")){
                    if(sArr[i - 1].equals("X")) result += 80;
                    else result += 100;
                }else if(sArr[i].equals("D")){
                    if(sArr[i - 1].equals("C")) result += 300;
                    else result += 500;
                }else if(sArr[i].equals("M")){
                    if(sArr[i - 1].equals("C")) result += 800;
                    else result += 1000;
                }
            }
        }


        return result;
    }
}
```
