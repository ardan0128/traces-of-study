```java
class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;

       Stack<Character> stack = new Stack();

       for(char c : s.toCharArray()){
           if(c == '(' || c == '{' || c == '['){
               stack.push(c);
           }else if(c == ')'){
               if(!stack.isEmpty() && stack.peek() == '('){
                   stack.pop();
               }else{
                   return false;
               }
           }else if(c == '}'){
               if(!stack.isEmpty() && stack.peek() == '{'){
                   stack.pop();
               }else{
                   return false;
               }
           }else if(c == ']'){
               if(!stack.isEmpty() && stack.peek() == '['){
                   stack.pop();
               }else{
                   return false;
               }
           }
       }

        return stack.isEmpty();
    }
}
```