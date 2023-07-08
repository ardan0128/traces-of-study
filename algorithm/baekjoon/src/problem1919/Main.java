package problem1919;

import java.util.Scanner;

public class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String input1 = sc.next();
    String input2 = sc.next();

    int[] input1Count = getInputCount(input1);
    int[] input2Count = getInputCount(input2);

    int result = 0;
    for(int i = 0; i < 26; i++){
      result += Math.abs(input1Count[i] - input2Count[i]);
    }

    System.out.println(result);
  }

  static int[] getInputCount(String input){
    int[] inputCount = new int[26];
    for(int i = 0; i < input.length(); i++){
      inputCount[input.charAt(i) - 'a']++;
    }
    return inputCount;
  }
}
