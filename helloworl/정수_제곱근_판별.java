import java.util.*;
public class 정수_제곱근_판별 {
    public static void main(String[] args){

        class Solution {
            public long solution(long n) {
                Double sqrt = Math.sqrt(n);

                if(sqrt == sqrt.intValue()){
                    return (long)Math.pow(sqrt + 1, 2);
                } else return -1;
            }
        }
    }
}
//주어진 숫자가 어떤 양의 정수의 제곱인지 확인하려면 간단히 제곱근 하면 된다.
// 양의 정수의 제곱이면 마찬가지로 양의 정수일것이다.
// 따라서 Math.sqrt()의 리턴 값이 양의 정수인지 확인하면 되겠다.
//
//정수 판별 방법
//  // Double wrapper class에 있는 intValue()로 정수형 숫자로 바꾼다.
//  // 바꾸기 전 숫자와 바꾼 후 숫자가 같으면 정수다.
//  Double sqrt = Math.sqrt(n);
//  if(sqrt == sqrt.intValue())


//best Solution
/*
class Solution {
  public long solution(long n) {
      if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        return -1;
  }
}

 */