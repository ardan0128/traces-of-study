package graph.problem1389;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  static int N, M;
  static ArrayList<Integer>[] adj;
  static int[] dist;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    M = scanner.nextInt();
    adj = new ArrayList[N + 1];

    for(int i = 1; i <= N; i++){
      adj[i] = new ArrayList<>();
    }

    for(int i = 1; i <= M; i++){
      int x = scanner.nextInt();
      int y = scanner.nextInt();

      adj[x].add(y);
      adj[y].add(x);
    }

    dist = new int[N + 1];
    int minVal = bfs(1);
    int minIdx = 1;

    for(int i = 2; i <= N; i++){
      int val = bfs(i);

      if(minVal > val){
        minVal = val;
        minIdx = i;
      }
    }

    System.out.println(minIdx);
  }

  static int bfs(int start){
    int result = 0;
    Queue<Integer> queue = new LinkedList<>();

    for(int i = 1; i <= N; i++){
      dist[i] = -1;
    }

    queue.add(start);
    dist[start] = 0;

    while(!queue.isEmpty()){
      int x = queue.poll();
      result += dist[x];

      for(int y : adj[x]){
        if(dist[y] != -1){
          continue;
        }

        queue.add(y);
        dist[y] = dist[x] + 1;
      }
    }

    return result;
  }
}
