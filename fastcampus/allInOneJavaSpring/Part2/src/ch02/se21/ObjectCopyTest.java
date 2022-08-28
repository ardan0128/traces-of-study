package ch02.se21;

public class ObjectCopyTest {
  public static void main(String[] args) {
    Book[] books = new Book[5];
    Book[] tempBooks = new Book[5];

    books[0] = new Book("태백산맥1", "조정래");
    books[1] = new Book("태백산맥2", "조정래");
    books[2] = new Book("태백산맥3", "조정래");
    books[3] = new Book("태백산맥4", "조정래");
    books[4] = new Book("태백산맥5", "조정래");

    // 참조 값을 다르게 쓰기 위해 생성자를 사용한다
    tempBooks[0] = new Book();
    tempBooks[1] = new Book();
    tempBooks[2] = new Book();
    tempBooks[3] = new Book();
    tempBooks[4] = new Book();

    for (int i = 0; i < books.length; i++) {
      tempBooks[i].setTitle(books[i].getTitle());
      tempBooks[i].setAuthor(books[i].getAuthor());
    }

    /**
     * System.arraycopy의 파라미터
     * 
     * @param src     복사할 배열
     * @param srcPos  복사할 배열의 시작 요소
     * @param dest    할당할 배열
     * @param destPos 할당할 배열의 시작 요소
     * @param length  복사할 요소의 개수
     */
    // System.arraycopy(books, 0, tempBooks, 0, 5);

    // books의 요소와 tempBooks의 요소는 같은 참조값을 할당 받는다
    books[0].setTitle("나목");
    books[0].setAuthor("박완서");

    System.out.println("===== books=====");
    for (Book book : books) {
      book.showInfo();
    }

    System.out.println("===== temp books =====");
    for (Book book : tempBooks) {
      book.showInfo();
    }
  }
}
