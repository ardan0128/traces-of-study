package problem18404;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  static int N, M, x, y;
  static int[][] dist;
  static int[][] dir = {{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, 1}, {2, -1}};

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    M = scanner.nextInt();
    x = scanner.nextInt();
    y = scanner.nextInt();
    dist = new int[N + 1][N + 1];

    bfs();

    while(M-- > 0){
      int mx = scanner.nextInt();
      int my = scanner.nextInt();

      System.out.print(dist[mx][my] + " ");
    }
  }

  static void bfs(){
    for(int i = 1; i <= N; i++){
      for(int j = 1; j <= N; j++){
        dist[i][j] = -1;
      }
    }

    Queue<Integer> queue = new LinkedList<>();
    dist[x][y] = 0;

    queue.add(x);
    queue.add(y);

    while(!queue.isEmpty()){
      int qx = queue.poll();
      int qy = queue.poll();

      for(int k = 0; k < 8; k++){
        int kx = qx + dir[k][0];
        int ky = qy + dir[k][1];

        if(kx < 1 || ky < 1 || kx > N || ky > N){
          continue;
        }

        if(dist[kx][ky] != -1){
          continue;
        }

        queue.add(kx);
        queue.add(ky);

        dist[kx][ky] = dist[qx][qy] + 1;
      }
    }
  }
}
