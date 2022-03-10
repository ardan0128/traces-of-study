package ch03.se15;

public class CustomerTest {
  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.buy();
    customer.sell();
    customer.order();
    customer.hello();

    /**
     * 업캐스팅할 수 있다.
     * 묵시적 형변환
     */
    Buy buyer = customer;
    buyer.buy();
    buyer.order();

    Sell seller = customer;
    seller.sell();
    seller.order();
    /**
     * Customer에서 재정의 했기때문에 재정의 된 메서드가 호출된다.
     */
  }
}
