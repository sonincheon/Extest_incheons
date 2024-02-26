package 알고리즘연습240226;

import java.util.HashMap;
import java.util.Map;

public class ex13 {

    public int solution(int price) {
        int discount = 0;
        if (price >= 500000) {
            discount = 20;
        } else if (price >= 300000) {
            discount = 10;
        } else if (price >= 100000) {
            discount = 5;
        }
        int answer =price*(100-discount)/100;
        return answer;
    }

}
