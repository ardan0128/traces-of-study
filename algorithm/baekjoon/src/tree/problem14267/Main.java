package tree.problem14267;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  static int N, M;
  static int[] dy;
  static ArrayList<Integer>[] children;

  public static void main(String[] args){
    StringBuilder sb = new StringBuilder();
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    M = scanner.nextInt();
    dy = new int[N + 1];
    children = new ArrayList[N + 1];

    for(int i = 1; i <= N; i++){
      children[i] = new ArrayList<>();
    }

    for(int i = 1; i <= N; i++){
      int par = scanner.nextInt();

      if(i == 1){
        continue;
      }

      children[par].add(i);
    }

    for(int i = 1; i <= M; i++){
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      dy[x] += y;
    }

    dfs(1);

    for(int i = 1; i <= N; i++){
      sb.append(dy[i]).append(" ");
    }

    System.out.println(sb);
  }

  static void dfs(int x){
    for(int y : children[x]){
      dy[y] += dy[x];
      dfs(y);
    }
  }
}
