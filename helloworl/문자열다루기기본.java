public class 문자열다루기기본 {
    public static void main(String []args){
        class Solution {
            public boolean solution(String s){
//문제             public boolean solution(String s) {
//                boolean answer = true;
//                return answer;
            if(s.length()==4||s.length()==6){   //만약 입력받은 문자열 s의 길이가 4 또는 6이라는 조건이라면 다음라인 실행
                try{                            //9~13번라인: Interger.parselnt()메서드를 활용하면 문자열을 정수로 변환할 수 있다.
                int x = Integer.parseInt(s);    //하지만 문자열에 숫자가 아닌 문자가 들어가 있으면 NumberFormatException 에러가 발생한다.
                return true;
                } catch (NumberFormatException e){//그래서try-catch절을 사용하여 에러가 나면 리턴값을 false로 선언해주었다.
                    return  false;
                }
            }else                               //8번라인의 조건이 아니라면
                return false;                   //16번 라인을 실행한다.
            }
        }
    }
}
/*다른 사람 풀이 자바의 정규식인matches()메서드로 풀이가 가능한게 놀라운 구현이다
//String.matches()란 특정한 패턴의 문자열을 포함하는지 확인할 수 있는 메서드이다. 특정패턴이란 *정규표현식(Regex)을 의미한다.
//문자열에 정규표현식이 일치하는지를 boolean값으로 리턴한다.이를 통해 문자열이 내가 찾는 패턴으로 구성되어 있는지 알 수 있다.
//참고자료 : https://coding-factory.tistory.com/529
import java.util.*;
    class Solution{
        public boolen solution(Strings){
        if(s.length() ==4 || s.length()==6) return s.matches("(^[0-9]*$)");
    return false;
    }
}
 */
