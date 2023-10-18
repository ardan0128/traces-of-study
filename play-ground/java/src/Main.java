import httpRequest.HttpRequest;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    System.out.println("Hello world!");

    HttpRequest test = new HttpRequest();
    test.test();
  }
}