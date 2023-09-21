package problem15991;

import java.util.Scanner;

public class Main {
  static int T;
  static int[] dy;

  public static void main(String[] args){
    StringBuilder sb = new StringBuilder();
    Scanner scanner = new Scanner(System.in);
    T = scanner.nextInt();
    dy = new int[100005];
    dy[0] = 1;

    for(int i = 1; i <= 100000; i++){
      dy[i] = dy[i - 1];

      if(i - 2 >= 0){
        dy[i] += dy[i - 2];
      }

      dy[i] %= 1000000009;

      if(i - 3 >= 0){
        dy[i] += dy[i - 3];
      }

      dy[i] %= 1000000009;
    }

    while(T-- > 0){
      int n = scanner.nextInt();
      int result = 0;

      for(int i = 1; i <= 3; i++){
        if(n - i >= 0 && (n - i) % 2 == 0){
          result += dy[(n - i) / 2];
          result %= 1000000009;
        }
      }

      if(n % 2 == 0){
        result += dy[n / 2];
        result %= 1000000009;
      }

      sb.append(result).append("\n");
    }

    System.out.println(sb);
  }
}
