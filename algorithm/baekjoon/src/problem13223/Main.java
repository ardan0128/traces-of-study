package problem13223;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String inputString1 = sc.next();
    String inputString2 = sc.next();

    int[] intList1 = intList(inputString1);
    int[] intList2 = intList(inputString2);

    int startSecond = intList1[0] * 3600 + intList1[1] * 60 + intList1[2];
    int endSecond = intList2[0] * 3600 + intList2[1] * 60 + intList2[2];
    int diffSecond = endSecond - startSecond;

    if(diffSecond <= 0){
      diffSecond += 24 * 3600;
    }

    int hour = diffSecond / 3600;
    int minute = (diffSecond % 3600) / 60;
    int second = diffSecond % 60;

    System.out.println(String.format("%02d:%02d:%02d", hour, minute, second));
  }

  public static int[] intList(String input){
    String[] inputList = input.split(":");
    int[] intList = new int[3];

    for(int i = 0; i < inputList.length; i++){
      intList[i] = Integer.parseInt(inputList[i]);
    }

    return intList;
  }
}
