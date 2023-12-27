package graph.problem3055;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  static int N, M;
  static String[] area;
  static int[][] dist_water, dist_hedgehog;
  static boolean[][] visit;
  static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    M = scanner.nextInt();
    area = new String[N];

    for(int i =0; i < N; i++){
      area[i] = scanner.next();
    }

    visit = new boolean[N][M];
    dist_water = new int[N][M];
    dist_hedgehog = new int[N][M];

    bfsWater();
    bfsHedgehog();

    for(int i = 0; i < N; i++){
      for(int j = 0; j < M; j++){
        if(area[i].charAt(j) == 'D'){
          if(dist_hedgehog[i][j] == -1){
            System.out.println("KAKTUS");
          }else{
            System.out.println(dist_hedgehog[i][j]);
          }
        }
      }
    }
  }

  static void bfsWater(){
    Queue<Integer> queue = new LinkedList<>();

    for(int i = 0; i < N; i++){
      for(int j = 0; j < M; j++){
        dist_water[i][j] = -1;
        visit[i][j] = false;

        if(area[i].charAt(j) == '*'){
          queue.add(i);
          queue.add(j);
          dist_water[i][j] = 0;
          visit[i][j] = true;
        }
      }
    }

    while(!queue.isEmpty()){
      int x = queue.poll();
      int y = queue.poll();

      for(int i = 0; i < 4; i++){
        int ix = x + dir[i][0];
        int iy = y + dir[i][1];

        if(ix < 0 || iy < 0 || ix >= N || iy >= M){
          continue;
        }
        if(area[ix].charAt(iy) != '.'){
          continue;
        }
        if(visit[ix][iy]){
          continue;
        }

        queue.add(ix);
        queue.add(iy);
        visit[ix][iy] = true;
        dist_water[ix][iy] = dist_water[x][y] + 1;
      }
    }
  }

  static void bfsHedgehog(){
    Queue<Integer> queue = new LinkedList<>();

    for(int i = 0; i < N; i++){
      for(int j = 0; j < M; j++){
        dist_hedgehog[i][j] = -1;
        visit[i][j] = false;

        if(area[i].charAt(j) == 'S'){
          queue.add(i);
          queue.add(j);
          dist_hedgehog[i][j] = 0;
          visit[i][j] = true;
        }
      }
    }

    while(!queue.isEmpty()){
      int x = queue.poll();
      int y = queue.poll();

      for(int i = 0; i < 4; i++){
        int ix = x + dir[i][0];
        int iy = y + dir[i][1];

        if(ix < 0 || iy < 0 || ix >= N || iy >= M){
          continue;
        }
        if(area[ix].charAt(iy) != '.' && area[ix].charAt(iy) != 'D'){
          continue;
        }
        if(dist_water[ix][iy] != -1 && dist_water[ix][iy] <= dist_hedgehog[x][y] + 1){
          continue;
        }
        if(visit[ix][iy]){
          continue;
        }

        queue.add(ix);
        queue.add(iy);
        visit[ix][iy] = true;
        dist_hedgehog[ix][iy] = dist_hedgehog[x][y] + 1;
      }
    }
  }
}
