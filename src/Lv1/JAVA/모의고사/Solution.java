package Lv1.JAVA.모의고사;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int[] answers) {

        int[] man1 = {1,2,3,4,5};
        int[] man2 = {2,1,2,3,2,4,2,4};
        int[] man3 = {3,3,1,1,2,2,4,4,5,5};
        int[] cnt = {0,0,0};
        for (int i=0; i<answers.length; i++){
            if (answers[i] == man1[i%man1.length]){
                cnt[0]++;
            }
            if (answers[i] == man2[i% man2.length]){
                cnt[1]++;
            }
            if (answers[i] == man3[i% man3.length]){
                cnt[2]++;
            }
        }

        int max = Math.max(cnt[0],Math.max(cnt[1],cnt[2]));

        ArrayList<Integer> list = new ArrayList<>();
        if (max == cnt[0]){
            list.add(1);
        }
        if (max == cnt[1]){
            list.add(2);
        }
        if (max == cnt[2]){
            list.add(3);
        }

        int[] answer = new int[list.size()];
        for (int i =0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
