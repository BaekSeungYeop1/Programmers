package Lv1.JAVA.콜라츠추측;

public class Solution {
    public int solution(int num) {
        int cnt = 0;
        if(num == 1){
            return cnt;
        }
        while(num != 1){
            if(num % 2== 0){
                num /= 2;
            }
            else if(num % 2 == 1){
                num = (num*3) + 1;
            }
            else if(cnt == 500){
                cnt = -1;
                break;
            }
            cnt++;
        }
        return cnt;
    }
}
