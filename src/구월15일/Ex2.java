package 구월15일;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int [] n = {7,77,17};
        int result = solution(n);
        System.out.println(result);
    }

    public static int solution(int[] n){
        int result = 0;

        for (int i = 0; i <n.length; i++){
            String a = String.valueOf(n[i]);
            for(int j =0; j<a.length();j++){
                if(a.charAt(j)==7){
                    result++;
                }
            }
        }
        return result;
    }
}

