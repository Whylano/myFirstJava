public class x만큼_간격이_있는 {
    public static void main(String[] args) {
/*문제
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = {};
        return answer;
    }
}
}*/
    class Solution{
        public long[] solution(int x,int n){
            long[] answer = new long[n];    // 1.입력받은 n은 갯수이니 배열의 크기를 정해준다
            for (int i =0;i<n;i++){     //2. for문을 이용하여 배열의 자릿수만큼 반복한다
                                        // (위 코드에서 i<n;의 조건문은 i<answer.length;와 동일하다)
                answer[i]=(long)(i+1)*x;//3. answer배열의 0번 인덱스부터(i+1)*x를 대입해 주면,출력 결과처럼 입력받은 x만큼 증가하여 출력된다.
                ///^여기서 중요한점은(i+1)*x앞에 (long)형으로 형 변환해주어야한다.
                ///형 변환을 하지 않아도 입출력의 예의 값은 나오지만 답안을 제출하게 되면 테스트결과에서 실패가 뜬다
                ///그 이유는 제한 조건을 보면 알 수 있다.x는 -10,000,000이상,10,000,000이하인 정수n은 1,000이하의 자연수이다.

                ///만약 x의 입력값이 10,000,000이고 n의 입력값이 1,000이라고 가정해보자,그럼 최대 출력 값이 10,000,000,000가 된다.
                ///하지만 int형이 표현할 수 ㅇ씨는 숫자는 -2,147,483,648~2,147,483,648이기 때문에 형 변환을 하지 않고 진행한다면 범위를
                ///벗어나게 된다.그래서 long형으로 형 변환이 필요하다.
            }
            return answer;
        }
    }
    }
}
/*다른 사람 풀이
import java.util.*;
class Solution{
    public static long[] solution(int x,int n){
        long[] answer = new long[n];
        answer[0] = x;

        for (int i=1;i < n;i++){
            answer[i]=answer[i-1]+x;
        }
    }
    return answer;
}
 */
/*best solution
import java.util.*;
class Solution {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;

    }
}
*/