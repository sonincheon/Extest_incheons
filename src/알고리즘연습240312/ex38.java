package 알고리즘연습240312;

import java.util.ArrayList;
import java.util.Collections;

public class ex38 {

    public ArrayList<Integer> solution(int[] array, int[][] commands) {
        ArrayList<Integer> answer =new ArrayList<>();
        for(int[] a : commands){
            answer.add(change(array,a));
        }
        return answer;
    }
    public int change (int[] array, int[] b){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = b[0]-1;i<=b[1]-1;i++){
            list.add(array[i]);
        }
        Collections.sort(list);
      return list.get(b[2]-1);
    }
}
