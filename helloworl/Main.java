import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public String solution(int n){
        String answer = String.valueOf(n);
        char[] a = answer.toCharArray();
        int[] b = new int[answer.length()];
        for(int i=answer.length()-1;i>=0;i--) {

            b[answer.length()-1-i] = answer.charAt(i)-'0';
        }

        return answer;
    }
    public static void main(String[] arg){
        Main method =new Main();
        System.out.println(method.solution(718253));
    }
}

