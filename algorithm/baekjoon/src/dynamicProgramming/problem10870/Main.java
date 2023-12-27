package dynamicProgramming.problem10870;

import java.util.Scanner;

public class Main {
  static int n;
  static long[] dy;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();
    dy = new long[20 + 1];
    dy[0] = 0;
    dy[1] = 1;

    for(int i = 2; i <= 20; i++){
      dy[i] = dy[i - 2] + dy[i - 1];
    }

    System.out.println(dy[n]);
  }
}
