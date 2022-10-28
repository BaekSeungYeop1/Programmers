package Lv1.JAVA.실패율;

import java.util.Arrays;

public class Solution {
    public int[] solution(int N, int[] stages) {

        int[] answer = new int[N];
        int[] failPerson = new  int[N]; // 실패한 사람
        double[] faliRate = new double[N]; // 실패율

        // 해당 스테이지 실패한 사람 수
        for (int i=0; i<N; i++){
            for (int j = 0; j<stages.length; j++){
                if (stages[j] == i+1){
                    failPerson[i]++;
                }
            }
        }

        // 실패율
        double remainder = stages.length; // 해당 스테이지 도전한 사람 수
        for (int i =0; i<failPerson.length; i++){
            double numerator = failPerson[i]; // 실패한 사람 수
            if (remainder == 0){
                faliRate[i] = 0;
            }
            else {
                faliRate[i] = numerator / remainder;
            }
            remainder -= failPerson[i];
        }
        System.out.println(Arrays.toString(faliRate));

        // answer
        double max = 0;
        int target = 1;
        for (int i=0; i<faliRate.length; i++){
            max = faliRate[0];
            target = 1;
            for (int j = 0; j< faliRate.length; j++){
                if (faliRate[j]>max){
                    max = faliRate[j];
                    target = j+1;
                }
            }
            faliRate[target-1] = -1;
            answer[i] = target;
        }

        return answer;
    }
}
