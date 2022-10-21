package Lv1.JAVA.소수찾기;

public class Solution {
    public int solution(int n) {
        boolean[] check = new boolean[n + 1];
        // true : 비소수 , false : 소수
        check[0] = check[1] = true;

        // 0 과 1 은 소수가 아니므로 skip
        for (int i = 2; i <= Math.sqrt(n); i++) { //

            if (check[i])
                continue; // 소수가 아닐경우 skip

            for (int j = i * i; j < check.length; j += i) {
                check[j] = true;
            }
        }

        int cnt = 0;
        for(int i = 0; i<check.length; i++){
            if(!check[i])
                cnt++;
        }
        return cnt;
    }
}
