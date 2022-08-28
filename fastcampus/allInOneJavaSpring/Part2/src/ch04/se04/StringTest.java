package ch04.se04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {
  public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
    Class c = Class.forName("java.lang.String");

    Constructor[] constructors = c.getConstructors();

    for (Constructor constructor : constructors) {
      System.out.println(constructor); // 생성자를 확인할 수 있다.
    }

    Method[] methods = c.getMethods();

    for (Method method : methods) {
      System.out.println(method); // 메서드를 확인할 수 있다.
    }

    /**
     * reflection 프로그램
     * 로컬에 오브젝트가 없을 때 호출해서 쓴다.
     */
  }
}
