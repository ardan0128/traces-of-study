package ch04.se01;

class Book {
  private String title;
  private String author;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  @Override
  public String toString() {
    return title + ", " + author;
  }
}

public class BookTest {
  public static void main(String[] args) {
    Book book = new Book("데미안", "헤르만 헤세");

    System.out.println(book);

    String str = new String("test");
    System.out.println(str); // 이미 오버라이딩되어서 참조값이 안나오고 String이 출력된다.
  }
}
