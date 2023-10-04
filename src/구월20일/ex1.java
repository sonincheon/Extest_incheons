package 구월20일;

public class ex1 {
    public static void main(String[] args) {
        int[][] a ={{1,2},{2,3}};
        int[][] b ={{3,4},{5,6}};
        for(int []e : solution(a,b)){
            for(int s : e ){
                System.out.println(s);
            }
        }
    }
    static int[][] solution(int[][] a, int[][] b) {
        int[][] result = new int[a.length][];
        for (int i = 0; i < a.length; i++) {
            if (a[i].length > 0) {
                result[i] = new int[a[i].length];
                for (int z = 0; z < a[i].length; z++) {
                    result[i][z] =a[i][z] +b[i][z];
                }
            }else {
                result[i][0] = a[i][0]+ b[i][0];
            }
        }
        return result;
    }
}
