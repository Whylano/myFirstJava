public class 자연수_뒤집어_배열로_만들기 {
    public static void main(String[] args){
        class Solution {
            public int[] solution(long n) {

                long num = n;
                int cnt = 0;

                while(num != 0){
                    num /= 10;
                    cnt++;
                }

                int[] answer = new int[cnt];

                num = n;
                for(int i = 0; num != 0; i++){
                    answer[i] = (int)(num % 10);
                    num /= 10;
                }

                return answer;
            }
        }
    }
}
//문자열 뒤집기
//StringBuilder sb.reverse()
//
//int → String 타입 변환
//String.valueOf(i)

//best_Solution
/*

class Solution {
  public int[] solution(long n) {
      String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt=0;

        while(n>0) {
            answer[cnt]=(int)(n%10);
            n/=10;
            System.out.println(n);
            cnt++;
        }
      return answer;
  }
}
 */