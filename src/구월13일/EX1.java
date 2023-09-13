package 구월13일;

import java.util.Scanner;
// 정수 n을 입력받아
// n의 약수를 모두 더한 값을 리턴하는 함수완성해주세요.
public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = a(n);

        System.out.println(result);
        }
    public static int a(int n) {
        int sum = 0;
        for (int e = 1; e <= n; e++) {
            if (n % e == 0) {
                sum += e;
            }
        }
        return sum;
    }
}

