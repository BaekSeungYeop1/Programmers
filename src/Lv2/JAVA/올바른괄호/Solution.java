package Lv2.JAVA.올바른괄호;

import java.util.Stack;

public class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }

        }
        if (!stack.isEmpty()) {
            return false;
        }
        return answer;
    }
}
