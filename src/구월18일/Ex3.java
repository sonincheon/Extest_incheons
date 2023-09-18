package 구월18일;

public class Ex3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};
        int result =solution1(arr);
        System.out.println(result);
    }
    public static boolean istrue(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[0] != arr[i]) {
                return false;
            }
        }
        return true;
    }
    public static int solution1(int[] arr) {
        int answer = 0;
        while (istrue(arr)) {
            for (int i = 0; i <= arr.length; i++) {
                if (arr[i] > 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = (arr[i] * 2) + 1;
                }
            }
            answer++;
        }
        return answer;
    }
}