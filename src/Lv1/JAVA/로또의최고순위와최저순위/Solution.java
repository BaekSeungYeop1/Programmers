package Lv1.JAVA.로또의최고순위와최저순위;

public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {

        int non_cnt = 0; // 알아볼수 없는 번호
        int cnt = 0; // 맞은 번호


        for (int i = 0; i<lottos.length; i++){
            if (lottos[i] == 0){
                non_cnt++;
            }
            for (int j = 0; j<lottos.length; j++){
                if (lottos[i] == win_nums[j]){
                    cnt++;
                }
            }
        }

        // cnt+non_cnt = 최고순위, cnt = 최저순위
        int[] answer = {(non_cnt+cnt),cnt};
        for (int i = 0; i< answer.length; i++) {
            switch (answer[i]) {
                case 6:
                    answer[i] = 1;
                    break;

                case 5:
                    answer[i] = 2;
                    break;

                case 4:
                    answer[i] = 3;
                    break;

                case 3:
                    answer[i] = 4;
                    break;

                case 2:
                    answer[i] = 5;
                    break;

                default:
                    answer[i] = 6;
                    break;
            }
        }

        return answer;
    }
}
