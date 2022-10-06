package Lv1.JAVA.x만큼간격이있는n개의숫자;

public class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];

        for(int i = 0; i<answer.length; i++){
            answer[i] = x*(i+1);

        }
        return answer;
    }
}
