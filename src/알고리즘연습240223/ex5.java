package 알고리즘연습240223;



//정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
public class ex5 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        int cnt=0;
            for (int number : numbers ){
                answer[cnt]=number*2;
                ++cnt;
            }
        return answer;
    }
}
