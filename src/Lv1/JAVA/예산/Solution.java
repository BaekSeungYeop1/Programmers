package Lv1.JAVA.예산;

import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) {
        int cnt = 0;
        Arrays.sort(d);
        for(int i = 0; i<d.length; i++){
            if(budget<d[i]){
                break;
            }
            budget -= d[i];
            cnt++;
        }
        return cnt;
    }
}
