package ch03.se06;

import java.util.ArrayList;

public class CustomerTest {
  public static void main(String[] args) {
    ArrayList<Customer> customers = new ArrayList<>();

    Customer customerT = new Customer(10010, "Tomas");
    Customer customerJ = new Customer(10020, "James");
    Customer customerE = new GoldCustomer(10030, "Edward");
    Customer customerP = new GoldCustomer(10040, "Percy");
    Customer customerK = new VipCustomer(10050, "Kim");

    customers.add(customerT);
    customers.add(customerJ);
    customers.add(customerE);
    customers.add(customerP);
    customers.add(customerK);

    for (Customer customer : customers) {
      System.out.println(customer.showCustomerInfo());
    }

    for (Customer customer : customers) {
      customer.calcPrice(10000);
      System.out.println(customer.showCustomerInfo());
    }
  }
}
