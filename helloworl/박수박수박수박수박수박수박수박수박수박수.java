public class 박수박수박수박수박수박수박수박수박수박수 {
    public static void main(String[] args) {
        //문제 class Solution {
        //    public String solution(int n) {
        //        String answer = "";
        //        return answer;
        //    }
        //}
        class Solution {
            public String solution(int n) {
                String answer = "";
                for (int i = 0; i < n; i++) {           //n값만큼 반복하면서 돌다가
                    answer += i % 2 == 0 ? "수" : "박";  //?(삼향연산자)를 이용해 i%2가 0일때"수"/아닐때 "박"을 입력해준다
                }
                return answer;
            }
        }
    }
}
