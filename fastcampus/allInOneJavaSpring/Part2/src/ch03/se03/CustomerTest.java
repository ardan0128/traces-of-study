package ch03.se03;

public class CustomerTest {
  public static void main(String[] args) {
    Customer customerLee = new Customer(10010, "Lee");
    customerLee.bonusPoint = 1000;
    System.out.println(customerLee.showCustomerInfo());

    VipCustomer customerKim = new VipCustomer(10020, "Kim");
    customerKim.bonusPoint = 10000;
    /**
     * showCustomerInfo()는 Customer의 메서드지만, 상속 받아서 VipCustomer에서 사용 가능하다.
     */
    System.out.println(customerKim.showCustomerInfo());
  }
}
