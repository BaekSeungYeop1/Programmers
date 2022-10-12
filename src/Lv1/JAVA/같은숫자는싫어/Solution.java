package Lv1.JAVA.같은숫자는싫어;

import java.util.Stack;

public class Solution {
    public int[] solution(int []arr) {

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<arr.length; i++){
            if(stack.empty()){
                stack.push(arr[i]);
            }
            if(stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
        }

        int[] result = new int[stack.size()];
        for(int i= stack.size()-1; i>=0; i--){
            result[i] = stack.pop();
        }


        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(stack);

        return result;
    }
}
