import java.util.Scanner;

public class 핸드폰_번호_가리기 {
    public static void main(String[] args) {
/*문제        class Solution {
            public String solution(String phone_number) {
                String answer = "";
                return answer;*/
        class Solution {
            public String solution(String phone_number) {
                String answer = "";

                for (int i = 0; i < phone_number.length(); i++) { //a.for문을 이용해 phone_number의 길이만큼 반복한다.
                    if (i < phone_number.length() - 4)              //b.if문을 이용해 i가 phone_number의 길이에서 -4를 뺀 수보다 작을때까지
                        answer += "*";                             //answer변수에 *을 넣어준다.
                    else
                        answer += phone_number.charAt(i);           //d.위 조건이 아니라면.charAt()메소드를 통해 문자를 하나씩 순서대로 넣어준다.
                    //charAt()메소드는 문자열에서 특정 위치의 문자가 무엇인지 알려준다.
                }
                return answer;

            }
        }


    }
}
/* 다른사람 풀이
    class Solution{
    public String solution(String phone_number){
    char[] ch = phone_number.toCharArray(); // toCharArray()메소드는 문자열을 char형 배열로 바꿔준다. 반환되는 배열의 길이는 문자열의 길이와 같다
    for(int i= 0; i<ch.length -4; i++){
    ch[i] = "*"
   }
   return String.valueOf(ch);
   }
 }
 */

