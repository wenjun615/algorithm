package leetcode;

/**
 * 请实现一个函数，输入一个整数，输出该数二进制表示中 1 的个数。
 * 例如，把9表示成二进制是1001，有2位是1。因此，如果输入9，则该函数输出2。
 */
public class Solution9 {

    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            // &表示左右两边二进制进行与运算，n &= (n - 1) => n = n & (n - 1)，表示去掉n的二进制的 最后 一个1
            n &= (n - 1);
            ++res;
        }
        return res;
    }
}