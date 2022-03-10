package ch03.se15;

public interface Sell {
  void sell();

  default void order() {
    System.out.println("sell order");
  }
}
