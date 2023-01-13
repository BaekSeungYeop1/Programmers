package Lv2.JAVA.JadenCase문자열만들기;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
    public String solution(String s) {
        // 모든 소문자로 변환
        String str = s.toLowerCase();
        // 구분자를 포함하여 단어를 자름
        StringTokenizer st = new StringTokenizer(str, " ",true);
        StringBuilder sb = new StringBuilder();

        // 첫 문자를 대문자로 변환하여 저장
        while (st.hasMoreTokens()){
            String word = st.nextToken();
            sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));
        }


        return sb.toString();
    }
}
