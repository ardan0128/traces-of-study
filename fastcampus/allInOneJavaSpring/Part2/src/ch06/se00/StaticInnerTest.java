package ch06.se00;

class StaticOutClass {
  private int num = 10;
  private static int sNum = 20;

  static class InStaticClass {
    int iNum = 100;
    static int sInNum = 200;

    void inTest() {
      // System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
      // 외부 클래스의 인스턴스의 변수는 사용할 수 없다.
      // 외부 클래스의 생성과 상관없이 메서드가 호출될 수 있기 때문이다.

      System.out.println("InClass num = " + iNum + "(내부 클래스의 인스턴스 변수)");
      System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
      System.out.println("InClass iNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
    }

    static void staticTest() {
      // 스태틱 클래스의 스태틱 메서드는 클래스가 생성되지 않아도 메서드가 호출될 수 있기 때문에
      // 인스턴스 변수는 사용할 수 없다.
      // System.out.println("InClass num = " + iNum + "(내부 클래스의 인스턴스 변수)");

      System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
      System.out.println("InClass iNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
    }
  }
}

public class StaticInnerTest {
  public static void main(String[] args) {
    StaticOutClass.InStaticClass sInClass = new StaticOutClass.InStaticClass();
    sInClass.inTest();

    System.out.println();

    /**
     * 정적 메서드는 클래스 생성과 무관하게 호출이 가능하다.
     * 이때는 정적 변수만 사용이 가능하다.
     */
    StaticOutClass.InStaticClass.staticTest();
  }
}
