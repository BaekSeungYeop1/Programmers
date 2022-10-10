package Lv1.JAVA.문자열다루기기본;

public class Solution {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6){
            try{
                Integer.parseInt(s);
                return true;
            }
            catch(NumberFormatException e){
                return false;
            }
        }
        return false;
    }
}
