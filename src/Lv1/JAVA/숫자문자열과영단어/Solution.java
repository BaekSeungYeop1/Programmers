package Lv1.JAVA.숫자문자열과영단어;

public class Solution {
    public int solution(String s) {

        String[] word ={"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i = 0; i<word.length; i++){
            s = s.replace(word[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }
}
