
import java.util.Stack;

public class Solution {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    char[] va = s.toCharArray();

    for (char c : va) {
      if(stack.isEmpty()) {
        stack.push(c);
      } else if (c == ')' && stack.peek() == '(') {
        stack.pop();
      } else if (c == ']' && stack.peek() == '[') {
        stack.pop();
      } else if (c == '}' && stack.peek() == '{') {
        stack.pop();
      } else {
        stack.push(c);
      }
    }

    return stack.isEmpty();
  }
}
