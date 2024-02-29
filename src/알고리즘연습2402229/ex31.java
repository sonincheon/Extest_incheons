package 알고리즘연습2402229;

import java.util.ArrayList;

import static java.util.Collections.sort;

public class ex31 {
    public String solution(String my_string) {
        ArrayList<Character> answer = new ArrayList<>();
        char [] a = my_string.toCharArray();
        for(char b : a){
            answer.add(Character.toLowerCase(b));
        }
        sort(answer);

        StringBuilder result = new StringBuilder();
        for (char c : answer) {
            result.append(c);
        }

        return result.toString();
    }
}
