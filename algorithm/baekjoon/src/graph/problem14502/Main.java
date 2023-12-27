package graph.problem14502;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  static int N, M, wall, result;
  static int[][] area, blank;
  static boolean[][] visit;
  static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    M = scanner.nextInt();
    area = new int[N + 1][M + 1];
    blank = new int[N * M + 1][2];
    visit = new boolean[N + 1][M + 1];

    for(int i = 1; i <= N; i++){
      for(int j = 1; j <= M; j++){
        area[i][j] = scanner.nextInt();
      }
    }

    for(int i = 1; i <= N; i++){
      for(int j = 1; j <= M; j++){
        if(area[i][j] == 0){
          wall++;
          blank[wall][0] = i;
          blank[wall][1] = j;
        }
      }
    }

    dfs(1, 0);
    System.out.println(result);
  }

  static void bfs(){
    Queue<Integer> queue = new LinkedList<>();

    for(int i = 1; i <= N; i++){
      for(int j = 1; j <= M; j++){
        visit[i][j] = false;

        if(area[i][j] == 2){
          queue.add(i);
          queue.add(j);
          visit[i][j] = true;
        }
      }
    }

    while(!queue.isEmpty()){
      int x = queue.poll();
      int y = queue.poll();

      for(int i = 0; i < 4; i++){
        int nx = x + dir[i][0];
        int ny = y + dir[i][1];

        if(nx < 1 || ny < 1 || nx > N || ny > M){
          continue;
        }

        if(area[nx][ny] != 0){
          continue;
        }

        if(visit[nx][ny]){
          continue;
        }

        visit[nx][ny] = true;
        queue.add(nx);
        queue.add(ny);
      }
    }

    int count = 0;

    for(int i = 1; i <= N; i++){
      for(int j = 1; j <= M; j++){
        if(area[i][j] == 0 && !visit[i][j]){
          count++;
        }
      }
    }

    result = Math.max(result, count);
  }

  static void dfs(int idx, int select){
    if(select == 3){
      bfs();
      return;
    }

    if(idx > wall){
      return;
    }

    area[blank[idx][0]][blank[idx][1]] = 1;
    dfs(idx + 1, select + 1);

    area[blank[idx][0]][blank[idx][1]] = 0;
    dfs(idx + 1, select);
  }
}
