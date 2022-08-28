package ch02.se15;

public class Taxi {
  private String company;
  private int total;

  public Taxi(String company) {
    this.company = company;
  }

  public void take(int cost) {
    this.total += cost;
  }

  public void showInfo() {
    System.out.println(company + " 택시를 수입은" + total + "원입니다.");
  }
}
