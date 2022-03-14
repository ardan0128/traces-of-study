package ch05.se07;

public class PrinterTest {
  public static void main(String[] args) {
    Powder powder = new Powder();
    ObjectPrint printer = new ObjectPrint();

    printer.setMaterial(powder);

    Powder p = (Powder) printer.getMaterial();
  }
}
