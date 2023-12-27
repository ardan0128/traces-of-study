package tree.problem20364;

import java.util.Scanner;

public class Main {
  static int N, Q;
  static boolean[] estate;

  public static void main(String[] args){
    StringBuilder sb = new StringBuilder();
    Scanner scanner = new Scanner(System.in);

    N = scanner.nextInt();
    Q = scanner.nextInt();
    estate = new boolean[N + 1];

    while(Q-- > 0){
      int x = scanner.nextInt();
      int result = 0;
      int y = x;

      while(x > 0){
        if(estate[x]){
          result = x;
        }

        x >>= 1;
      }

      estate[y] = true;
      sb.append(result).append("\n");
    }

    System.out.println(sb);
  }
}
