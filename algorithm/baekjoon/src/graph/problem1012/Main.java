package graph.problem1012;

import java.util.Scanner;

public class Main {
  static int T, M, N, K;
  static int[][] area;
  static boolean[][] visit;
  static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    T = scanner.nextInt();

    while(T-- > 0){
      M = scanner.nextInt();
      N = scanner.nextInt();
      K = scanner.nextInt();
      area = new int[M][N];

      for(int i = 0; i < K; i++){
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        area[x][y] = 1;
      }

      visit = new boolean[M][N];

      int result = 0;

      for(int i = 0; i < M; i++){
        for(int j = 0; j < N; j++){
          if(!visit[i][j] && area[i][j] == 1){
            result++;
            dfs(i, j);
          }
        }
      }

      System.out.println(result);
    }
  }

  static void dfs(int x, int y){
    visit[x][y] = true;

    for(int i = 0; i < 4; i++){
      int ix = x + dir[i][0];
      int iy = y + dir[i][1];

      if(ix < 0 || iy < 0 || ix >= M || iy >= N){
        continue;
      }

      if(area[ix][iy] == 0){
        continue;
      }

      if(visit[ix][iy]){
        continue;
      }

      dfs(ix, iy);
    }
  }
}
