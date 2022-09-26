//for 구문 자체에 변수 초기화, 조건식, 증감식이 한줄로 표현된다
public class ForExam {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 100; i++) {    //1~100까지 합을 담을수 있다
//            if (i % 2 != 0) {               //1. 홀수만 의미한다
//                continue;                   //'continue'라는 문장을 쓰면 위에서 부터 내려와서 윗 문장의 해당하는 값은 넘어간다
//                                            //즉 홀수면 다시 올라가서 for문으로가고 짝수면 i+1씩 누적시킨다
//        }
        total = total + i;          //total의 값이 누적될수있게 한다
        if (i == 50) {              //2. 만약 i가 50이 되면
            break;                  //구문을 빠져나오게 하는 'Break'구문이다
        }
    }
            System.out.println(total);      //누적된 값을 출력해라
    }
}
//for문
//        for 문
//        for반복문은 변수초기화, 조건식, 증감식이 한줄에 모두 있다.
//        초기화식은 최초 한 번만 수행합니다.
//        조건식을 수행해서 수행결과가 false라면 for 반복문을 빠져 나갑니다.
//        수행 결과가 true라면 실행문을 수행한다.
//        증감식을 수행한다.
//        2번부터 4번까지 반복적으로 수행한다.
//        for(초기화식; 조건식; 증감식){
//        실행문;
//        실행문;
//        }
//        for문을 이용하여 1부터 100까지의 합을 구하는 프로그램
//        int total = 0; //1부터 100까지 합한 결과값을 담기위한 변수 선언
//
//        for(int i = 1; i <= 100; i++){ //1부터 100까지 반복하기 위한 for 반복문
//
//        total = total + i; // 1부터 100까지 반복해서 total 변수에 값을 누적
//        }
//        System.out.println(total);  //결과값 출력
//        for문을 이용하여 1부터 100까지의 짝수의 합을 구하는 프로그램
//public class ForExam {
//
//    public static void main(String[] args) {
//        int total = 0;
//        for(int i = 1; i <= 100; i++){
//            if(i % 2 != 0){  // 2로 나눈 나머지가 0이 아니라는것은 홀수를 의미한다.
//                continue; // 홀수일 경우 total = total + i; 문장이 실행되지 않으므로, 결과적으로 짝수만 더해준다.
//            }
//            total = total + i;
//        }
//        System.out.println(total);
//    }
//
//}