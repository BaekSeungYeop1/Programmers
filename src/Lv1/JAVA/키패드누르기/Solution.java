package Lv1.JAVA.키패드누르기;

public class Solution {
    public String solution(int[] numbers, String hand) {

        String answer = "";
        int left = 10; // * -> 10
        int right = 12;  // # -> 12

        for (int num : numbers){
            // left 1,4,7
            if (num == 1 || num == 4 || num == 7){
                answer += "L";
                left = num;
            }
            // right 3,6,9
            else if (num == 3 || num == 6 || num == 9){
                answer += "R";
                right = num;
            }
            // center 0,2,5,8
            else {
                if (num == 0) num = 11;

                int leftDiff = (Math.abs(num - left)/3) + (Math.abs(num - left) %3);
                int rightDiff = (Math.abs(num - right)/3) + (Math.abs(num - right) %3);

                if (leftDiff == rightDiff){
                    if (hand.equals("right")) {
                        answer += "R";
                        right = num;
                    }else {
                        answer += "L";
                        left = num;
                    }
                }else if (leftDiff > rightDiff) {
                    answer += "R";
                    right = num;
                }else {
                    answer += "L";
                    left = num;
                }
            }
        }

        return answer;
    }
}
