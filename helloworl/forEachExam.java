public class forEachExam {
    public static void main(String[] args){

        int[] iarr ={10,20,30,40,50};

        for(int i =0;i< iarr.length; i++){  //일반적인 for array 참조문
            int value = iarr[i];
            System.out.println(value);
        }
        //훨씬 간결한 for each문
        for(int value:iarr){   //for each문(타입 값을 받아줄 변수명:출력하고 싶은 자료구조)
            System.out.println(value);
        }
    }
}
//for each ,for문
//  int[] iarr = {10,20,30,40,50};
//
//    for(int value:iarr){
//        System.out.println(value);
//    }
