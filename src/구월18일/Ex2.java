package 구월18일;

public class Ex2 {
    public static void main(String[] args) {
        int a = 13;
        int b = 17;
        int result =solution(a,b);
        System.out.println(result);
    }


    public static int solution(int a,int b){
        int sum =0 ;
        for(int i = a; i<=b;i++){
                if(countnum(i) % 2 == 0){
                    sum+=i;
            }
                else sum -= i;
        }
        return sum;
    }
    public static int countnum(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return count;
}
}
