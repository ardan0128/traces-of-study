package tree.problem3584;

import java.util.Scanner;

public class Main {
  static int N;
  static int[] par, check;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt();

    while(T-- > 0){
      N = scanner.nextInt();
      par = new int[N + 1];
      check = new int[N + 1];

      for(int i = 1; i < N; i++){
        int root = scanner.nextInt();
        int leaf = scanner.nextInt();
        par[leaf] = root;
      }

      int x = scanner.nextInt();
      int y = scanner.nextInt();

      while(x > 0){
        check[x] = 1;
        x = par[x];
      }

      while(y > 0 && check[y] == 0){
        y = par[y];
      }

      System.out.println(y);
    }
  }
}
