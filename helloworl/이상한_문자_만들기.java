import java.util.Scanner;

public class 이상한_문자_만들기 {
    class Solution {
        public String solution(String s) {

            String[] a = s.split("\\s", -1); //1.split을 이용해서 전체 문자열s를 띄어쓰기를 기준으로 나누어 배열 a에 대입
                                                        //2. 그럼 이제 a =["try","hello","world"]
            String[] c = {};
            StringBuffer b = new StringBuffer();
            for (int i = 0; i < a.length; i++) {        //3.a의 길이만큼 반복하면서 배열 c에 a[i]번째를 split해서 대입 c=["t","r","y"]
                c = a[i].split("");

                for (int j = 0; j < c.length; j++) {
                    if (j % 2 == 0 || j == 0) {         //4.또 하나의 반복문을 돌리는데 이번에는 c의 길이만큼 반복하면서 j의 값이 짝수이거나 0일때
                        b.append(c[j].toUpperCase());   //5.toUpperCase()를 통해 대문자로
                    } else {
                        b.append(c[j].toLowerCase());   //6. toLowerCase()로 소문자로 변경하여
                    }
                }
                if (i < a.length - 1) {
                    b.append(" ");                      //7.StringBuffer인 b에 append해준다
                }
            }

            String answer = String.valueOf(b);          //8.마지막에 String.valueOf()로 b를 형변환 해준후 return!
            return answer;
        }
    }
}//split(-1):공백을 제거하기 위한것


//다른 풀이
// class Solution {
//  public String solution(String s) {
//        char[] chars = s.toCharArray();
//        int idx = 0;
//
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == ' '){
//                idx = 0;
//            }else{
//                chars[i] = (idx++ % 2 == 0 ? Character.toUpperCase(chars[i]) : Character.toLowerCase(chars[i]));
//        }
//
//        return String.valueOf(chars);
//  }
//}
//String.toCharArray()
//- 문자열을 한 글자씩 쪼개서 char타입의 배열에 넣어주는 메서드
//toCharArray()메서드를 이용해서 문자열 s를 쪼개 담았다.
//chars의 길이만큼 반복문을 돌면서 만약 chars[i]번째가 공백이라면 idx에 0을 대입하고 아니라면 삼항연산자를 이용해서 chars[i]에 대입
//마지막에 String.valueOf이용해서 String으로 만들어서 return!
//

//best Solution
//class Solution {
//  public String solution(String s) {
//
//        String answer = "";
//        int cnt = 0;
//        String[] array = s.split("");
//
//        for(String ss : array) {
//            cnt = ss.contains(" ") ? 0 : cnt + 1;
//            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
//        }
//      return answer;
//  }
//}