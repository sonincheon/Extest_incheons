package 구월13일;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = a(s);
        System.out.println(result);
    }

    static int a(String b) {
        int sum = 0;
        String [] arr = b.split(" ");

        for(int i = 0; i < arr.length;i++){
            if(arr[i]=="Z"){
                int z_num = Integer.parseInt(arr[i-1]);
                sum -= z_num;
            }else{
                int num = Integer.parseInt(arr[i]);
                sum += num;
            }
        }
        return sum;
    }
}