import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 나누어_떨어지는_숫자_배열 {
    public static void main(String[] args) {

//문제를 보고 든 생각엔 for문을 이용해 배열의 있는 값을 하나씩 divisor 값으로 나누어 떨어지는 값만 다시 배열에 담고 조건을 이용해서 풀면 된다.

        class Solution {
            public int[] solution(int[] arr, int divisor) {
                ArrayList<Integer> list = new ArrayList<Integer>(); // 전달 받은 배열을 반복적으로 돌면서 값을 담아줄 ArrayList를 선언하고

                for (int i = 0; i < arr.length; i++) { //배열의 길이동안 반복하면서
                    if (arr[i] % divisor == 0) {       //배열의 값이 전달받은 sivisro 갑승로 나눈 값이 0이라면 즉, 나누어 떨어진다면 list에 값을 추가해주고 그렇지 않으면 다시 반복ㅇ문dmf ehfdkwnsek
                        list.add(arr[i]);               //
                    } else {                            //
                        continue;                       //
                    }                                   //
                }
                Collections.sort(list);//Collections.sort()메소드를 이용해 오름차순 정렬을 해준다
                int[] answer = new int[list.size()]; // 값을 리턴할 배열을 선언한 후 배열의 사이즈를 list의 사이즈로 선언한다

                if (list.size() == 0) { //만약 list의 길이가0이라면answer의 배열의 사이즈를 1로 선언하고 인덱스0번자리에 -1을 적용하고 그렇지 않으면answer배열에 하나씩 넣어준다. r그리고 그 asnwer의 값을 리턴한다
                    answer = new int[1];
                    answer[0] = -1;
                } else {
                    for (int i = 0; i < list.size(); i++) {
                        answer[i] = list.get(i);
                    }
                }
                return answer;
            }
        }
    }
}
/*
import java.util.Arrays;

class Divisible {
    public int[] divisible(int[] array, int divisor) {
        //ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
        return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Divisible div = new Divisible();
        int[] array = {5, 9, 7, 10};
        System.out.println( Arrays.toString( div.divisible(array, 5) ));
    }
}
 */