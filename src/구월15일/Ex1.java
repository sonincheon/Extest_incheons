package 구월15일;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        String [] a = solution(n);
        for(String e : a ){
            System.out.print(e+"");
        }
    }
    public static String [] solution(int n){
        String a = "수";
        String b = "박";
        String [] e= new String[n];
        for(int i = 0; i < n;i++){
            if(i % 2 == 0){
                e[i]=a;
            }else {e[i]=b;}
        }
        return e;
    }
}
