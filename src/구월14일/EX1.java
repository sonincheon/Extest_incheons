package 구월14일;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수입력 : ");
        int num = sc.nextInt();
        int result = solution(num);
        System.out.println(result);

    }
    public static int solution(int num){
        for(int e = 2; e< num;e ++){
          if (num % e==1) {
             return e;
          }
        }
        return -1;
    }
}
