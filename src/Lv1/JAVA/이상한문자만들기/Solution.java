package Lv1.JAVA.이상한문자만들기;


import java.util.StringTokenizer;

public class Solution {
    public String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s, " ", true);

        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            if (word.equals(" ")){
                answer += word;
                continue; // " "일 경우 밑에 for문을 거치지 않기 위해
            }
            for (int i = 0; i < word.length(); i++) {
                String temp = String.valueOf(word.charAt(i));
                if (i % 2 == 0) {
                    answer += temp.toUpperCase();
                } else {
                    answer += temp.toLowerCase();
                }

            }
        }
        return answer;
    }
}
