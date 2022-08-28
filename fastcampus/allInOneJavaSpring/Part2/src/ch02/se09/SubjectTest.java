package ch02.se09;

public class SubjectTest {
  public static void main(String[] args) {
    Student studentLee = new Student(100, "LEE");
    studentLee.setKoreaSubject("국어", 100);
    studentLee.setMathSubject("수학", 99);

    Student studentJor = new Student(200, "Jortier");
    studentJor.setKoreaSubject("국어", 50);
    studentJor.setMathSubject("수학", 70);

    studentLee.showScoreInfo();
    studentJor.showScoreInfo();
  }
}
