package ch04.se02;

public class Student implements Cloneable {
  private int studentNum;
  private String studentName;

  public Student(int studentNum, String studentName) {
    this.studentNum = studentNum;
    this.studentName = studentName;
  }

  public void setStudentName(String name) {
    this.studentName = name;
  }

  @Override
  public String toString() {
    return studentNum + ", " + studentName;
  }

  @Override
  public boolean equals(Object object) {
    if (object instanceof Student) {
      Student student = (Student) object;

      if (this.studentNum == student.studentNum) {
        return true;
      } else {
        return false;
      }
    }

    return false;
  }

  @Override
  public int hashCode() {
    return studentNum;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

}
