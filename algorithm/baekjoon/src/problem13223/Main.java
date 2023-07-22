package problem13223;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String inputString1 = sc.nextLine();
    String inputString2 = sc.nextLine();

    int[] intList1 = intList(inputString1);
    int[] intList2 = intList(inputString2);

    String hour = "";
    String minute = "";
    String second = "";

    if(intList2[2] < intList1[2]){
      intList2[1] = intList2[1] - 1;
      second = String.valueOf(60 - Math.abs(intList2[2] - intList1[2]));
    }else{
      second = String.valueOf(Math.abs(intList2[2] - intList1[2]));
    }

    if(second.length() < 2){
      second = "0" + second;
    }

    if(intList2[1] < intList1[1]){
      intList2[0] = intList2[0] - 1;
      minute = String.valueOf(60 - Math.abs(intList2[1] - intList1[1]));
    }else{
      minute = String.valueOf(Math.abs(intList2[1] - intList1[1]));
    }

    if(minute.length() < 2){
      minute = "0" + minute;
    }

    if(intList2[0] < intList1[0]){
      hour = String.valueOf(24 - Math.abs(intList2[0] - intList1[0]));
    }else{
      hour = String.valueOf(Math.abs(intList2[0] - intList1[0]));
    }

    if(hour.length() < 2){
      hour = "0" + hour;
    }

    if(hour.equals("00") && minute.equals("00") && second.equals("00")){
      System.out.println("24:00:00");
    }else {
      System.out.println(hour + ":" + minute + ":" + second);
    }
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
