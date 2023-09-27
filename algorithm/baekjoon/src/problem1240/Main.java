package problem1240;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  static class Edge{
    int y;
    int c;
    Edge(int y, int c){
      this.y = y;
      this.c = c;
    }
  }

  static int N, M;
  static ArrayList<Edge>[] con;
  static int result;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    M = scanner.nextInt();
    con = new ArrayList[N + 1];

    for(int i = 1; i <= N; i++){
      con[i] = new ArrayList<>();
    }

    for(int i = 1; i < N; i++){
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      int c = scanner.nextInt();

      con[x].add(new Edge(y, c));
      con[y].add(new Edge(x, c));
    }

    while(M-- > 0){
      int x = scanner.nextInt();
      int y = scanner.nextInt();

      dfs(x, -1, y, 0);
      System.out.println(result);
    }
  }

  static void dfs(int x, int pre, int goal, int dist){
    if(x == goal){
      result = dist;
      return;
    }

    for(Edge e : con[x]){
      if(e.y == pre){
        continue;
      }
      dfs(e.y, x, goal, dist + e.c);
    }
  }
}
