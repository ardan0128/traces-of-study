package problem1015;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static class Sequence implements Comparable<Sequence> {
    public int n, idx;

    @Override
    public int compareTo(Sequence sequence) {
      return n - sequence.n;
    }
  }

  static StringBuilder sb = new StringBuilder();
  static int N;
  static int[] P;
  static Sequence[] B;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    P = new int[N];
    B = new Sequence[N];

    for(int i = 0; i < N; i++){
      B[i] = new Sequence();
      B[i].n = scanner.nextInt();
      B[i].idx = i;
    }

    Arrays.sort(B);
    for(int i = 0; i < N; i++){
      P[B[i].idx] = i;
    }
    for(int i = 0; i < N; i++){
      sb.append(P[i]).append(' ');
    }

    System.out.println(sb);
  }
}
