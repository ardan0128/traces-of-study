package ch06.se09;

public class AutoCloseableTest {
  public static void main(String[] args) {
    AutoCloseableObj obj = new AutoCloseableObj();

    /**
     * Java 9부터 사용이 가능하다.
     * 현재 Java 8 사용 중
     */
    // try (obj) {
    // // 강제로 exception 발생
    // throw new Exception();
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
  }
}
