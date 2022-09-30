public class MyClass {

    //public 리턴타입 메소드명(매개변수 등){ 구현 }

        public void method1(){
            System.out.println("method1이 실행됩니다.");
        }
        //매개변수도 없고 리턴하는 것도 없는 형태의 메소드
    //리턴하는 것이 없을 경우 void라고 작성합니다.


    public void method2(int x){
        System.out.println(x + " 를 이용하는 method2입니다.");
    }
    //정수를 받아들인 후, 리턴하지 않는 메소드
    //받아들이는 값은 어떤 타입이라도 상관없다.
    //받아 들이는 값의 수는 여러개 일 수 있다. 여러개을 경우 콤마(,)로 구분한다.

    public int method3(){
        System.out.println("method3이 실행됩니다.");

        return 10;
        //콘솔에 'method3이 실행됩니다.' 를 출력하고, 이 메소드를 호출한 쪽에 10을 리턴한다.
    }
    //이번엔 정수를 받아들인 후, 리턴하지 않는 메소드입니다. 이것을 클래스에서 작성하면 다음과 같습니다.
    //아무것도 받아들이지 않고, 정수를 반환하는 메소드
    //리턴하는 값 앞에 return 이라는 키워드를 사용한다.
    //메소드 이름 앞에는 리턴하는 타입을 적어준다.
    //리턴타입은 하나만 사용할 수 있다. 리턴하는 타입은 어떤 타입이라도 상관없다.

    public void method4(int x, int y){
        System.out.println(x + y + " 를 이용하는 method4입니다.");
    }
    //정수를 2개 매개변수로 받고, 아무것도 반환하지 않는 메소드

    public int method5(int y){
        System.out.println(y + " 를 이용하는 method5입니다.");
        return y*2;
        //정수를 한개 받아들인 후, 정수를 반환하는 메소드
    }
}
