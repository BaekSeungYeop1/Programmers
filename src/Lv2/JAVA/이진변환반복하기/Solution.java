package Lv2.JAVA.이진변환반복하기;

public class Solution {
    public int[] solution(String s) {
        int[] answer = {0,0};

        while (s.length()>1){
            answer[1] += countZero(s);
            s = s.replaceAll("0","");
            s = Integer.toBinaryString(s.length());
            answer[0]++;
        }
        return answer;

    }

    private int countZero(String s) {
        int cnt = 0;
        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i) == '0'){
                cnt++;
            }
        }
        return cnt;
    }
}
