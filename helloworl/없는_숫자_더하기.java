public class 없는_숫자_더하기 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] numbers) {
                int sum = 45;                   //sum 함수에0~9까지를 더합니다.
                for (int i : numbers) {         //i를 numbers 숫자들의 배열에 없는 값을 확인합니다
                    sum -= i;                   //확인한 배열값을 sum에서 빼버립니다
                }
                return sum;                     //합계값을 돌려받습니다.
            }
        }
    }
}

