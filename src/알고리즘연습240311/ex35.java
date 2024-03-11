package 알고리즘연습240311;

import java.util.Scanner;

public class ex35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = 0; i<b;i++){
            for (int i1 = 0; i1<a;i1++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
