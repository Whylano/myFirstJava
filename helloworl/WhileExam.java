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
