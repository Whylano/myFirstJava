public class SwitchExam {
        public static void main(String[] args){
            //switch, vase, default, break

            int value =2;

            switch (value){
                case 1:
                    System.out.println("1");
                    break;

                case 2:
                    System.out.println("2");
                    break;

                case 3:
                    System.out.println("3");
                    break;

                default:
                    System.out.println("그 외 다른 숫자");
            }

// 해당되는 케이스만 쓰고 싶을때는 break를 사용
// 모든 케이스를 출력하고 싶을때는 break를 빼면됨
            String str = "A";
            switch (str){
                case "A":
                    System.out.println("A");
                    break;
                case "B":
// 수일치 다음에 나오는 값이 문자열(str)도 가능함
            }
        }
}
