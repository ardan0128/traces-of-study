package ch06.se17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
  String name;
  String job;

  Person() {
  }

  Person(String name, String job) {
    this.name = name;
    this.job = job;
  }

  @Override
  public String toString() {
    return name + ", " + job;
  }
}

public class SerializationTest {
  public static void main(String[] args) {
    Person personLee = new Person("Lee", "CEO");
    Person personKim = new Person("Kim", "CTO");

    try (
        FileOutputStream fos = new FileOutputStream("allInOneJavaSpring/Part2/src/ch06/se17/serial.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);) {
      oos.writeObject(personLee);
      oos.writeObject(personKim);
    } catch (Exception e) {
      e.printStackTrace();
    }

    try (
        FileInputStream fis = new FileInputStream("allInOneJavaSpring/Part2/src/ch06/se17/serial.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);) {
      Person pLee = (Person) ois.readObject();
      Person pKim = (Person) ois.readObject();

      System.out.println(pLee);
      System.out.println(pKim);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
