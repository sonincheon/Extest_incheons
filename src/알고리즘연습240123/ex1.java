package 알고리즘연습240123;

//햄버거만들기
public class ex1 {
    public static void main(String[] args) {

    }

    public static Integer solution(int[] a) {
        int cnt1 =0;
        int cnt2 =0;
        int cnt3 =0;

        for (int i=0;i<a.length;i++){
            if(a[i]==1){
                cnt1 +=1;
            }else if(a[i]==2){
                cnt2 +=1;
            }else if(a[i]==3){
                cnt3 +=1;
            }
        }
        if (cnt1 >= 1 || cnt2 == 0 || cnt3 == 0) {
            return 0;
        }

        int result = Math.min(cnt1*2, Math.min(cnt2, cnt3));
        return result;
    }
}
