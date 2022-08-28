package ch06.se19;

public class WhippingCream extends Decorator {

  public WhippingCream(Coffee coffee) {
    super(coffee);
  }

  public void brewing() {
    super.brewing();
    System.out.println("Adding wipping cream");
  }
}
