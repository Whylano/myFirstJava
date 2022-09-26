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
/* best solution
import java.util.*;

class TryHelloWorld
{
    public String getDayName(int month, int day)
    {
        Calendar cal = new Calendar.Builder().setCalendarType("iso8601")
                        .setDate(2016, month - 1, day).build();
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();
    }
    public static void main(String[] args)
    {
        TryHelloWorld test = new TryHelloWorld();
        int a=5, b=24;
        System.out.println(test.getDayName(a,b));
    }
}
 */
