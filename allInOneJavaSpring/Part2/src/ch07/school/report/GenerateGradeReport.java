package ch07.school.report;

import java.util.ArrayList;

import ch07.grade.BasicEvaluation;
import ch07.grade.GradeEvaluation;
import ch07.grade.MajorEvaluation;
import ch07.grade.PassFailEvaluation;
import ch07.school.School;
import ch07.school.Score;
import ch07.school.Student;
import ch07.school.Subject;
import ch07.utils.Define;

public class GenerateGradeReport {
  School school = School.getInstance();

  public static final String TITLE = "수강생 학점\n";
  public static final String HEADER = "이름 | 학번 | 중점과목 | 점수\n";
  public static final String LINE = "=========================\n";

  private StringBuffer buffer = new StringBuffer();

  public String getReport() {
    ArrayList<Subject> subjectList = school.getSubjectList();

    for (Subject subject : subjectList) {
      makeHeader(subject);
      makeBody(subject);
      makeFotter();
    }

    return buffer.toString();
  }

  public void makeHeader(Subject subject) {
    buffer.append(GenerateGradeReport.LINE);
    buffer.append(subject.getSubjectName());
    buffer.append(GenerateGradeReport.TITLE);
    buffer.append(GenerateGradeReport.HEADER);
    buffer.append(GenerateGradeReport.LINE);
  }

  public void makeBody(Subject subject) {
    ArrayList<Student> studentList = subject.getStudentList();

    for (int i = 0; i < studentList.size(); i++) {
      Student student = studentList.get(i);

      buffer.append(student.getStudentName());
      buffer.append(" | ");
      buffer.append(student.getStudentId());
      buffer.append(" | ");
      buffer.append(student.getMajorSubject().getSubjectName());
      buffer.append(" | ");

      getScoreGrade(student, subject);

      buffer.append("\n");
      buffer.append(LINE);
    }
  }

  public void getScoreGrade(Student student, Subject subject) {
    ArrayList<Score> scoreList = student.getScoreList();
    int majorId = student.getMajorSubject().getSubjectId();
    GradeEvaluation[] gradeEvaluation = { new BasicEvaluation(), new MajorEvaluation(), new PassFailEvaluation() };

    for (int i = 0; i < scoreList.size(); i++) {
      Score score = scoreList.get(i);

      if (score.getSubject().getSubjectId() == subject.getSubjectId()) {
        String grade;

        if (subject.getGradeType() == Define.PF_TYPE) {
          grade = gradeEvaluation[Define.PF_TYPE].getGrade(score.getPoint());
        } else {
          if (score.getSubject().getSubjectId() == majorId) {
            grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());
          } else {
            grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint());
          }

          buffer.append(score.getPoint());
          buffer.append(":");
          buffer.append(grade);
          buffer.append(" | ");
        }
      }
    }
  }

  public void makeFotter() {
    buffer.append("\n");
  }
}
