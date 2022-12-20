package Lv1.JAVA.가장가까운글자;

public class Solution {
    public int[] solution(String s) {

        char[] word = s.toCharArray();
        int[] result = new int[s.length()];

        for (int i = 0; i<s.length(); i++){
            result[i] = -1;
        }

        for (int i = s.length()-1; i>0; i--){
            for (int j = i-1; j>=0; j--){
                if (word[i] == word[j]){
                    result[i] = i-j;
                    break;
                }
            }
        }

        return result;
    }
}
