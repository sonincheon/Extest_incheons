package 알고리즘연습240311;

public class ex37 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        if(m>n){
            if(m%n==0){
                answer[0]=n;
                answer[1]=m;
            }else {
                answer[0]=1;
                answer[1]=n*m;
            }}else {
            if(n%m==0){
                answer[0]=m;
                answer[1]=n;
            }else {
                answer[0]=1;
                answer[1]=n*m;
            }
        }
        return answer;
    }
}
