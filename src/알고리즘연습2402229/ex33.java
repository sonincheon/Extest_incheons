package 알고리즘연습2402229;

public class ex33 {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        char [] a = my_string.toCharArray();
        for(char a1 : a ){
            if(answer.indexOf(String.valueOf(a1)) == -1){
                answer.append(a1);}
        }
        return answer.toString();
    }
}
