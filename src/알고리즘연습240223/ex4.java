package 알고리즘연습240223;
//사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다. 사분면은 아래와 같이 1부터 4까지 번호를매깁니다.
public class ex4 {

    public int solution(int[] dot) {
        int answer = 0;
        if(dot[0]>0){
            answer = dot[1]>0 ? 2:3;
        }else {
            answer = dot[1]>0 ? 1:4;
        }
        return answer;
    }

}
