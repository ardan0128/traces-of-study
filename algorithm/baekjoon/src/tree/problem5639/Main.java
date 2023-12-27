package tree.problem5639;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
  static ArrayList<Integer> arr;
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = "";
    arr = new ArrayList<>();

    while((input = br.readLine()) != null){
      arr.add(Integer.parseInt(input));
    }

    traverse(0, arr.size() - 1);

    System.out.println(sb);
  }

  static void traverse(int l, int r){
    if(l > r){
      return;
    }

    int mid = r;

    for(int i = l + 1; i <= r; i++){
      if(arr.get(i) > arr.get(l)){
        mid = i - 1;
        break;
      }
    }

    traverse(l + 1, mid);
    traverse(mid + 1, r);
    sb.append(arr.get(l)).append("\n");
  }
}
