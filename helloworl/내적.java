public class 내적 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] a, int[] b) {
/*문제                int answer = 123456789;
                return answer*/
//정답 풀이 //a,b배열의 동일한 인덱스의 요소를 더하고 그 값들을 더해준다.
                int answer = 0;

                for (int i = 0; i < a.length; i++) {
                    answer += a[i] * b[i];
                }
                return answer;

            }
        }
    }
}
/*best solution
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
    }
 */