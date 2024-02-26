package 알고리즘연습240226;

public class ex15 {
    public int solution(String my_string) {
        int answer = 0;
        for(char a1 : my_string.toCharArray()){
            if(Character.isDigit(a1)){
                answer+=Character.getNumericValue(a1);
            }
        }
        return answer;
    }

}
