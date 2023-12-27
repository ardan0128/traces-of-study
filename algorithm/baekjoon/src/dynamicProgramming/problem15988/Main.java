package dynamicProgramming.problem15988;

import java.util.Scanner;

public class Main {
  static int T;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    T = scanner.nextInt();
    int[] dy = new int[1000001];
    dy[0] = 1;

    for(int i = 1; i <= 1000000; i++){
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

      System.out.println(dy[n]);
    }
  }
}
