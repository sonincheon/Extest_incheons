package 알고리즘연습240227;

import java.util.ArrayList;
import java.util.Arrays;

public class ex22 {
    public ArrayList<Integer> solution(int[] array) {
        ArrayList<Integer> answer = new ArrayList<>();
        int max = array[0];
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        answer.add(max);
        answer.add(maxIndex);

        return answer;
    }

}
