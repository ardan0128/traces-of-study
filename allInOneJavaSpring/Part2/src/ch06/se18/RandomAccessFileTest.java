package ch06.se18;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
  public static void main(String[] args) throws IOException {
    RandomAccessFile raf = new RandomAccessFile("random.txt", "rw");

    raf.writeInt(100);

    System.out.println("파일 포인터 위치: " + raf.getFilePointer());

    raf.writeDouble(3.14);

    System.out.println("파일 포인터 위치: " + raf.getFilePointer());

    raf.writeUTF("안녕하세요");

    System.out.println("파일 포인터 위치: " + raf.getFilePointer());

    raf.seek(0);

    int i = raf.readInt();
    double d = raf.readDouble();
    String str = raf.readUTF();

    System.out.println(i);
    System.out.println(d);
    System.out.println(str);

    raf.close();
  }
}
