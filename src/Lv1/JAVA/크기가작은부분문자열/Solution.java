package Lv1.JAVA.크기가작은부분문자열;

//5,12,4
public class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        int size = t.length()-(p.length()-1);

        Long num1 = Long.parseLong(p);
        for (int i = 0; i<size; i++){
            Long num2 = Long.parseLong(t.substring(i,i+p.length()));
            if (num2 <= num1){
                answer++;
            }
        }

        return answer;
    }
}
