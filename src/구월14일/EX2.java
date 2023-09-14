package 구월14일;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = solution(a);
        System.out.println(result);
    }

    public static int solution(int n){
        int a = 0;
        for(int i = 1; i < n ; i++){
            if(i*i==n) {
                a = (i + 1) * (i + 1);
                return a;
            }
        }
        return -1;
    }

}


