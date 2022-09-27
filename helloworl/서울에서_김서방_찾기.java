public class 서울에서_김서방_찾기 {
    public static void main(String[] args) {
//문제        class Solution {
//            public String solution(String[] seoul) {
//                String answer = "";
//                return answer;
//            }
//        }
        class Solution {
            public String solution(String[] seoul) {
                String answer = "";
                for (int i = 0; i < seoul.length; i++) {   //입력된 seoul.length에 따라 seoul의 Array에 길이만큼 반복문을 돌려준다
                    if (seoul[i].equals("Kim"))            //만약 seoul의 Array에 값중에"Kim"이라는 문자열과 같은 값이 있다면
                        answer = "김서방은 " + i + "에 있다";//리턴값인 answer는 위와 같이 출력해준다.(여기서i값은 배열의 인덱스 번호)
                }
                return answer;
            }
        }
    }
    //다른 풀이
    // public class FindKim {
    //    public String findKim(String[] seoul){
    //        //x에 김서방의 위치를 저장하세요.
    //        int x = 0;
    //    /*
    //    for(x=0;x<seoul.length;x++) {
    //      if(seoul[x].equals("Kim"))
    //        break;
    //    }
    //    */
    //
    //    for (String name : seoul) {
    //      if(name.equals("Kim"))
    //        break;
    //      x++;
    //    }
    //        return "김서방은 "+ x + "에 있다";
    //    }
}
