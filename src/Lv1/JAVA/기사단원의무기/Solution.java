package Lv1.JAVA.기사단원의무기;

/*
 * number = 기사단원의 수
 * limit = 협약으로 정해진 제한수치를 나타내는 정수
 * power = 제한수치를 초과한 기사가 사용할 무기의 공격력
 *
 * number = 5, limit = 3, power = 2, result = 10
 * [1,2,2,3,2]
 * number = 10, limit = 3, power = 2, result = 21
 * [1,2,2,3,2,4,2,4,3,4]
 */

import java.util.ArrayList;

public class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i<=number; i++){
            int result = getDivisior(i);

            if (result <= limit){
                answer += result;
            }else{
                answer += power;
            }
        }

        return answer;
    }

    private int getDivisior(int num) {
        int cnt = 0;

        for (int i = 1; i*i<=num; i++){

           if (i * i == num){
               cnt++;
           }else if (num % i == 0){
               cnt += 2;
           }
        }
        return cnt;
    }
}
