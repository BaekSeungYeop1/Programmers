package Lv1.JAVA.이공일육년;

public class Solution {
    public String solution(int a, int b) {

        int allDay = 0;
        String[] month = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] day = {31,29,31,30,31,30,31,31,30,31,30,31};

        for (int i=0; i<a-1; i++){
            allDay += day[i];
        }
        allDay += (b-1);
        allDay %= 7;

        return month[allDay];
    }
}
