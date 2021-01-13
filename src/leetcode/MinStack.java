package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 */
class MinStack {

    private final Deque<Integer> s1;
    private final Deque<Integer> s2;

    public MinStack() {
        s1 = new ArrayDeque<>();
        s2 = new ArrayDeque<>();
    }

    public void push(int x) {
        s1.push(x);
        s2.push(s2.isEmpty() || s2.peek() >= x ? x : s2.peek());
    }

    public void pop() {
        s1.pop();
        s2.pop();
    }

    public int top() {
        return s1.peek();
    }

    public int min() {
        return s2.peek();
    }
}