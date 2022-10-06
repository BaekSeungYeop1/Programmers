package Lv1.JAVA.나누어떨어지는숫자배열;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        int size = arr.length;
        int cnt=0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                cnt++;
            }
        }

        if(cnt == 0){
            int[] result = {-1};
            return result;
        }
        int[] result = new int[cnt];
        for (int i = 0, j = 0; i<arr.length; i++){
            if(arr[i]%divisor==0) {
                result[j++] = arr[i];
            }
        }
        Arrays.sort(result);
        return result;
    }
}
