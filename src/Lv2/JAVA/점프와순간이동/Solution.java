package Lv2.JAVA.점프와순간이동;

/*
 * 1 = 1    ,2
 * 2 = 10   ,1
 * 3 = 11   ,2
 * 4 = 100  ,1
 * 5 = 101  ,2
 * 6 = 110  ,2
 * 7 = 111  ,3
 * 8 = 1000  ,1
 * 9 = 1001  ,2
 * 10 = 1010 ,2
 */
public class Solution {

    public int solution(int n) {

        int answer = 0;

        while (n!=0){
            if (n%2==0){
                n /= 2;
            }else {
                n -= 1;
                answer += 1;
            }
        }

        return answer;
    }
}
