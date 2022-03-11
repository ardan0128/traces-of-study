package ch04.se03;

public class StringBuilderTest {
  public static void main(String[] args) {
    String string1 = new String("string1");
    String string2 = new String("string2");

    StringBuilder stringBuilder = new StringBuilder(string1);
    System.out.println(System.identityHashCode(stringBuilder));
    stringBuilder.append(string2);
    System.out.println(System.identityHashCode(stringBuilder)); // String을 연결한 전/후의 참조값이 동일하다.

    String test = stringBuilder.toString();
    System.out.println(test);
  }
}
