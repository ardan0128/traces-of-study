package graph.problem1697;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  static int N, K;
  static int[] dist;
  static boolean[] visit;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    K = scanner.nextInt();
    dist = new int[100005];
    visit = new boolean[100005];

    bfs();
    System.out.println(dist[K]);
  }

  static void bfs(){
    Queue<Integer> queue = new LinkedList<>();
    queue.add(N);
    visit[N] = true;
    dist[N] = 0;

    while(!queue.isEmpty()){
      int x = queue.poll();

      if(x - 1 >= 0 && !visit[x - 1]){
        visit[x - 1] = true;
        dist[x - 1] = dist[x] + 1;
        queue.add(x - 1);
      }

      if(x + 1 <= 100000 && !visit[x + 1]){
        visit[x + 1] = true;
        dist[x + 1] = dist[x] + 1;
        queue.add(x + 1);
      }

      if(x * 2 <= 100000 && !visit[x * 2]){
        visit[x * 2] = true;
        dist[x * 2] = dist[x] + 1;
        queue.add(x * 2);
      }
    }
  }
}
