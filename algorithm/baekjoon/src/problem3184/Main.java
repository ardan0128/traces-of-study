package problem3184;

import java.util.Scanner;

public class Main {
  static int R, C, totalSheep, totalWolf, sheep, wolf;
  static String[] area;
  static boolean[][] visit;
  static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

  public static void main(String[] args){
    StringBuilder sb = new StringBuilder();
    Scanner scanner = new Scanner(System.in);
    R = scanner.nextInt();
    C = scanner.nextInt();
    area = new String[R];

    for(int i = 0; i < R; i++){
      area[i] = scanner.next();
    }

    visit = new boolean[R][C];

    for(int i = 0; i < R; i++){
      for(int j = 0; j < C; j++){
        if(!visit[i][j] && area[i].charAt(j) != '#'){
          sheep = 0;
          wolf = 0;
          dfs(i, j);

          if(sheep > wolf){
            totalSheep += sheep;
          }else{
            totalWolf += wolf;
          }
        }
      }
    }

    sb.append(totalSheep).append(' ').append(totalWolf);
    System.out.println(sb);
  }

  static void dfs(int x, int y){
    if(area[x].charAt(y) == 'o'){
      sheep++;
    }

    if(area[x].charAt(y) == 'v'){
      wolf++;
    }

    visit[x][y] = true;

    for(int i = 0; i < 4; i++){
      int ix = x + dir[i][0];
      int iy = y + dir[i][1];

      if(ix < 0 || iy < 0 || ix >= R || iy >= C){
        continue;
      }

      if(area[ix].charAt(iy) == '#'){
        continue;
      }

      if(visit[ix][iy]){
        continue;
      }

      dfs(ix, iy);
    }
  }
}
