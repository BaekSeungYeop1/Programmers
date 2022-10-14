package Lv1.JAVA.K번째수;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i<commands.length; i++){
            int[] copyArray = new int[commands[i][1]-(commands[i][0]-1)];
            for (int j = 0; j<copyArray.length; j++){
                copyArray[j] = array[(commands[i][0]-1)+j];
            }
            Arrays.sort(copyArray);
            answer[i] = copyArray[commands[i][2]-1];
        }
        return answer;

    }
}
