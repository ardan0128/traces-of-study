package ch03.se15;

public class Customer implements Buy, Sell {

  @Override
  public void sell() {
    System.out.println("customer sell");
  }

  @Override
  public void buy() {
    System.out.println("customer buy");
  }

  /**
   * Buy, Sell 인터페이스에 각각 order 메서드가 있어서 재정의를 해야한다.
   */
  @Override
  public void order() {
    System.out.println("customer order");
  }

  public void hello() {
    System.out.println("customer hello");
  }
}
