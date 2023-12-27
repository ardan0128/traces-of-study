package graph.problem11724;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  static int N, M;
  static ArrayList<Integer>[] arr;
  static boolean[] visit;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    M = scanner.nextInt();
    arr = new ArrayList[N + 1];
    visit = new boolean[N + 1];

    for(int i = 1; i <= N; i++){
      arr[i] = new ArrayList<>();
    }

    for(int i = 0; i < M; i++){
      int x = scanner.nextInt();
      int y = scanner.nextInt();

      arr[x].add(y);
      arr[y].add(x);
    }

    int result = 0;

    for(int i = 1; i <= N; i++){
      if(visit[i]){
        continue;
      }

      dfs(i);
      result++;
    }

    System.out.println(result);
  }

  static void dfs(int x){
    visit[x] = true;

    for(int y : arr[x]){
      if(visit[y]){
        continue;
      }

      dfs(y);
    }
  }
}
