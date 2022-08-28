package ch06.se09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {
  public static void main(String[] args) {
    FileInputStream fis = null;

    try {
      fis = new FileInputStream("a.txt");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } finally {
      if (fis != null) {
        try {
          fis.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

    try (FileInputStream fis2 = new FileInputStream("a.txt")) {
      System.out.println("read");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
