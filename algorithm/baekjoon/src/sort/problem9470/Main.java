package sort.problem9470;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  static int T, K, M, P;
  static int[] indeg, order, count;
  static ArrayList<Integer>[] adj;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    T = scanner.nextInt();

    while(T-- > 0){
      K = scanner.nextInt();
      M = scanner.nextInt();
      P = scanner.nextInt();
      adj = new ArrayList[M + 1];
      indeg = new int[M + 1];
      order = new int[M + 1];
      count = new int[M + 1];

      for(int i = 1; i <= M; i++){
        adj[i] = new ArrayList<>();
      }

      for(int i = 0; i < P; i++){
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        adj[A].add(B);
        indeg[B]++;
      }

      Deque<Integer> queue = new LinkedList<>();

      for(int i = 1; i <= M; i++){
        if(indeg[i] == 0){
          queue.add(i);
          order[i] = count[i] = 1;
        }
      }

      int result = 0;

      while(!queue.isEmpty()){
        int x = queue.poll();

        if(count[x] >= 2){
          order[x]++;
        }

        result = Math.max(result, order[x]);

        for(int y : adj[x]){
          indeg[y]--;

          if(indeg[y] == 0){
            queue.add(y);
          }

          if(order[y] == order[x]){
            count[y]++;
          }else if(order[y] < order[x]){
            order[y] = order[x];
            count[y] = 1;
          }
        }
      }

      System.out.println(K + " " + result);
    }
  }
}
