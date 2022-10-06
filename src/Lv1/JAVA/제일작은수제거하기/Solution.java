package Lv1.JAVA.제일작은수제거하기;

public class Solution {
    public int[] solution(int[] arr) {

        if (arr == null || arr.length == 1){
            int[] result = {-1};
            return result;
        }
        int[] result = new int[arr.length-1];
        int min = arr[0];
        for (int i =1; i< arr.length; i++){
            min = Math.min(min,arr[i]);
        }

        int index = 0;
        for (int i =0; i<arr.length; i++){
            if (min == arr[i]){
                continue;
            }
            result[index++] = arr[i];
        }
        return result;
    }
}
