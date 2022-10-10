package Lv1.JAVA.문자열내림차순으로배치하기;

import java.util.Arrays;
public class Solution {
    public String solution(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        StringBuilder sb = new StringBuilder(new String(c));


        return sb.reverse().toString();
    }
}
