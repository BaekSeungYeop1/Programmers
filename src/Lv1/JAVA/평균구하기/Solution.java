package Lv1.JAVA.평균구하기;

class Solution {
    public double solution(int[] arr) {
        double sum = 0;
        double answer = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        answer = sum/arr.length;
        return answer;
    }
}
