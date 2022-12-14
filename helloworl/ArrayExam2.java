public class ArrayExam2 {
    public static void main(String[]args){
        int[][] array4 = new int[3][4];
        array4[0][1] = 10;

        int[][] array5 = new int[3][];
        array5[0] = new int[1];
        array5[0][0] = 10;

        int[][] array6 = {{1},{1,2},{1,2,3}};

        System.out.println(array6[0][0]);
        System.out.println(array6[2][2]);

    }

}
//2차원배열
//        2차원 배열
//        2차원 배열이란 배열의 배열이다.
//        2차원 배열 생성 방법
//        정수를 4개씩 담을 수 있는 배열이 3개 생성된다.
//        int[][] array4 = new int[3][4];
//        2차원 배열에 값을 저장하는 방법
//        만약 array4[1] = 10 ; 이렇게 사용하면 오류!!
//        array4[1] 은 또 다른 1차원 배열을 가리킬 수 있는 참조형 변수이기 때문에 값을 담을수는 없다.
//        array4[0][0] = 10;
//        가변크기의 2차원 배열을 생성하는 방법
//        int[][] array5 = new int[3][];
//        //위와 같이 선언하면 array5는 3개짜리 배열을 참조한다. 3개짜리 배열은 아직 참조하는 배열이 없다는 것을 의미.
//
//        array5[0] = new int[1]; //정수를 하나 담을 수 있는 배열을 생성해서 array5 의 0 번째 인덱스가 참조한다.
//        array5[1] = new int[2]; //정수를 두개 담을 수 있는 배열을 생성해서 array5 의 1 번째 인덱스가 참조한다.
//        array5[2] = new int[3]; //정수를 세개 담을 수 있는 배열을 생성해서 array5 의 2 번째 인덱스가 참조한다.
//        선언과 동시에 초기화하는 방법
//        int[][] array6 = {{1}, {2,3}, {4,5,6}};
////위와 같이 선언할 경우 array6[0][0] 는 1이다. array6[1][0]은 2이다.