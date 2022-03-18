package ch06.se18;

import java.io.File;
import java.io.IOException;

public class FileTest {
  public static void main(String[] args) throws IOException {
    File file = new File("파일 명은 없어도 되지만 경로는 반드시 있어야한다.");
    file.createNewFile();

    System.out.println(file.isFile());
    System.out.println(file.isDirectory());
    System.out.println(file.getName());
    System.out.println(file.getAbsolutePath());
    System.out.println(file.getPath());
    System.out.println(file.canRead());
    System.out.println(file.canWrite());

    file.delete();
  }
}
