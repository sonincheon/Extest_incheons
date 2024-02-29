package 알고리즘연습2402229;

public class ex32 {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            for (int e = 1; e <= i; e++) {
                if (i % e == 0) {
                    cnt++;
                }
            }
            if (cnt >= 3) {
                answer++;
            }
            cnt = 0;
        }
        return answer;
    }
}
