package ch03.se02;

public class CustomerTest {
  public static void main(String[] args) {
    Customer customerLee = new Customer();
    customerLee.setCustomerName("Lee");
    customerLee.setCustomerId(10010);
    customerLee.bonusPoint = 1000;
    System.out.println(customerLee.showCustomerInfo());

    VipCustomer customerKim = new VipCustomer();
    customerKim.setCustomerName("Kim");
    customerKim.setCustomerId(10020);
    customerKim.bonusPoint = 10000;
    /**
     * showCustomerInfo()는 Customer의 메서드지만, 상속 받아서 VipCustomer에서 사용 가능하다.
     */
    System.out.println(customerKim.showCustomerInfo());
  }
}
