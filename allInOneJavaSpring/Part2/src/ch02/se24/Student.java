package ch02.se24;

import java.util.ArrayList;

public class Student {
  int studentId;
  String studentName;
  ArrayList<Subject> subjects = new ArrayList<>();

  Student(int studentId, String studentName) {
    this.studentId = studentId;
    this.studentName = studentName;
  }

  public void addSubject(String name, int score) {
    Subject subject = new Subject();
    subject.setName(name);
    subject.setScore(score);

    this.subjects.add(subject);
  }

  public void showScoreInfo() {
    int total = 0;

    for (Subject subject : subjects) {
      total += subject.getScore();
      System.out.println(studentName + " 학생의 " + subject.getName() + " 과목의 성적은" + subject.getScore() + "점입니다.");
    }

    System.out.println(studentName + "의 총점은 " + total + "점입니다.");
  }
}
