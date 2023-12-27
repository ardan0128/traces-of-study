package sort.problem1005;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  static int N, M;
  static int[] indeg, t_done, t;
  static ArrayList<Integer>[] adj;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int Q = scanner.nextInt();

    while(Q > 0){
      Q--;
      N = scanner.nextInt();
      M = scanner.nextInt();
      adj = new ArrayList[N + 1];
      indeg = new int[N + 1];
      t = new int[N + 1];
      t_done = new int[N + 1];

      for(int i = 1; i <= N; i++){
        adj[i] = new ArrayList<>();
        t[i] = scanner.nextInt();
      }

      for(int i = 0; i < M; i++){
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        adj[x].add(y);
        indeg[y]++;
      }

      Deque<Integer> queue = new LinkedList<>();

      for(int i = 1; i <= N; i++){
        if(indeg[i] == 0){
          queue.add(i);
          t_done[i] = t[i];
        }
      }

      while(!queue.isEmpty()){
        int x = queue.poll();

        for(int y : adj[x]){
          indeg[y]--;

          if(indeg[y] == 0){
            queue.add(y);
          }

          t_done[y] = Math.max(t_done[y], t_done[x] + t[y]);
        }
      }

      int W = scanner.nextInt();

      System.out.println(t_done[W]);
    }
  }
}
