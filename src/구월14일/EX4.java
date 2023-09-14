package 구월14일;

public class EX4 {
    public static void main(String[] args) {
    String a = "10";
    String b = "11";
    System.out.println(solution(a,b));
    }
    public static String solution(String a,String b) {
        int q = Integer.parseInt(a, 2);
        int w = Integer.parseInt(b,2);

       return Integer.toBinaryString(q+w);

    }
}
