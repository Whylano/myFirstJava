import java.util.*;
import java.util.Calendar;

public class Years2016 {
    public static void main(String[] args) {


        class Solution {
            public String solution(int a, int b) {
                String answer = "";

                String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
                Calendar cal = Calendar.getInstance();
                cal.set(Calendar.YEAR, 2016);           //Calendar 정리하기
                cal.set(Calendar.MONTH, a - 1);
                cal.set(Calendar.DAY_OF_MONTH, b);
                answer = week[cal.get(Calendar.DAY_OF_WEEK) - 1];

                return answer;
            }
        }
    }
}
