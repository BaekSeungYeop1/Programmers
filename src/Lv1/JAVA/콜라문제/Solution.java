package Lv1.JAVA.콜라문제;

public class Solution {


    /*
     * n = 20, a = 2, b = 1
     * 20 -> 10
     * 10 -> 5
     * 5 -> 2 + 1
     * 2 -> 1 + 1
     */

    /*
     * n = 20, a = 3, b = 1
     * 20 -> 6 + 2
     * 8 -> 2 + 2
     * 4 -> 1 + 1
     * 2 ->
     */
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n>=a){

            answer += (b * (n / a));
            n = ((b * (n / a)) + (n % a));
        }
        return answer;
    }

}
