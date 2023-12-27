package sort.problem2623;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  static int N, M;
  static int[] indeg;
  static ArrayList<Integer>[] adj;
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    M = scanner.nextInt();
    indeg = new int[N + 1];
    adj = new ArrayList[N + 1];

    for(int i = 1; i <= N; i++){
      adj[i] = new ArrayList<>();
    }

    for(int i = 0; i < M; i++){
      int count = scanner.nextInt();
      int x = scanner.nextInt();

      for(int j = 2; j <= count; j++){
        int y = scanner.nextInt();
        adj[x].add(y);
        indeg[y]++;
        x = y;
      }
    }

    Deque<Integer> queue = new LinkedList<>();

    for(int i = 1; i <= N; i++){
      if(indeg[i] == 0){
        queue.add(i);
      }
    }

    ArrayList<Integer> result = new ArrayList<>();

    while(!queue.isEmpty()){
      int x = queue.poll();
      result.add(x);

      for(int y : adj[x]){
        indeg[y]--;

        if(indeg[y] == 0){
          queue.add(y);
        }
      }
    }

    if(result.size() == N){
      for(int x : result){
        sb.append(x).append("\n");
      }
    }else{
      sb.append(0);
    }

    System.out.println(sb);
  }
}
