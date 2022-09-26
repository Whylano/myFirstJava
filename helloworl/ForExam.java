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
