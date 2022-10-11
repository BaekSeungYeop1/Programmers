package Lv1.JAVA.부족한금액계산하기;

public class Solution {
    public long solution(int price, long money, int count) {
        long result = 0;
        for(int i = 1; i<= count; i++){
            money -= price * i;
        }
        if(money<0){
            result = money * -1;
            return result;
        }
        else{
            return 0;
        }
    }
}
