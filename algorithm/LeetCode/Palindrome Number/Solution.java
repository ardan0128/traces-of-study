class Solution {
  public boolean isPalindrome(int x) {
    String str = Integer.toString(x);
    StringBuilder sb = new StringBuilder();
    sb.append(str);
    
    return str.equals(sb.reverse().toString());
  }
}