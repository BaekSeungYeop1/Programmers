package Lv1.JAVA;

import Lv1.JAVA.숫자짝궁.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        
        Solution s = new Solution();
        String X = "100";
        String Y = "123450";
        int[][] board = {
                {0,0,0,0,0},
                {0,0,1,0,3},
                {0,2,5,0,1},
                {4,2,4,4,2},
                {3,5,1,3,1}
        };
        int[] moves = {1,5,3,5,1,2,1,4};

        System.out.println(s.solution(X, Y));
//        System.out.println(s.solution(lottos,win_nums));
    }
}

