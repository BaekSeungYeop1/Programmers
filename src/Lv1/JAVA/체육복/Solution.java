package Lv1.JAVA.체육복;

import java.util.Arrays;

public class Solution {
    /*
     * 전체 학생의 수는 2명 이상 30명 이하입니다.
     * 체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
     * 여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
     * 여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
     * 여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
     */

    /*
     * n = 5, lost = [2,4], reserve = [1,3,5], return = 5
     * n = 5, lost = [2,4], reserve = [3], return = 4
     * n = 3, lost = [1], reserve = [2], return = 2
     */
    public int solution(int n, int[] lost, int[] reserve) {

        Arrays.sort(lost);
        Arrays.sort(reserve);
        int answer = n - lost.length;

        // 여벌이 있는 학생이 체육복을 도난당한 경우
        for (int i = 0; i< lost.length; i++ ){
            for (int j = 0; j<reserve.length; j++){
                if (lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                }
            }
        }

        // 여벌이 있는 학생이 체육복을 빌려주는경우
        for (int i = 0; i< lost.length; i++ ){
            for (int j = 0; j<reserve.length; j++){
                if (lost[i] == reserve[j]-1 || lost[i] == reserve[j]+1){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                }
            }
        }

        return answer;
    }
}
