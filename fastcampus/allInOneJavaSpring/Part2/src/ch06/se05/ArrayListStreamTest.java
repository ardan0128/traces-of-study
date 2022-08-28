package ch06.se05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
  public static void main(String[] args) {
    List<String> listString = new ArrayList<>();
    listString.add("Tomas");
    listString.add("Edward");
    listString.add("Jack");

    Stream<String> streamString = listString.stream();
    streamString.forEach(s -> System.out.println(s));
    System.out.println();

    listString.stream().sorted().forEach(s -> System.out.print(s + "\t"));

    System.out.println();

    listString.stream().map(s -> s.length()).forEach(s -> System.out.print(s + "\t"));

    System.out.println();

    listString.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.println(s));
  }
}
