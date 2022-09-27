public class 자릿수_더하기 {
        public class Solution {
            public int solution(int n) {
                int answer = 0;

                while (n > 0) {
                    answer += n % 10;
                    n /= 10;
                }
                return answer;
            }
        }
    }
//import java.util.*;
//
//public class Solution {
//    public int solution(int n) {
//        int answer = 0;
//                while (n > 0) {
//                    answer += n % 10;
//                    n /= 10;
//                };
//
//        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//        System.out.println("Hello Java");
//
//        return answer;
//    }
//}

/* second solution

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}
 */
