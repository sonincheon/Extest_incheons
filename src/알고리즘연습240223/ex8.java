package 알고리즘연습240223;

import java.util.Arrays;

public class ex8 {
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10; // 현재 자릿수를 더함
            n /= 10; // 다음 자릿수로 이동
        }
        return answer;
    }
}
