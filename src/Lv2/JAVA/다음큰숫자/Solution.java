package Lv2.JAVA.다음큰숫자;

// Integer.bigCount(n) : 2진수의 1개수를 세주는 함수

public class Solution {
    public int solution(int n) {

        int cnt = Integer.bitCount(n);
        while (true){
            n++;
            if (cnt == Integer.bitCount(n)){
                return n;
            }
        }
    }
}
