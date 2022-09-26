public class 문자열을_정수로_바꾸기 {
    public static void main(String[] args) {
        class Solution {

            public int solution(String s) {  //문자열 s를 바꿔줍니다.
                int answer = 0;     //초기값을 0으로 해놓고 answer에 문자형 숫자를 입력할 것입니다
                return answer = Integer.parseInt(s);    //Integer 클래스는 원시적 형 (primitive type) int의 값을 객체에 wrap합니다)
                                                        //integer 유형의 오브젝트에는 유형이 int인 단일 필드가 들어가 있습니다.
                                                        //parselnt의 기능은 integer클래스에서 가장 많이 쓰이는 메소드로 String 타입의 숫자를
                                                        //int 타입으로 변환해주는 녀석입니다.

            }
        }
        System.out.println("-1234");
    }
}
