package 알고리즘연습2402229;

public class ex30 {
    public int solution(int order) {
        int answer = 0;
        String orderStr = String.valueOf(order);

        char[] a = orderStr.toCharArray();
        char[] b = {'3', '6', '9'};

        for (char a1 : a) {
            for (char b1 : b) {
                if (a1 == b1) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
