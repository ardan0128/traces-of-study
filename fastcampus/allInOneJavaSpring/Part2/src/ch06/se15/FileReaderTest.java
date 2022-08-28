package ch06.se15;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderTest {
  public static void main(String[] args) {
    try (FileReader fr = new FileReader("allInOneJavaSpring/Part2/src/ch06/se15/reader.txt")) {
      int i;

      while ((i = fr.read()) != -1) {
        System.out.println((char) i);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    try (FileWriter fw = new FileWriter("allInOneJavaSpring/Part2/src/ch06/se15/writer.txt")) {
      fw.write('A');

      char buf[] = { 'B', 'C', 'D', 'E', 'F', 'G' };

      fw.write(buf);
      fw.write("안녕하세요. 잘 써지네요");
      fw.write(buf, 1, 2);
      fw.write("65");
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }
}
