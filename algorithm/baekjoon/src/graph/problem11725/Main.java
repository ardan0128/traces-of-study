package graph.problem11725;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  static StringBuilder sb = new StringBuilder();
  static int N;
  static List<Integer>[] adj;
  static int[] parent;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    adj = new List[N + 1];
    parent = new int[N + 1];

    for(int i = 1; i <= N; i++){
      adj[i] = new ArrayList<>();
    }

    for(int i = 1; i < N; i++){
      int x = scanner.nextInt();
      int y = scanner.nextInt();

      adj[x].add(y);
      adj[y].add(x);
    }

    dfs(1, -1);

    for(int i = 2; i <= N; i++){
      sb.append(parent[i]).append('\n');
    }

    System.out.println(sb);
  }

  static void dfs(int x, int par){
    for(int y : adj[x]){
      if(y == par){
        continue;
      }

      parent[y] = x;
      dfs(y, x);
    }
  }
}
