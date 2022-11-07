package Lv1.JAVA;

import Lv1.JAVA.로또의최고순위와최저순위.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Solution s = new Solution();
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        System.out.println(Arrays.toString(s.solution(lottos,win_nums)));
//        System.out.println(s.solution(lottos,win_nums));
    }
}

