package ch06.se04;

public class StringConcatTest {
  public static void main(String[] args) {
    String string1 = "Hello";
    String string2 = "World";

    StringConcatImpl sci = new StringConcatImpl();
    sci.makeString("Hello", "World");

    StringConcat sc = (s1, s2) -> System.out.println(s1 + ", " + s2);
    sc.makeString(string1, string2);

    StringConcat stringConcat = new StringConcat() {

      @Override
      public void makeString(String s1, String s2) {
        System.out.println(s1 + ", " + s2);
      }

    };

    stringConcat.makeString(string1, string2);
  }
}
