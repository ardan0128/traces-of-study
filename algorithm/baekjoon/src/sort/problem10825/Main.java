package sort.problem10825;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static class Student implements Comparable<Student> {
    public String name;
    public int korean, english, math;

    @Override
    public int compareTo(Student student) {
      if(korean != student.korean) return student.korean - korean;
      if(english != student.english) return english - student.english;
      if(math != student.math) return student.math - math;
      return name.compareTo(student.name);
    }
  }

  static StringBuilder sb = new StringBuilder();
  static int N;
  static Student[] students;

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    N = scan.nextInt();
    students = new Student[N];
    for(int i = 0; i < students.length; i++){
      students[i] = new Student();
      students[i].name = scan.next();
      students[i].korean = scan.nextInt();
      students[i].english = scan.nextInt();
      students[i].math = scan.nextInt();
    }

    sort();
    System.out.println(sb);
  }

  static void sort(){
    Arrays.sort(students);
    for(int i = 0; i < N; i++){
      sb.append(students[i].name).append('\n');
    }
  }
}
