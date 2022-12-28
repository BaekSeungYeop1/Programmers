package Lv1.JAVA.크레인인형뽑기게임;

import java.util.Stack;

public class Solution {
    /*
    *board
    {0,0,0,0,0},
    {0,0,1,0,3},
    {0,2,5,0,1},
    {4,2,4,4,2},
    {3,5,1,3,1}
    *moves
    [1,5,3,5,1,2,1,4]
     */
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> pickedDoll = new Stack();
        pickedDoll.push(0); // 처음 peek했을 시 데이터가 없으면 오류가 발생하기 때문에
        for (int i = 0; i< moves.length; i++){

            for (int j = 0; j<board.length; j++){
                if (board[j][moves[i]-1] != 0){
                    if (pickedDoll.peek() == board[j][moves[i]-1]){
                        pickedDoll.pop();
                        answer += 2;
                    }else {
                        pickedDoll.push(board[j][moves[i] - 1]);
                    }
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
