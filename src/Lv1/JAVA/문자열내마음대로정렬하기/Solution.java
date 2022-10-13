package Lv1.JAVA.문자열내마음대로정렬하기;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> arr = new ArrayList<String>();

        for(int i =0; i<strings.length; i++){
            arr.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(arr);

        for(int i = 0; i<strings.length; i++){
            answer[i] = arr.get(i).substring(1);
        }
        return answer;
    }
}
