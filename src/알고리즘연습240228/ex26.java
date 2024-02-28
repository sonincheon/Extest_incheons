package 알고리즘연습240228;

public class ex26 {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder answer = new StringBuilder();
        char [] a = my_string.toCharArray();
        char b = a [num1];
        char c = a[num2];
        a [num1] = c;
        a [num2] = b;
        for(char a1 : a){
            answer.append(a1);
        }
        return answer.toString();
    }
}
