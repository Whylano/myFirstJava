public class 음양_더하기 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] absolutes, boolean[] signs) { //solution이라는 배열함수에서 int형 absolutes함수를 열에 넣을 거고
                                                                    //boolean타입은 값에는 참/거짓만 넣을 수있는 기능으로 sign이라는 함수를 대입할 것입니다.
                int answer = 0;                                     //answer는 0입니다

                for (int i = 0; i < signs.length; i++) {            //for문으로 반복하며signs의 길이만큼 반복해줄 껍니다
                    if (signs[i]) {                                 //sign[i]가 참이면
                        answer += absolutes[i];                     //absolutes[i]의 실제 정수가 양수임을
                    } else {                                        //아니라면
                        answer -= absolutes[i];                     //absolutes[i]의 실제 정수가 음수임을
                    }
                }
                return answer;                                      //의미합니다.

            }

        }
    }
}