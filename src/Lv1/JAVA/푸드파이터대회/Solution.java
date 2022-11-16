package Lv1.JAVA.푸드파이터대회;

/*
 * 입력 food : [1,3,4,6]
 * 출력 "1223330333221"
 * 2<= food의 길이 =< 9
 * 1<= food의 각 원소 <= 1000
 * food[i]는 i번 음식의 수
 * food[0]는 준비한 물의 양(항상 1)
 */

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Solution {
    public String solution(int[] food) {
        String answer = "";

        Deque<Integer> deque = new LinkedList<>();
        deque.add(0);
        for (int i = food.length-1; i>0; i--){
                int cnt = food[i]/2;
                for (int j= 0; j<cnt; j++){
                    deque.addFirst(i);
                    deque.addLast(i);
                }
        }
        Iterator iterator = deque.iterator();
        while (iterator.hasNext()){
            answer += iterator.next();
        }

        return answer;
    }
}
