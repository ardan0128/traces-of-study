package ch06.se14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
  public static void main(String[] args) {
    // 파일에서 한 바이트씩 자료 읽기
    FileInputStream fis = null;

    try {
      fis = new FileInputStream("allInOneJavaSpring/Part2/src/ch06/se14/input.txt");
      System.out.println((char) fis.read());
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        fis.close();
      } catch (IOException e) {
        e.printStackTrace();
      } catch (Exception e1) {
        e1.printStackTrace();
      }
    }

    // 파일의 끝까지 한 바이트씩 자료 읽기
    try (FileInputStream fiss = new FileInputStream("allInOneJavaSpring/Part2/src/ch06/se14/input.txt")) {
      while (fis.read() != -1) {
        System.out.print((char) fis.read());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    // 파일에서 바이트 배열로 자료 읽기 (배열에 남아 있는 자료가 있을 수 있다)
    int i = 0;
    try (FileInputStream fiss = new FileInputStream("allInOneJavaSpring/Part2/src/ch06/se14/input2.txt")) {
      while (fis.read() != -1) {
        byte[] bs = new byte[10];

        while ((i = fis.read(bs)) != -1) {
          for (int j = 0; j < i; j++) {
            System.out.print((char) bs[j]);
          }

          System.out.println(" : " + i + " 바이트 읽음");
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
