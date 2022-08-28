package ch05.se08;

public class GenericPrintTest {
  public static void main(String[] args) {
    Powder powder = new Powder();

    GenericMaterial<Powder> powderPrinter = new GenericMaterial<>();
    powderPrinter.setMaterial(powder);

    System.out.println(powderPrinter.toString());

    Powder p = powderPrinter.getMaterial();
    p.doPrinting();
  }
}
