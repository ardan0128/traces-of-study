package sort.problem1516;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  static int N;
  static int[] indeg, done, T;
  static ArrayList<Integer>[] adj;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    indeg = new int[N + 1];
    done = new int[N + 1];
    T = new int[N + 1];
    adj = new ArrayList[N + 1];

    for(int i = 1; i <= N; i++){
      adj[i] = new ArrayList<>();
    }

    for(int i = 1; i <= N; i++){
      T[i] = scanner.nextInt();

      while(true){
        int y = scanner.nextInt();

        if(y == -1){
          break;
        }

        adj[y] .add(i);
        indeg[i]++;
      }
    }

    Deque<Integer> queue = new LinkedList<>();

    for(int i = 1; i <= N; i++) {
      if (indeg[i] == 0) {
        queue.add(i);
        done[i] = T[i];
      }
    }

    while(!queue.isEmpty()){
      int x = queue.poll();

      for(int y : adj[x]){
        indeg[y]--;

        if(indeg[y] == 0){
          queue.add(y);
        }

        done[y] = Math.max(done[y], done[x] + T[y]);
      }
    }

    for(int i = 1; i <= N; i++){
      System.out.println(done[i]);
    }
  }
}
