package problem15681;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  static StringBuilder sb = new StringBuilder();
  static int N, R, Q;
  static ArrayList<Integer>[] tree;
  static int[] dy;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    R = scanner.nextInt();
    Q = scanner.nextInt();
    tree = new ArrayList[N + 1];

    for(int i = 1; i <= N; i++){
      tree[i] = new ArrayList<>();
    }

    for(int i = 1; i < N; i++){
      int x = scanner.nextInt();
      int y = scanner.nextInt();

      tree[x].add(y);
      tree[y].add(x);
    }

    dy = new int[N + 1];

    dfs(R, -1);

    for(int i = 1; i <= Q; i++){
      int q = scanner.nextInt();

      sb.append(dy[q]).append('\n');
    }

    System.out.println(sb);
  }

  static void dfs(int x, int pre){
    dy[x] = 1;

    for(int y : tree[x]){
      if(y == pre){
        continue;
      }

      dfs(y, x);

      dy[x] += dy[y];
    }
  }
}
