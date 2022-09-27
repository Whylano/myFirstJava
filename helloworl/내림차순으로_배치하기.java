import java.util.*;
public class 내림차순으로_배치하기 {
    public static void main(String[] args){


        class Solution {
            public long solution(long n) {
                String[] list = String.valueOf(n).split("");
                Arrays.sort(list);

                StringBuilder sb = new StringBuilder();
                for (String aList : list) sb.append(aList);

                return Long.parseLong(sb.reverse().toString());
            }
        }

    }
}
//다른 사람 풀이

//class Solution {
//    public long solution(long n) {
//        String answer = "";
//        String str = Long.toString(n);
//
//        int[] arr = new int[str.length()];
//
//        //long타입의 숫자를 Int배열로 올긴다.
//        for(int i = 0; i < str.length(); i++) {
//            String s = str.substring(i, i+1);
//            arr[i] = Integer.parseInt(s);
//        }
//
//        //내림차순 정렬
//        for(int j = 0; j < str.length()-1; j++){
//            for(int i = 0; i < str.length()-1; i++) {
//                if (arr[i] < arr[i+1]) {
//                    int tmp = arr[i+1];
//                    arr[i+1] = arr[i];
//                    arr[i] = tmp;
//                }
//            }
//        }
//
//        for(int i = 0; i < str.length(); i++){
//            answer += arr[i];
//        }
//
//        return Long.parseLong(answer);
//    }
//}


//best solution
//public class ReverseInt {
//    String res = "";
//    public int reverseInt(int n){
//        res = "";
//        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
//        return Integer.parseInt(res);
//    }
//
//    // 아래는 테스트로 출력해 보기 위한 코드입니다.
//    public static void  main(String[] args){
//        ReverseInt ri = new ReverseInt();
//        System.out.println(ri.reverseInt(118372));
//    }
//}
