import java.util.Scanner;

public class 가운데글자_가져오기 {
    public static void main(String[] args) {
        class Solution {
            public String solution(String s) {
                String answer = "";
                int num = s.length();
                int num1 = num / 2;

                if (num %2== 0) {
                    answer = s.substring(num1-1,num1+1);
                } else {
                    answer = s.substring(num1);
                }
                return answer;
            }
        }
    }
}

//1. 단어의 길이를 지정할 객체를 int num 함수에 저장합니다
// 2. 단어의 중간 부분을 지정할 객체를 생성하고 int 함수에 저장합니다.
//3. if구문을 사용해 홀/짝으로 구분하고 출력결과를 수정합니다.
//4. 이때 s.substring 메소드를 활용해 시작값과 끝값을 정해줍니다.
