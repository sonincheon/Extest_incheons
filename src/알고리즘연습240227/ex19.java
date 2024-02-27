package 알고리즘연습240227;

public class ex19 {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        char [] list = my_string.toCharArray();
        for (char a : list){
            if(Character.isUpperCase(a)){
                answer.append(Character.toLowerCase(a));
            }else {
                answer.append(Character.toUpperCase(a));
            }
        }
        return answer.toString();
    }

}
