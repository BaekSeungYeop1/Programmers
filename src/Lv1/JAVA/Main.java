package Lv1.JAVA;

import Lv1.JAVA.나누어떨어지는숫자배열.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Solution s = new Solution();
        int arr[] = {5,9,7,10};
        int divisor = 5;
        System.out.println(Arrays.toString((s.solution(arr,divisor))));
    }
}

