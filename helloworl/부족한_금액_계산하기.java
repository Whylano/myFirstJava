public class 부족한_금액_계산하기 {
    public static void main(String[] args) {
        class Solution {
            public long solution(int price, int money, int count) {

                long temp = 0;
                for (int i = 1; i <= count; i++) {
                    temp += i * price;
                }

                if (temp > money)
                    return temp - money;

                else return 0;

            }

        }
    }
}

/*best Solution

class Solution {
    public long solution(long price, long money, long count) {
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}
 */
