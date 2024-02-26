package 알고리즘연습240226;
//양꼬치 문제
public class ex10 {


    public int solution(int n, int k) {
        int answer = (n*12000)+(k*2000)-((Integer)(n/10)*2000);
        return answer;
    }
}
