package leetcode;

import java.util.Stack;

/**
 * 用两个栈实现一个队列。
 */
class Solution28 {

    private final Stack<Integer> s1 = new Stack<>();

    private final Stack<Integer> s2 = new Stack<>();

    public void push(int value) {
        s1.push(value);
    }

    public int pop() {
        if (s1.isEmpty() && s2.isEmpty()) {
            return -1;
        }
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
}