package graph.problem2606;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
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

    for(int i = 1; i <= N; i++){
      arr[i] = new ArrayList<>();
    }

    for(int i = 0; i < M; i++){
      int x = scanner.nextInt();
      int y = scanner.nextInt();

      arr[x].add(y);
      arr[y].add(x);
    }

    visit = new boolean[N + 1];
    bfs(1);

    int result = 0;

    for(int i = 2; i <= N; i++){
      if(visit[i]){
        result++;
      }
    }

    System.out.println(result);
  }

  static void bfs(int start){
    Queue<Integer> queue = new LinkedList<>();

    queue.add(start);
    visit[start] = true;

    while(!queue.isEmpty()){
      int x = queue.poll();

      for(int y : arr[x]){
        if(visit[y]){
          continue;
        }

        queue.add(y);
        visit[y] = true;
      }
    }
  }
}
