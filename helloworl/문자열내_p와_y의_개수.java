public class 문자열내_p와_y의_개수 {
    public static void main(String[] args) {

        class Solution {
            /*문제
            boolean solution(String s) {
                    boolean answer = true;

                    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
                    System.out.println("Hello Java");

                    return answer;
                }
            }
             */
            boolean Solution(String s) {
                int pCnt = 0;   //'P'카운트 수를 담을 변수를 선언해준다
                int yCnt = 0;   //'Y'카운트 수를 담을 변수를 선언해준다

                for (int i = 0; i < s.length(); i++) {                //문자열 S의 길이만큼 반복하면서
                    if (s.charAt(i) == 'p' || s.charAt(i) == 'P')     //만약 문자열 s의 문자 하나씩을 돌리면서 해당 값이 p와 같으면
                        pCnt++;                                       //pCnt변수를 하나씩 올려주고,
                    else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y')//y와 같다면
                        yCnt++;                                       //yCnt변수를 하나씩 올려준다.
                }

                if (pCnt != yCnt) return false;                       //만약 pCnt값과 yCnt값이 같지 않다면리턴 값이 false,
                return true;                                          //그렇지 않은 경우는 true로 반환한다.
            }
        }
    }
}
/*
Best solution -람다식을 이용한 풀이
class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();

        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
}
 */