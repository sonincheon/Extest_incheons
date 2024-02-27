package 알고리즘연습240227;

public class ex20 {
    public int solution(int hp) {
        int cnt1 = hp /5;
        int cnt2 = hp%5 /3;
        int cnt3 = (hp%5 %3);
        return cnt1+cnt2+cnt3;
    }

}
