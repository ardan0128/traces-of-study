package problem2178;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  static int N, M;
  static String[] area;
  static int[][] dist;
  static boolean[][] visit;
  static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    M = scanner.nextInt();
    dist = new int[N][M];
    visit = new boolean[N][M];
    area = new String[N];

    for(int i = 0; i < N; i++){
      area[i] = scanner.next();
    }

    bfs(0, 0);
    System.out.println(dist[N - 1][M - 1]);
  }

  static void bfs(int x, int y){
    for(int i = 0; i < N; i++){
      for(int j = 0; j < M; j++){
        dist[i][j] = -1;
      }
    }

    Queue<Integer> queue = new LinkedList<>();
    queue.add(x);
    queue.add(y);
    dist[x][y] = 1;
    visit[x][y] = true;

    while(!queue.isEmpty()){
      x = queue.poll();
      y = queue.poll();

      for(int i = 0; i < 4; i++){
        int nx = x + dir[i][0];
        int ny = y + dir[i][1];

        if(nx < 0 || ny < 0 || nx >= N || ny >= M){
          continue;
        }
        if(area[nx].charAt(ny) == '0'){
          continue;
        }
        if(visit[nx][ny]){
          continue;
        }

        queue.add(nx);
        queue.add(ny);
        visit[nx][ny] = true;
        dist[nx][ny] = dist[x][y] + 1;
      }
    }
  }
}
