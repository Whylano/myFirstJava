public class OperatorExam3 {
        public static void main(String[] args){
            int a=5;
            int b =10;
            int c =15;

            System.out.println((a-b)*c);  //(a-b*c)는 b*c가 먼저 계산되고 다음 a-b*c가 되는것을 유의해야함

            System.out.println(a>5 && b>5);//a>5크냐? (비교연산자) &&(논리연산자) 연산자의 순서를 알아보자
                                            // 계산순서
                                            // 1. a>5
                                            // 2. b>5
                                            // 3. &&
            System.out.println(++a-5); //(++a)에 a는 1
            System.out.println(a); //(단항연산자일때 증가전이 우선순위다)(a++)는 0

        }
}

//학습자료
//     연산자우선순위
//        연산자 우선순위
//        최우선연산자 ( ., [], () )
//
//        단항연산자 ( ++,--,!,~,+/-   : 부정, bit변환>부호>증감)
//
//        산술연산자 ( *,/,%,+,-,shift) < 시프트연산자 ( >>,<<,>>> ) >
//
//        비교연산자 ( >,<,>=,<=,==,!= )
//
//        비트연산자 ( &,|,,~ )
//
//        논리연산자 (&& , || , !)
//
//        삼항연산자 (조건식) ? :
//
//        대입연산자 =,*=,/=,%=,+=,-=
//
//
//        int a = 5;
//        int b = 10;
//        int c = 5
//        System.out.println(  a - b * c );
//        //결과는 -45가 나오게 됩니다
//
//        곱셈이 우선순위가 높기 때문에 b와c를 먼저 곱한다. 그런 다음 a에서 b와 c를 곱한 값을 뺀다.
//
//        비교연산자가 논리 연산자 보다 우선순위가 높다.
//
//        단 증감 연산자일 경우에 전위 연산자인지 후위 연산자 인지에 따라서 우선 순위가 바뀔 수 있다.
//
//
//        int a = 5;
//        System.out.println(++a - 5);
//        //결과는 1
//        단항 연산자이면서, 전위 연산자인 ++ 가 먼저 연산된다. a가 6으로 바뀐 후 5 를 빼게 되므로 결과는 1
//
//        int a = 5;
//        System.out.println(a++ - 5);
//        //결과는 0
//        System.out.println(a);
//        //결과는 6
//        단항 연산자이면서, 후위 연산자인 ++ 가 나중에 연산된다. a가 5인 상태에서 5를 뺀 후에 a++(a=a+1) 이 실행되므로 출력결과는 0
//        논리연산자 중 and 연산과 or 연산이 나왔을 경우 and 연산이 먼저 수행 됩니다.
