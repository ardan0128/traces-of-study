package graph.problem2644;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  static int n, start, end, m;
  static ArrayList<Integer>[] adj;
  static int[] dist;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();
    start = scanner.nextInt();
    end = scanner.nextInt();
    m = scanner.nextInt();
    adj = new ArrayList[n + 1];

    for(int i = 1; i <= n; i++){
      adj[i] = new ArrayList<>();
    }

    for(int i = 1; i <= m; i++){
      int x = scanner.nextInt();
      int y = scanner.nextInt();

      adj[x].add(y);
      adj[y].add(x);
    }

    dist = new int[n + 1];
    bfs(start);
    System.out.println(dist[end]);
  }

  static void bfs(int start){
    Queue<Integer> queue = new LinkedList<>();

    for(int i = 1; i <= n; i++){
      dist[i] = -1;
    }

    queue.add(start);

    dist[start] = 0;

    while(!queue.isEmpty()){
      int x = queue.poll();

      for(int y : adj[x]){
        if(dist[y] != -1){
          continue;
        }

        queue.add(y);
        dist[y] = dist[x] + 1;
      }
    }
  }
}
