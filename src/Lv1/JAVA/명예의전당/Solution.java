package Lv1.JAVA.명예의전당;

import java.util.ArrayList;
import java.util.Collections;

/*
 * k = 상위 k번째
 * score = 점수
 * 10 100 20 150 1 100 200
 * 1 : 10
 * 2 : 100 10
 * 3 : 100 20 10
 * 4 : 150 100 20
 * 5 : 150 100 20
 * 6 : 150 100 100
 * 7 : 200 150 100
 *
 *
 */
public class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> sc = new ArrayList<>();

        for (int i = 0; i< score.length; i++){
            // 상
            if (i<k-1){
                sc.add(score[i]);
                sc.sort(Collections.reverseOrder());
                answer[i] = sc.get(sc.size()-1);
            }
            else if (i>=k-1){
                sc.add(score[i]);
                sc.sort(Collections.reverseOrder());
                answer[i] = sc.get(k-1);
            }
        }

        return answer;
    }
}
