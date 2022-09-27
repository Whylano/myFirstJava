import java.io.IOException;
public class 하샤드_수 {
    public static void main(String []args){
        class Solution {
            public boolean solution (int x) throws IOException {
                int sum = 0;
                int a = x;

                while (a >= 1) {
                    sum += a % 10;
                    a /= 10;
                }

                if (x % sum == 0) {
                    return true;
                } else
                    return false;
            }
        }
    }
}
/*
첫 번째 예제의 경우 10의 자릿수의 합은 ( 1 + 0 ) = 1,
        10 % 1 == 0 이므로 하샤드 수입니다. ( **return true** )
        두 번째 예제의 경우 12의 자릿수의 합은 ( 1 + 2 ) = 3,
        12 % 3 == 0 이므로 하샤드 수입니다. ( **return true** )
        세 번째 예제의 경우 11의 자릿수의 합은 ( 1 + 1 ) = 2,
        11 % 2 == 1 이므로 하샤드 수가 아닙니다. ( **return false** )
        네 번째 예제의 경우 13의 자릿수의 합은 ( 1 + 3 ) = 4,
        13 % 4 == 1 이므로 하샤드 수가 아닙니다. ( **return false** )
        먼저 각 자릿수의 합을 구해주기 위하여 while문을 이용하였습니다.
        초기 숫자 x를 저장하고 있는 a변수를 이용하였습니다.
        자릿수의 합을 저장해둘 변수 sum을 만들어주었습니다.
        while문 안에서, sum에 현재 a의 일의 자리를 더해주고 ( sum += a % 10 )
        a 를 10으로 나누어주었습니다.
        while문을 빠져나오고 나서 x(초기 입력으로 주어진 수)를 sum으로 나누어
        나머지가 0이면 true를 반환하고 아닐 경우 false를 반환하도록 해주었습니다.

// 문제가 개편되었습니다. 이로 인해 함수 구성이나 테스트케이스가 변경되어, 과거의 코드는 동작하지 않을 수 있습니다.
// 새로운 함수 구성을 적용하려면 [코드 초기화] 버튼을 누르세요. 단, [코드 초기화] 버튼을 누르면 작성 중인 코드는 사라집니다.
public class HarshadNumber{
    public boolean isHarshad(int num){

    String[] temp = String.valueOf(num).split("");

    int sum = 0;
    for (String s : temp) {
        sum += Integer.parseInt(s);
    }

    if (num % sum == 0) {
            return true;
    } else {
      return false;
    }
    }

       // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        HarshadNumber sn = new HarshadNumber();
        System.out.println(sn.isHarshad(18));
    }
}*/