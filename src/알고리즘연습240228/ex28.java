package 알고리즘연습240228;


public class ex28 {
    public int solution(int n) {
        int[] numbers = new int[n];
        int count = 0;
        for (int i = 1; count < n; i++) {
            if (i % 3 != 0 && Integer.toString(i).indexOf('3') == -1) {
                numbers[count] = i;
                count++;
            }
        }
        return numbers[n - 1];
    }
}
