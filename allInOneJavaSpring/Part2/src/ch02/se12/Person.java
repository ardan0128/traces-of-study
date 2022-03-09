package ch02.se12;

public class Person {
  String name;
  int age;

  public Person() {
    this("no name", 1);
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void showPerson() {
    System.out.println(name + ", " + age);
  }

  public Person getPerson() {
    return this;
  }

  public static void main(String[] args) {
    Person person = new Person();
    person.showPerson();

    System.out.println(person.getPerson());

    Person person2 = person.getPerson();

    System.out.println(person2);

    // person과 person의 참조값은 같은 것을 확인하는 예제
  }
}
