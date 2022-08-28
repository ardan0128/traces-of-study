package ch06.se09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExeption {
  public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
    FileInputStream fis = new FileInputStream(fileName);
    Class c = Class.forName(className);

    return c;
  }

  public static void main(String[] args) {
    ThrowsExeption test = new ThrowsExeption();

    try {
      test.loadClass("a.txt", "abc");
    } catch (FileNotFoundException | ClassNotFoundException e) { // 동시에 예외처리
      e.printStackTrace();
    }

    try {
      test.loadClass("a.txt", "abc");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (Exception e) { // 위에 있는 Exception 외에 다른 Exception을 처리할 때 사용
      e.printStackTrace();
    }
  }
}
