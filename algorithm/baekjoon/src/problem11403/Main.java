package problem11403;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  static int N;
  static int[][] G;
  static boolean[] visit;
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    G = new int[N + 1][N + 1];

    for(int i = 1; i <= N; i++){
      for(int j = 1; j <= N; j++){
        G[i][j] = scanner.nextInt();
      }
    }

    visit = new boolean[N + 1];

    for(int i = 1; i <= N; i++){
      bfs(i);
    }

    System.out.println(sb);
  }

  static void bfs(int start){
    Queue<Integer> queue = new LinkedList<>();

    for(int i = 1; i <= N; i++){
      visit[i] = false;
    }

    queue.add(start);
    visit[start] = false;

    while(!queue.isEmpty()){
      int x = queue.poll();

      for(int y = 1; y <= N; y++){
        if(G[x][y] == 0){
          continue;
        }

        if(visit[y]){
          continue;
        }

        queue.add(y);
        visit[y] = true;
      }
    }

    for(int i = 1; i <= N; i++){
      if(visit[i] == true){
        sb.append(1).append(" ");
      }else if(visit[i] == false){
        sb.append(0).append(" ");
      }
    }

    sb.append("\n");
  }
}
