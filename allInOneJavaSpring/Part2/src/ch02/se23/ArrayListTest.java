package ch02.se23;

import java.util.ArrayList;

import ch02.se21.Book;

public class ArrayListTest {
  public static void main(String[] args) {
    ArrayList<Book> books = new ArrayList<>();

    books.add(new Book("태백산맥1", "조정래"));
    books.add(new Book("태백산맥2", "조정래"));
    books.add(new Book("태백산맥3", "조정래"));
    books.add(new Book("태백산맥4", "조정래"));
    books.add(new Book("태백산맥5", "조정래"));

    for (int i = 0; i < books.size(); i++) {
      books.get(i).showInfo();
    }
  }
}
