package ch04.se02;

public class equalsTest {
  public static void main(String[] args) throws CloneNotSupportedException {
    Student student1 = new Student(100, "Lee");
    Student student2 = new Student(100, "Lee");
    Student student3 = student1;

    /**
     * 인스턴스의 참조값이 다르다.
     */
    System.out.println(student1 == student2);

    /**
     * equels()를 재정의 하여 논리적으로 같은지 비교하였다.
     */
    System.out.println(student1.equals(student2));

    System.out.println(student1.hashCode());
    System.out.println(student2.hashCode());

    /**
     * student3에 student1을 할당해서 인스턴스의 참조값이 같다
     */
    System.out.println(student1 == student3);
    System.out.println(student1.equals(student3));

    /**
     * hashCode() 메서드를 재정의 하더라고 hashCode를 확인할 수 있다.
     */
    System.out.println(System.identityHashCode(student1));
    System.out.println(System.identityHashCode(student2));

    System.out.println("==========");

    String string1 = new String("123");
    String string2 = new String("123");

    System.out.println(string1.equals(string2));
    System.out.println(string1.hashCode());
    System.out.println(string2.hashCode());

    System.out.println("==========");

    Integer i = 100;

    System.out.println(i.hashCode());

    System.out.println("==========");

    Student copyStudent1 = (Student) student1.clone();
    System.out.println(copyStudent1.toString());
    System.out.println(System.identityHashCode(copyStudent1)); // 참조값은 다르다.
  }
}
