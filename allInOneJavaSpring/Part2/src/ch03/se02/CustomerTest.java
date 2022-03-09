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
    System.out.println(customerKim.showCustomerInfo());
  }
}
