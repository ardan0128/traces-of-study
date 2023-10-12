package problem7569;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  static int M, N, H;
  static int[][][] dist, box;
  static int[][] dir = {{1,0,0,},{-1,0,0},{0,1,0},{0,-1,0},{0,0,1}, {0,0,-1}};

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    M = scanner.nextInt();
    N = scanner.nextInt();
    H = scanner.nextInt();
    dist = new int[H + 1][N + 1][M + 1];
    box = new int[H + 1][N + 1][M + 1];

    for(int h = 1; h <= H; h++){
      for(int n = 1; n <= N; n++){
        for(int m = 1; m <= M; m++){
          box[h][n][m] = scanner.nextInt();
        }
      }
    }

    bfs();

    int result = 0;

    for(int h = 1; h <= H; h++){
      for(int n = 1; n <= N; n++){
        for(int m = 1; m <= M; m++){
          if(box[h][n][m] == -1){
            continue;
          }

          if(dist[h][n][m] == -1){
            System.out.println(-1);
            return;
          }

          result = Math.max(result, dist[h][n][m]);
        }
      }
    }

    System.out.println(result);
  }

  static void bfs(){
    Queue<Integer> queue = new LinkedList<>();

    for(int h = 1; h <= H; h++){
      for(int n = 1; n <= N; n++){
        for(int m = 1; m <= M; m++){
          dist[h][n][m] = -1;

          if(box[h][n][m] == 1){
            dist[h][n][m] = 0;

            queue.add(h);
            queue.add(n);
            queue.add(m);
          }
        }
      }
    }

    while(!queue.isEmpty()){
      int h = queue.poll();
      int n = queue.poll();
      int m = queue.poll();

      for(int i = 0; i < 6; i++){
        int ih = h + dir[i][0];
        int in = n + dir[i][1];
        int im = m + dir[i][2];

        if(ih < 1 || in < 1 || im < 1 || ih > H || in > N || im > M){
          continue;
        }

        if(dist[ih][in][im] != -1){
          continue;
        }

        if(box[ih][in][im] == -1){
          continue;
        }

        dist[ih][in][im] = dist[h][n][m] + 1;

        queue.add(ih);
        queue.add(in);
        queue.add(im);
      }
    }
  }
}
