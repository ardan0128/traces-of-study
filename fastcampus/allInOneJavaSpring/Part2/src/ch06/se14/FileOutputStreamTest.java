package ch06.se14;

import java.io.FileOutputStream;

public class FileOutputStreamTest {
  public static void main(String[] args) {
    // 파일에 한 바이트씩 쓰기
    try (FileOutputStream fos = new FileOutputStream("allInOneJavaSpring/Part2/src/ch06/se14/output.txt")) {
      fos.write(65);
      fos.write(66);
      fos.write(67);
    } catch (Exception e) {
      e.printStackTrace();
    }

    // 배열을 한꺼번에 파일에 쓰기
    try (FileOutputStream fos = new FileOutputStream("allInOneJavaSpring/Part2/src/ch06/se14/output2.txt")) {
      byte[] bs = new byte[26];
      byte data = 65;

      for (int i = 0; i < bs.length; i++) {
        bs[i] = data;
        data++;
      }

      fos.write(bs, 2, 10);
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("end");
  }
}
