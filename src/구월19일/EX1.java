package 구월19일;

import java.util.Arrays;
import java.util.Comparator;

public class EX1 {
    public static void main(String[] args) {
        String n = "Zbcdefg";
        String result = solution(n);
        System.out.println(result);
    }

    public static String solution(String n) {
        String[] a = n.split("");
        Arrays.sort(a, Comparator.reverseOrder());
        String b = String.join("",a);
        return b;
    }
}
