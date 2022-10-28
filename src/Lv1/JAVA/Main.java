package Lv1.JAVA;

import Lv1.JAVA.실패율.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Solution s = new Solution();
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int N = 5;

        System.out.println(Arrays.toString(s.solution(N, stages)));
    }
}

