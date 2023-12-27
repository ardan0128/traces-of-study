package tree.problem1991;

import java.util.Scanner;

public class Main {
  static int N;
  static int[][] node;
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    node = new int[30][2];

    for(int i = 0; i < N; i++){
      String root = scanner.next();

      for(int j = 0; j < 2; j++){
        String leaf = scanner.next();
        int x = root.charAt(0) - 'A';
        int y = leaf.charAt(0) - 'A';

        if(!leaf.equals(".")){
          node[x][j] = y;
        }else{
          node[x][j] = -1;
        }
      }
    }

    preOrder(0);
    sb.append("\n");
    inOrder(0);
    sb.append("\n");
    postOrder(0);

    System.out.println(sb);
  }

  static void preOrder(int x){
    if(x == -1){
      return;
    }

    sb.append((char) (x + 'A'));
    preOrder(node[x][0]);
    preOrder(node[x][1]);
  }

  static void inOrder(int x){
    if(x == -1){
      return;
    }

    inOrder(node[x][0]);
    sb.append((char) (x + 'A'));
    inOrder(node[x][1]);
  }

  static void postOrder(int x){
    if(x == -1){
      return;
    }

    postOrder(node[x][0]);
    postOrder(node[x][1]);
    sb.append((char) (x + 'A'));
  }
}
