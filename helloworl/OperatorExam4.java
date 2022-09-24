//내가 정리한 내용
public class OperatorExam4 {
        public static   void main(String[] args){
            int i =10;
            int j =10;

            //대입연산자
            System.out.println(i == j);
            System.out.println(i!=j);
            System.out.println(i<j);
            System.out.println(i<=j);
            System.out.println(i>j);
            System.out.println(i>=j);
            //복합대입연산자
            i+=10; //i = i+10;

            System.out.println(i); //20

            System.out.println(i-=5); //15
        }
}
//수업자료
//비교연산자
//        == , != , < , > , <= , >=
//        비교 연산자의 결과는 boolean이다.
//
//        int i = 10; // = 대입연산자
//        int j = 10;
//
//        // i 와 j 가 같은지 비교 하는 비교 연산자
//        System.out.println(i == j )
//        System.out.println(i == j )
//        System.out.println(i != j );
//        System.out.println(i < j);
//        System.out.println( i <= j);
//        System.out.println(i > j);
//        System.out.println(i >= j);
//
//        단순 대입 연산자
//
//        i = 10
//        오른쪽에 있는 피연산자의 값을 왼쪽 피연산자의 변수에 저장
//        복합 대입 연산자
//
//        정해진 연산을 수행한 후에 결과를 대입
//
//        i += 10; // i = i + 10;  과 같은 의미
//
//        System.out.println(i);
//        System.out.println(i -=5);
//        System.out.println(i);
