package Lv2.JAVA.JadenCase문자열만들기;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<String> word = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(s, " ");
        while (st.hasMoreTokens()){
            word.add(st.nextToken());
        }
        for (int i = 0; i<word.size(); i++){
            if (word.get(i).charAt(0)>='0'&& word.get(i).charAt(0)<= '9'){

            }else if (word.get(i).charAt(0)>='a'&& word.get(i).charAt(0)<= 'z')

        }
        return answer;
    }
}
