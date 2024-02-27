package 알고리즘연습240227;

import java.util.Arrays;

public class ex23 {

    public int solution(int[] numbers) {
        int answer = 0;
        for(int a =0; a < numbers.length; a ++){
            for(int b =0; b < numbers.length; b ++){
                if(a!=b){
                int e =numbers[a] * numbers[b] ;
                if(answer<e){
                    answer = Math.max(answer, e);
                }
                }
            }
        }
        return answer;
    }

}
