package ch04.se03;

public class StringTest {
  public static void main(String[] args) {
    String java = new String("java");
    String android = new String("android");

    System.out.println(System.identityHashCode(java));

    java = java.concat(android);

    System.out.println(System.identityHashCode(java)); // 참조값이 다른 것을 확인할 수 있다.

    System.out.println(java);
  }
}
