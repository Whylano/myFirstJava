public class 행렬의_덧셈 {
    public static void main(String[] args) {
        class Solution {
            //입출력 결과를 보면 이차원 배열이 순서대로 더해져 결과값이 나타나는 규칙을 찾아낼 수 있다.
            // 이 규칙과 중복 for문을 알고 있다면 풀기 쉬운 문제이다
            public int[][] solution(int[][] arr1, int[][] arr2) {
                int[][] answer = new int[arr1.length][arr2.length]; //a:행과 열의 크기가 같으므로 answer의 배열의 크기를
                                                                    // arr1배열의 길이와 arr2배열의 길이로 선언한다.

                for(int i=0;i<arr1.length;i++){ //b: for문을 이용하여 행렬의 행 만큼 반복한다.
                    for(int j =0;j<arr1[i].length;j++){ //c: 이차원 배열이기 때문에 또 한번의 for문을 이용하여 열만큼 반복한다.
                        answer[i][j] = arr1[i][j]+arr2[i][j]; //d: arr1,arr2행렬의 index의 값을 더해 answer 행렬의 index에 넣어준다.
                    }
                }
                return answer;
            }
        }
    }
}
/* 또 다른 사람의 풀이
class Solution{
    public int[][] solution(int[][]arr1.int[][]arr2){
    int[][] answer = [];
    answer = arr1;
    for(int i =0; i<arr1.length;i++){
        for(int j=0;j<arr1[0].length;j++){
        answer[i][j] += arr2[i][j];
        }
    }
    return answer; //
    }
}
 */
/* 또 다른 사람의 Solution
class Solution {
  public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] arr = new int[arr1.length][arr1[0].length]; // 1.두 행렬은 행과 열의 크기가 같음으로 임의로 한 배열의 크기로 배열을 선언한다
		for(int i=0; i<arr1.length; i++) { // 2. 행렬의 행 만큼 반복한다.
			for(int j=0; j<arr1[0].length; j++) { // 3. 행렬의 열 만큼 반복한다.
				arr[i][j] = arr1[i][j] + arr2[i][j]; // 4.각 행렬의 index의 값을 더해 새로운 행렬의 index에 더한다.
			}
		}
		return arr;
	}
}
 */