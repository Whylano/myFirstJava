import java.util.Scanner;

//do while문 while 문의 경우 조건이 만족되지 않을 때 실행되지 않지만
//do while문은 무조건 한번은 수행된다.
public class Do_while {
    public static void main(String[]arg){
        int value = 0;
        Scanner scan = new Scanner(System.in);

        do{
            value = scan.nextInt();
            System.out.println("입력받은 값:"+value);
            //반복할 문장들(즉, 한번은 입력받는 구문을 만들어줄때 쓰는 구문입니다.)
        }while (value !=10);
        System.out.println("반복은 종료!!");
    }
}
