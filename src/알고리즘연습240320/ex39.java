package 알고리즘연습240320;
import java.util.Arrays;

public class ex39 {

    //ex1
    public String solution(String s) {
        String[] sList = s.split(" ", 0);
        int[] a = new int[sList.length];
        for(int e = 0; e < sList.length; e++ ){
            a[e]= Integer.parseInt(sList[e]);
        }
        //최대값
        int max = Integer.MIN_VALUE;
        for (int num : a) {
            max = Math.max(max, num);
        }
        //최소값
        int min = Integer.MAX_VALUE;
        for (int num : a) {
            min = Math.min(min, num);
        }
        String answer = max + " "+min;
        return answer;
    }

    //ex2
    public String solution2(String s) {
        StringBuilder answer = new StringBuilder();
        String [] a = s.split("");
        for(int e = 0; e < a.length; e++){
            String a2 =a[e];
            if (e == 0 || a[e - 1].equals(" ")) { // 단어의 첫 글자이거나 앞에 공백이 있을 때
                a2 = a[e].toUpperCase();
            } else {
                a2 = a[e].toLowerCase();
            }
            answer.append(a2);
        }

        return answer.toString();
    }

    //ex3
    public int solution3(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(B);
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[A.length - 1 - i]; // 배열 A는 오름차순, 배열 B는 내림차순으로 순회하여 곱셈 수행
        }
        return answer;
    }

    //ex4
    boolean solution4(String s) {
        boolean answer = true;

        return answer;
    }

}
