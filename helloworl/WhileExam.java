public class WhileExam {
    public static void main(String[] args){
//        int i = 0;
//
//        while(i<10){
//            System.out.println(i);
//            i++;//i=i+1;하나씩 증가시킬 것이라는 뜻 ;   값: (0;1;2;3;4;5;6;7;8;9)
//        }
    int total =0;
    int i = 1;
    while(i<=100){
        total = total +i;
        i++;
    };
    System.out.println(total);
    }
}
//    while문
//            반복문
//    반복문은 실행문을 반복적으로 실행해야 할 때 사용 한다.
//        반복문의 종류는 while문, do-while문, for문 이 있다.
//        while문
//        조건문의 실행 결과가 true일 동안 반복해서 실행한다.
//        while(조건문){
//        실행문;
//        }
//        10번 반복하면서 0부터 9까지 출력하는 반복문
//        int i = 0;  //while에서 사용할 변수를 선언
//
//        while(i < 10){
//        System.out.println(i);
//        i++; //조건문을 원하는 만큼만 반복하고 빠져나가기 위한 부분
//        }
//        1부터 100까지의 합을 while문을 이용하여 구현해 보도록 하겠습니다.
//public class WhileExam2 {
//    public static void main(String[] args) {
//        int total = 0; // i의 값을 누적할 변수를 선언합니다.
//        int i = 1;
//        while(i <= 100){
//            total = total + i;
//            i++;
//        }
//    }
//}