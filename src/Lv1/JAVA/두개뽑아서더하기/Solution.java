package Lv1.JAVA.두개뽑아서더하기;

import java.util.*;

public class Solution {
    public int[] solution(int[] numbers) {

        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i<numbers.length-1; i++){
            for (int j = i+1; j<numbers.length; j++){
                result.add(numbers[i]+numbers[j]);
            }
        }

        Iterator iter = result.iterator();
        int[] answer = new int[result.size()];
        int idx = 0;
        while (iter.hasNext()){
            answer[idx++] = (int) iter.next();
        }
        Arrays.sort(answer);
        return answer;
    }
}
