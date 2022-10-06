package Lv1.JAVA.없는숫자더하기;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int solution(int[] numbers) {
        int sum = 45;
        for (int i = 0; i<numbers.length; i++){
            sum -= numbers[i];
        }
        return sum;
    }
}
