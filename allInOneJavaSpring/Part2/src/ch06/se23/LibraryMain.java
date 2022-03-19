package ch06.se23;

import java.util.ArrayList;

class BookLibrary {
  public ArrayList<String> shelf = new ArrayList<>();

  public BookLibrary() {
    shelf.add("태백산맥1");
    shelf.add("태백산맥2");
    shelf.add("태백산맥3");
    shelf.add("태백산맥4");
  }

  public synchronized String lendBook() throws InterruptedException {
    Thread t = Thread.currentThread();

    while (shelf.size() == 0) {
      System.out.println(t.getName() + " waiting start");
      wait();
      System.out.println(t.getName() + " waiting end");
    }

    String book = shelf.remove(0);

    System.out.println(t.getName() + ", " + book + " rend");

    return book;
  }

  public synchronized void returnBook(String book) {
    Thread t = Thread.currentThread();

    shelf.add(book);

    notifyAll();

    System.out.println(t.getName() + ", " + book + " return");
  }
}

class Student extends Thread {
  public Student(String name) {
    super(name);
  }

  public void run() {
    try {
      String title = LibraryMain.library.lendBook();

      if (title == null) {
        return;
      }
      sleep(5000);

      LibraryMain.library.returnBook(title);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

public class LibraryMain {
  public static BookLibrary library = new BookLibrary();

  public static void main(String[] args) {
    Student student1 = new Student("student1");
    Student student2 = new Student("student2");
    Student student3 = new Student("student3");
    Student student4 = new Student("student4");
    Student student5 = new Student("student5");
    Student student6 = new Student("student6");

    student1.start();
    student2.start();
    student3.start();
    student4.start();
    student5.start();
    student6.start();
  }
}
