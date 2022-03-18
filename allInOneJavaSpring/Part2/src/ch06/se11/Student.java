package ch06.se11;

public class Student {
  private String studentName;
  MyLogger myLogger = MyLogger.getLogger();

  public Student(String studentName) {
    if (studentName == null) {
      throw new StudentNameFormatException("name must not be null");
    }

    if (studentName.split(" ").length > 3) {
      throw new StudentNameFormatException("name is long");
    }

    this.studentName = studentName;
  }

  public String getStudentName() {
    myLogger.fine("begin getStudentName()");

    return studentName;
  }
}
