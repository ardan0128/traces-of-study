package problem1543;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String input1 = sc.nextLine();
    String input2 = sc.nextLine();
    int count = 0;

    while (input1.contains(input2)){
      if(input1.indexOf(input2) < 0){
        break;
      }

      input1 = input1.substring(input2.length() + input1.indexOf(input2));
      count++;
    }

    System.out.println(count);
  }
}
