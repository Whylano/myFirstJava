public class MyClassExam {
    public static void main(String[] args){
        MyClass myClass = new MyClass();
        myClass.method1();
        myClass.method2(10);
        int value = myClass.method3();
        System.out.println("m3이 리턴한 값"+value);
        myClass.method4(5,10);
        int value2 = myClass.method5(55);
        System.out.println("m5가 리턴한 값 : "+value2);
    }
}
