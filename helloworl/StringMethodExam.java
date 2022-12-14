public class StringMethodExam {
    public static void main(String[] args){
        //String str = new String("hello");
        String str = "hello";
        System.out.println(str.length());           //길이를 구하는 연산자
        System.out.println(str.concat(" world"));//결합 연산자(문자열 붙히기cancat)
        System.out.println(str);//String str(Class)는 불변 클래스로, 메소드가 수행되면, 새로운 문자열을 만든다,따라 원래 클래스는 변하지 않는다
        str = str.concat(" world");
        System.out.println(str);

        System.out.println(str.substring(3,6));//문자열을 자르는 연산자
    }
}
//String클래스의 메소드
//String Class가 제공하는 메소드 이용하기
//문자열 길이 구하기
//str.length()는 str이 참조하는 문자열의 길이를 구해서 int 타입으로 리턴해주는 메소드 이다.
//    System.out.println(str.length());  //str
//문자열 붙히기 (concat)
//str.concat("world") 메소드는 str 이 참조하는 문자열 hello 에다가 메소드의 인자로 들어온 문자열 world 를 붙혀서 String 타입으로 리턴하는 메소드다.
//String Class는 불변 클래스로, 메소드가 수행되면, 새로운 문자열을 만든다. 그러므로, 원래 클래스는 변하지 않는다.
//    String str = new String("hello");
//
//    System.out.println(str.concat(" world"));  //출력결과는 hello world
//    System.out.println(str);  //출력결과는 hello
//문자열 자르기 (subString)
//str.subString(1,3) 은 str이 참조하는 문자열을 인덱스 1번부터 3번까지 자른 결과이다.
//str.subString(2) 은 str이 참조하는 문자열을 2번 인덱스부터 마지막까지 자른 결과를 의미한다.
//문자열의 인덱스는 0번 부터 시작한다.
//    System.out.println(str.substring(1, 3)); //출력결과  el
//    System.out.println(str.substring(2));   //출력결과 llo world
