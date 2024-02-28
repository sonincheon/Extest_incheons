package 알고리즘연습240228;

public class ex29 {
    public int solution(String A, String B) {
        int answer = 0;
        char [] aList = A.toCharArray();
        char [] bList = B.toCharArray();
        if(aList[0] == bList[1]){
            answer=1;
        }else if(A.equals(B)){
        }else answer=-1;
        return answer;
    }
}
