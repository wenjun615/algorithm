package leetcode;

import java.util.Stack;

/**
 * 输入两个整数数组，第一个数组表示栈的入栈顺序，判断第二个数组是否为栈的出栈顺序
 */
public class Solution29 {

    public boolean solution(int[] i1, int[] i2) {
        if (i1.length == 0 || i2.length == 0) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int popIndex = 0;
        for (int val : i1) {
            stack.push(val);
            while (!stack.empty() && stack.peek() == i2[popIndex]) {
                stack.pop();
                ++popIndex;
            }
        }
        return stack.empty();
    }
}
