package Lv2.JAVA.영어끝말잇기;

/*
 * 1번부터 번호 순서대로 한 사람씩 차례대로 단어를 말합니다.
 * 마지막 사람이 단어를 말한 다음에는 다시 1번부터 시작합니다.
 * 앞사람이 말한 단어의 마지막 문자로 시작하는 단어를 말해야 합니다.
 * 이전에 등장했던 단어는 사용할 수 없습니다.
 * 한 글자인 단어는 인정되지 않습니다.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};

        ArrayList<String> arr = new ArrayList<>();
        arr.add(words[0]);

        for (int i = 1; i< words.length; i++){

            // 이전에 등장했던 단어가 아니라면
            if (!arr.contains(words[i])){
                arr.add(words[i]);
                String beforeWord = arr.get(i-1);
                String presentWord = arr.get(i);
                // 앞사람 말한 단어의 마지막 문자로 시작하는 단어가 아니라면
                if (beforeWord.charAt(beforeWord.length()-1) != presentWord.charAt(0)){
                    answer[0] = (i%n) + 1;
                    answer[1] = (i/n) + 1;

                return answer;
                }
            }else {
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
            }
        }

        return answer;
    }
}

