package 알고리즘연습240226;

public class ex11 {

    public int solution(int n) {
        int answer = 0;
        for(int e=1;e<=n;e++){
            if(n%e==0) {
                ++answer;
            }
        }

        return answer;
    }
}
