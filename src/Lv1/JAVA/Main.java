package Lv1.JAVA;

import Lv1.JAVA.비밀지도.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Solution s = new Solution();
        int arr1[] = {46, 33, 33 ,22, 31, 50};
        int arr2[] = {27 ,56, 19, 14, 14, 10};
        int n = 6;
        System.out.println(Arrays.toString((s.solution(n,arr1,arr2))));
    }
}

