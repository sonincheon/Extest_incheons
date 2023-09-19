package 구월19일;

public class EX2 {
    public static void main(String[] args) {
        int [] a ={1,2,3,4};
        int k = 2;
        int result = solution(a,k);
        System.out.println(result);
    }

    public static int solution(int [] numbers,int k){
        int result = 0;
        for(int e = 0; e > k;e++){
            if(result<numbers.length){
                result +=(e+2);
            }if(result>=numbers.length){
                result -=numbers.length;
            }
        }
        return numbers[result];
    }
}
