import  java.util.*;
public class Main {
        public int solution(int[] arr1) {
            int sum = 0;

            for (int i : arr1) {

                sum++ = i;
            }
                    return sum  ;

        }

        public static void main(String[] args) {
            Main method = new Main();
            int[] arr1 = {1,3,5,9,2,4,8,0};
            System.out.println(method.solution(arr1));
        }
    }

