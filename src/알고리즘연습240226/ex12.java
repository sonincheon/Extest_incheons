package 알고리즘연습240226;

public class ex12 {
    public String solution(String my_string) {
        String answer = my_string;
        char [] list ={'a','e','i','o','u'};
        for(char b : list){
            answer=answer.replace(String.valueOf(b),"");
        }
        return answer;
    }
}
