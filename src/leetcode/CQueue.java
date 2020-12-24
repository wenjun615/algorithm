package leetcode;

import java.util.Stack;

/**
 * 用两个栈实现一个队列。
 * 队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead，分别完成在队列尾部插入整数和在队列头部删除整数的功能。
 * (若队列中没有元素，deleteHead操作返回-1)
 * 栈：先进后出
 */
class CQueue {

    /**
     * s1只入栈，表示队列尾部插入
     */
    private Stack<Integer> s1 = new Stack<>();
    /**
     * s2只出栈，表示队列头部删除
     */
    private Stack<Integer> s2 = new Stack<>();

    public void appendTail(int value) {
        s1.push(value);
        check();
    }

    public int deleteHead() {
        check();
        return s2.empty() ? -1 : s2.pop();
    }

    /**
     * s1入栈后跟s2出栈前，需要判断s2是否空了，若空了则把s1中的元素转移过去
     */
    private void check() {
        if (s2.empty()) {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }
    }
}