public class 평균_구하기 {
    public static void main(String[] args) {
        class Solution {
            public double solution(int[] arr) {
                int sum = 0;                    //a. 배열의 값을 더할 변수를 선언해준다.
                for (int i = 0; i < arr.length; i++) {//b 반복문을 이용해 배열의 값 하나씩 sum 변수에 더해준다.
                    sum += arr[i];
                }

                double answer = (double) sum / arr.length;  //c sum배열의 길이를 나누어 평균값을 내준다.
                                                            // 여기서 answer타입이 double형이기 때문에 double으로 바꿔준다
                return answer;
            }
        }
    }
}