package 알고리즘연습240223;

import java.util.ArrayList;

//정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
public class ex9 {

    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answers = new ArrayList();
        for(int e = 1;e<=n;e++){
            if(e%2==1) {
                answers.add(e);
            }
        }
        return answers;
    }

}
