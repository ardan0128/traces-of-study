package ch03.se15;

public interface Buy {
  void buy();

  default void order() {
    System.out.println("buy order");
  }
}
