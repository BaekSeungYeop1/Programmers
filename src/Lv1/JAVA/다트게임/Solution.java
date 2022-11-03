package Lv1.JAVA.다트게임;

public class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[3]; // 점수를 저장할 배열
        int cnt = 0; // 점수 배열의 index
        char[] result = dartResult.toCharArray(); // 문자열 값을 char형으로 변환해 저장한 배열

        for (int i=0; i<result.length; i++){
            switch (result[i]){
                // S인 경우 1제곱
                case 'S' :
                    score[cnt] *= 1;
                    cnt++;
                    break;

                // D인 경우 2제곱
                case 'D' :
                    score[cnt] *= score[cnt];
                    cnt++;
                    break;

                // T인 경우 3제곱
                case 'T' :
                    score[cnt] *= score[cnt]*score[cnt];
                    cnt++;
                    break;

                // *인 경우 자신과 이전의 점수 *2, cnt가 S,D,T 이후 증가함으로 cnt-1,cnt-2
                case '*' :
                    if (cnt>1) {
                        score[cnt - 2] *= 2;
                    }
                    score[cnt-1] *= 2;
                    break;

                // #인 경우 음수로 변환
                case '#' :
                    score[cnt-1] *= -1;
                    break;

                // 숫자가 10인 경우 10으로 처리후 i++
                default:
                    if (result[i] == '1' && result[i+1] == '0'){
                        score[cnt] = 10;
                        i++;
                    }
                    else {
                        score[cnt] = result[i] - '0';
                    }
                    break;
            }
        }
        for (int i = 0; i<cnt; i++){
            answer += score[i];
        }
        return answer;
    }
}
