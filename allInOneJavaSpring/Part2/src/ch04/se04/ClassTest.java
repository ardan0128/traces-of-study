package ch04.se04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
  public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException,
      NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
    Class c1 = Class.forName("ch04.se04.Person");

    Person person = (Person) c1.newInstance();
    person.setName("Jortier");
    System.out.println(person);

    Class c2 = person.getClass(); // getClass()를 사용하기 위해선 인스턴스가 생성되어 있어야 한다.
    Person person2 = (Person) c2.newInstance(); // newInstance()를 하면 default 생성자를 호출한다.
    System.out.println(person2);

    Class[] parameterTypes = { String.class };
    Constructor constructor = c2.getConstructor(parameterTypes);

    Object[] initargs = { "person3" };
    Person person3 = (Person) constructor.newInstance(initargs);
    System.out.println(person3);
  }
}
