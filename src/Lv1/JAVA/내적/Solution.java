package Lv1.JAVA.내적;

public class Solution {
    public int solution(int[] a, int[] b) {
        int sum = 0;
        for(int i = 0; i<a.length; i++){
            sum += a[i] * b[i];
        }
        return sum;
    }
}
