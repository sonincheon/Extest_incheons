package 구월14일;

import java.util.Arrays;

public class EX3 {
    public static void main(String[] args) {
        int n = 11837;
        System.out.println(solution(n));
    }

    public static String solution(long n) {
        char[] digits = String.valueOf(n).toCharArray();
        Arrays.sort(digits);
        StringBuilder sb = new StringBuilder();
        for (int i = digits.length - 1; i >= 0; i--) {
            sb.append(digits[i]);
        }
        return sb.toString();
    }
}
