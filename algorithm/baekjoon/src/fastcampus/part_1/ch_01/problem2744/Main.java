package fastcampus.part_1.ch_01.problem2744;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String inputText = sc.next();

        StringBuffer result = new StringBuffer();
        for(int i = 0; i < inputText.length(); i++){
            if((int) inputText.charAt(i) >= 97){
                result.append((char)((int) inputText.charAt(i) - 32));
            } else {
                result.append((char)((int) inputText.charAt(i) + 32));
            }
        }

        System.out.println(result.toString());
    }
}
