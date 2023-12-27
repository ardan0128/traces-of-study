package graph.problem7562;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  static int T, N, sx, sy, ex, ey;
  static int[][] dist;
  static int[][] dir = {{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, 1}, {2, -1}};

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    T = scanner.nextInt();

    while(T-- > 0){
      N = scanner.nextInt();
      sx = scanner.nextInt();
      sy = scanner.nextInt();
      ex = scanner.nextInt();
      ey = scanner.nextInt();
      dist = new int[N][N];

      System.out.println(bfs());
    }
  }

  static int bfs(){
    for(int i = 0; i < N; i++){
      for(int j = 0; j < N; j++){
        dist[i][j] = -1;
      }
    }

    Queue<Integer> queue = new LinkedList<>();
    dist[sx][sy] = 0;
    queue.add(sx);
    queue.add(sy);

    while(!queue.isEmpty()){
      int x = queue.poll();
      int y = queue.poll();

      for(int k = 0; k < 8; k++){
        int nx = x + dir[k][0];
        int ny = y + dir[k][1];

        if(nx < 0 || ny < 0 || nx >= N || ny >= N){
          continue;
        }

        if(dist[nx][ny] != -1){
          continue;
        }

        queue.add(nx);
        queue.add(ny);
        dist[nx][ny] = dist[x][y] + 1;
      }
    }

    return dist[ex][ey];
  }
}
