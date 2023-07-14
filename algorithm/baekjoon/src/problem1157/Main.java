package problem1157;

import java.util.Scanner;

public class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String inputText = sc.next();

    int[] inputCount = new int[26];
    for(int i = 0; i < inputText.length(); i++){
      if(inputText.charAt(i) > 'Z'){
        inputCount[inputText.charAt(i) - 'a']++;
      }else{
        inputCount[inputText.charAt(i) - 'A']++;
      }
    }

    int maxCount = 1;
    int maxIndex = 0;
    for(int i = 1; i < inputCount.length; i++){
      if(inputCount[i] > inputCount[maxIndex]){
        maxIndex = i;
        maxCount = 1;
      }else if(inputCount[i] == inputCount[maxIndex]){
        maxCount++;
      }
    }

    if(maxCount > 1){
      System.out.println("?");
    }else{
      System.out.println((char) (maxIndex + 'A'));
    }
  }
}
