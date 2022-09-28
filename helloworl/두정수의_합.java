public class 두정수의_합 {
    class Solution {
        public long solution(int a, int b) {
            long answer = 0;
            if(a<=b){
                for(int i=a;i<=b;i++){
                    answer+=i;}
                }else{
                    for(int i=b;i<=a;i++){
                        answer+=i;
                }
            }
            return answer;
        }
    }
}

//등차수열의 합 공식
/*
class Solution {

    public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}

 */
