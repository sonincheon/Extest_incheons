package 알고리즘연습240306;

import java.util.ArrayList;

import static java.util.Collections.sort;

public class ex34 {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        char [] a = my_string.toCharArray();
        for(char a1 : a){
            Integer.parseInt(String.valueOf(a1));
        }

        return answer.toString();
    }
}
