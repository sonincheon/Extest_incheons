package 알고리즘연습240227;

public class ex18 {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        char [] list = cipher.toCharArray();
        for(int a = 1; a <= list.length/code ;a++){
            answer.append(list[(a * code)-1]);
        }
        return answer.toString();
    }
}
