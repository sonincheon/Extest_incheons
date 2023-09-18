package 구월18일;

public class Ex1 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        int [] b = {-3,-1,0,2};
        int result=solution(a,b);
        System.out.println(result);

    }

    public static int solution (int []a,int []b) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (i == j) {
                    result += (a[i] * b[j]);
                }
            }
        }
        return result;
    }

}
