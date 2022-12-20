package Lv1.JAVA.과일장수;

import java.util.Arrays;
import java.util.Stack;

public class Solution {

    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Stack<Integer> apple = new Stack<>();

        Arrays.sort(score);

        for (int i=0; i<score.length; i++){
            apple.push(score[i]);
        }

        while (apple.size()>=m){

            for (int i = 0; i<m; i++){
                if (i == (m-1)){
                    answer += apple.pop() * m;
                }else {
                    apple.pop();
                }
            }
        }

        return answer;
    }

    /*
     * 다른 사람 풀이
     */
    public int solution2(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for(int i = score.length; i >= m; i -= m){
            answer += score[i - m] * m;
        }

        return answer;
    }

}
