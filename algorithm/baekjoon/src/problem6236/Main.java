package problem6236;

import java.util.Scanner;

public class Main {
    static int N, M;
    static int[] money;

    public static void main(String[] main){
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        money = new int[N + 1];

        for(int i = 1; i <= N; i++){
            money[i] = scanner.nextInt();
        }

        int L = money[1];
        int R = 1000000000;
        int result = 0;

        for(int i = 1; i <= N; i++){
            L = Math.max(L, money[i]);
        }

        while(L <= R){
            int MID = (L + R) / 2;

            if(determinate(MID)){
                result = MID;
                R = MID - 1;
            }else{
                L = MID + 1;
            }
        }

        System.out.println(result);
    }

    static boolean determinate(int withdrawl){
        int count = 1;
        int sum = 0;

        for(int i = 1; i <= N; i++){
            if(sum + money[i] > withdrawl){
                count++;
                sum = money[i];
            }else{
                sum += money[i];
            }
        }

        return count <= M;
    }
}
