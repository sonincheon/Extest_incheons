package 구월13일;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = solution(a);
        System.out.println(result);
    }

    public static int solution(int b) {
        int sum = 0;
        String string_a = String.valueOf(b);

        for (int i = 0; i < string_a.length(); i++) {
            int x = Character.getNumericValue(string_a.charAt(i));
            sum += x;
        }
        return sum;
    }
}