package 알고리즘연습240123;

import java.util.Arrays;

public class ex2 {
        public static void main(String[] args) {
            int n1 = 4;
            int n2 = 5;
            int n3 = 6;

            System.out.println(Arrays.toString(solution(n1)));  // [1,2,9,3,10,8,4,5,6,7]
            System.out.println(Arrays.toString(solution(n2)));  // [1,2,12,3,13,11,4,14,15,10,5,6,7,8,9]
            System.out.println(Arrays.toString(solution(n3)));  // [1,2,15,3,16,14,4,17,21,13,5,18,19,20,12,6,7,8,9,10,11]
        }
        public static int[] solution(int n) {
            int[][] triangle = new int[n][];
            for (int i = 0; i < n; i++) {
                triangle[i] = new int[i + 1];
            }

            int value = 1;
            int row = 0, col = 0;
            // 달팽이 채우기
            for (int i = n; i > 0; i -= 3) {
                // 아래로 이동
                for (int j = 0; j < i; j++) {
                    triangle[row++][col] = value++;
                }
                row--;
                col++;
                // 오른쪽으로 이동
                for (int j = 0; j < i - 1; j++) {
                    triangle[row][col++] = value++;
                }
                row--;
                col -= 2;
                // 대각선으로 이동
                for (int j = 0; j < i - 2; j++) {
                    triangle[row--][col--] = value++;
                }
                row += 2;
                col++;
            }
            // 2차원 배열을 1차원 배열로 변환
            int[] result = new int[value - 1];
            int idx = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    result[idx++] = triangle[i][j];
                }
            }
            return result;
        }
}
