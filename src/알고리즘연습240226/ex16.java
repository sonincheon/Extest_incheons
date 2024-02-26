package 알고리즘연습240226;

import java.util.ArrayList;

public class ex16 {

    public ArrayList<Integer> solution(int n, int[] numlist) {
        ArrayList<Integer>answer = new ArrayList<>();
        for(int a : numlist){
            if(a%n==0){
                answer.add(a);
            }
        }
        return answer;
    }
}
