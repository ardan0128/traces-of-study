package problem4963;

import java.util.Scanner;

public class Main {
  static int W, H;
  static int[][] area;
  static boolean[][] visit;
  static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    while(true){
      H = scanner.nextInt();
      W = scanner.nextInt();
      area = new int[W][H];

      for(int i = 0; i < W; i++){
        for(int j = 0; j < H; j++){
          area[i][j] = scanner.nextInt();
        }
      }

      visit = new boolean[W][H];

      if(W == 0 && H == 0){
        break;
      }

      int result = 0;

      for(int i = 0; i < W; i++){
        for(int j = 0; j < H; j++){
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

    for(int i = 0; i < 8; i++){
      int ix = x + dir[i][0];
      int iy = y + dir[i][1];

      if(ix < 0 || iy < 0 || ix >= W || iy >= H){
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
