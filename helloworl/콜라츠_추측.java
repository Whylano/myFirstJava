public class 콜라츠_추측 {
    public static void main(String[] args) {
        class Solution {
            public int solution(long num) {
                int answer = 0;

                while (num != 1) {
                    if (num % 2 == 0) {
                        num /= 2;
                    } else {
                        num = 3 * num + 1;
                    }

                    answer++;
                    if (answer == 500) {
                        answer = -1;
                        break;
                    }
                }

                return answer;
            }
        }
    }
}
//class Collatz {
//    public int collatz(int num) {
//    long n = (long)num;
//    for(int i =0; i<500; i++){
//      if(n==1) return i;
//      n = (n%2==0) ? n/2 : n*3+1;
//    }
//    return -1;
//  }
//    // 아래는 테스트로 출력해 보기 위한 코드입니다.
//    public static void main(String[] args) {
//        Collatz c = new Collatz();
//        int ex = 6;
//        System.out.println(c.collatz(ex));
//    }
//}