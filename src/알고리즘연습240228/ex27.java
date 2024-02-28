package 알고리즘연습240228;

import java.util.ArrayList;

import static java.util.Collections.sort;

public class ex27 {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int a = 1 ; a<=n;a++){
            if(n%a==0){
                answer.add(a);
            }
        }
        sort(answer);
        return answer;
    }

}
