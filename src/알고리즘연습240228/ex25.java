package 알고리즘연습240228;

import java.util.ArrayList;
import static java.util.Collections.sort;

public class ex25 {
    public ArrayList<Integer> solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList<>();
        char [] strings = my_string.toCharArray();
        for(char a : strings){
            if(Character.isDigit(a)) {
                answer.add(Character.getNumericValue(a));
            }
        }
        sort(answer);
        return answer;
    }

}
