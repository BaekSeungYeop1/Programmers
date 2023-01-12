package Lv1.JAVA;

import Lv2.JAVA.최댓값과최솟값.Solution;

public class Main {
    public static void main(String args[]){
        
        Solution s = new Solution();
        String X = "100";
        String Y = "123450";
        int number = 10;
        int limit = 3;
        int power = 2;
        int[][] board = {
                {0,0,0,0,0},
                {0,0,1,0,3},
                {0,2,5,0,1},
                {4,2,4,4,2},
                {3,5,1,3,1}
        };
        int[] moves = {1,5,3,5,1,2,1,4};

        String st = "1 2 3 4";

        System.out.println(s.solution(st));
//        System.out.println(s.solution(lottos,win_nums));
    }
}

