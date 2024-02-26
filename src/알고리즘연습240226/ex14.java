package 알고리즘연습240226;

public class ex14 {

    class Solution {
        public int solution(int n) {
            int answer = 0;
            for(int e = 2; e <=n/2;e++) {
                if (e * e == n) {
                    answer = 1;
                    break;
                } else answer = 2;
            }
            return answer;
        }
    }
}
