package ch06.se07;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {
  public static void main(String[] args) {
    TravelCustomer customerLee = new TravelCustomer("Lee", 40, 100);
    TravelCustomer customerKim = new TravelCustomer("Kim", 20, 100);
    TravelCustomer customerHong = new TravelCustomer("Hong", 15, 50);

    List<TravelCustomer> customers = new ArrayList<>();
    customers.add(customerLee);
    customers.add(customerKim);
    customers.add(customerHong);

    System.out.println("========== 고객명단 ==========");
    customers.stream().map(customer -> customer.getName()).forEach(customer -> System.out.println(customer));

    System.out.println("========== 여행비용 총합 ==========");
    int totalPrice = customers.stream().mapToInt(customer -> customer.getPrice()).sum();
    System.out.println(totalPrice);

    System.out.println("========== 20세 이상 고객 ==========");
    customers.stream().filter(customer -> customer.getAge() >= 20).map(customer -> customer.getName()).sorted()
        .forEach(customer -> System.out.println(customer));
  }
}
