package 알고리즘연습240226;

public class ex17 {
        public String solution(String rsp) {
            StringBuilder result = new StringBuilder();

            for (char move : rsp.toCharArray()) {
                switch (move) {
                    case '2':  // 가위
                        result.append('0');  // 바위를 이김
                        break;
                    case '0':  // 바위
                        result.append('5');  // 보를 이김
                        break;
                    case '5':  // 보
                        result.append('2');  // 가위를 이김
                        break;
                }
            }

            return result.toString();
        }
}
