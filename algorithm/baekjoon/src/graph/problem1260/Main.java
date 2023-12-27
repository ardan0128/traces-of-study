package graph.problem1260;

import java.util.*;

public class Main {
  static StringBuilder sb = new StringBuilder();
  static Scanner scanner = new Scanner(System.in);
  static int N, M, V;
  static boolean[] visit;

  public static void main(String[] args){
    N = scanner.nextInt();
    M = scanner.nextInt();
    V = scanner.nextInt();

    solutionList();
  }

  static void solutionMatrix(){
    int[][] adj = new int[N + 1][N + 1];

    for(int i = 0; i < M; i++){
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      adj[x][y] = 1;
      adj[y][x] = 1;
    }

    visit = new boolean[N + 1];
    dfsMatrix(adj, V);
    sb.append('\n');

    for(int i = 1; i <= N; i++){
      visit[i] = false;
    }

    bfsMatrix(adj, V);

    System.out.println(sb);
  }

  static void dfsMatrix(int[][] adj, int x){
    visit[x] = true;
    sb.append(x).append(' ');

    for(int y = 1; y<= N; y++){
      if(adj[x][y] == 0){
        continue;
      }
      if(visit[y]){
        continue;
      }

      dfsMatrix(adj, y);
    }
  }

  static void bfsMatrix(int[][] adj, int start) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(start);
    visit[start] = true;

    while(!queue.isEmpty()){
      int x = queue.poll();
      sb.append(x).append(' ');

      for(int y = 1; y <= N; y++){
        if(adj[x][y] == 0){
          continue;
        }
        if(visit[y]){
          continue;
        }

        queue.add(y);
        visit[y] = true;
      }
    }
  }

  static void solutionList(){
    ArrayList<Integer>[] adj = new ArrayList[N + 1];

    for(int i = 1; i <= N; i++){
      adj[i] = new ArrayList<>();
    }
    for(int i = 1; i <= M; i++){
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      adj[x].add(y);
      adj[y].add(x);
    }
    for(int i = 1; i <= N; i++){
      Collections.sort(adj[i]);
    }

    visit = new boolean[N + 1];
    dfsList(adj, V);
    sb.append('\n');

    for(int i = 1; i <= N; i++){
      visit[i] = false;
    }

    bfsList(adj, V);

    System.out.println(sb);
  }

  static void dfsList(ArrayList<Integer>[] adj, int x){
    visit[x] = true;
    sb.append(x).append(' ');

    for(int y : adj[x]){
      if(visit[y]){
        continue;
      }

      dfsList(adj, y);
    }
  }

  static void bfsList(ArrayList<Integer>[] adj, int start){
    Queue<Integer> queue = new LinkedList<>();
    queue.add(start);
    visit[start] = true;

    while(!queue.isEmpty()){
      int x = queue.poll();

      sb.append(x).append(' ');

      for(int y : adj[x]){
        if(visit[y]){
          continue;
        }

        queue.add(y);
        visit[y] = true;
      }
    }
  }
}
