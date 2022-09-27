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

///Best solution
//public class WaterMelon {
//    public String watermelon(int n){
//
//        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
//    }
//
//    // 실행을 위한 테스트코드입니다.
//    public static void  main(String[] args){
//        WaterMelon wm = new WaterMelon();
//        System.out.println("n이 3인 경우: " + wm.watermelon(3));
//        System.out.println("n이 4인 경우: " + wm.watermelon(4));
//    }
//}
