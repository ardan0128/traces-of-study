package ch06.se11;

public class StudentTest {
  public static void main(String[] args) {
    MyLogger myLogger = MyLogger.getLogger();
    String name = null;

    try {
      Student student = new Student(name);
    } catch (Exception e) {
      myLogger.warning(e.toString());
    }

    try {
      Student student = new Student("Edward Jon Kim Test");
    } catch (Exception e) {
      myLogger.warning(e.toString());
    }

    Student student = new Student("James");
  }
}
