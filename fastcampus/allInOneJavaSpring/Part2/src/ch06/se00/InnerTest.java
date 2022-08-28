package ch06.se00;

class OutClass {
  private int num = 10;
  private static int sNum = 20;
  private PrivateInClass privateInClass;
  private PublicInClass publicInClass;

  public OutClass() {
    privateInClass = new PrivateInClass();
    publicInClass = new PublicInClass();
  }

  private class PrivateInClass {
    int iNum = 100;

    /**
     * 인스턴스 내부 클래스에서는 정적 변수를 사용할 수 없다.
     * 정적 변수를 사용하려면 정적 내부 클래스에서 사용해야 한다.
     */
    // static int sInNum = 500;

    void inTest() {
      System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
      System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
      System.out.println("PrivateInClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
    }
  }

  public class PublicInClass {
    int iNum = 100;

    void inTest() {
      System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
      System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
      System.out.println("PublicInClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
    }
  }

  public void usingClass() {
    privateInClass.inTest();
  }
}

public class InnerTest {
  public static void main(String[] args) {
    OutClass outClass = new OutClass();
    outClass.usingClass();

    OutClass.PublicInClass inClass = outClass.new PublicInClass();
    inClass.inTest();
  }

}