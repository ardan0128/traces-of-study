package problem13144;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
  static int N;
  static int[] arr, count;

  public static void main(String[] args){
    FastReader scanner = new FastReader();
    N = scanner.nextInt();
    arr = new int[N + 1];
    for(int i = 1; i <= N; i++) {
      arr[i] = scanner.nextInt();
    }
    count = new int[100000 + 1];

    long result = 0;

    for(int L = 1, R = 0; L <= N; L++){
      while(R + 1 <= N && count[arr[R + 1]] == 0){
        R++;
        count[arr[R]]++;
      }

      result += R - L + 1;
      count[arr[L]]--;
    }

    System.out.println(result);
  }

  static class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    public FastReader(String s) throws FileNotFoundException {
      br = new BufferedReader(new FileReader(new File(s)));
    }

    String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return str;
    }
  }
}
