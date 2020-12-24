package leetcode;

/**
 * 斐波那契数列：第0、1项为0、1，之后每项由前两项相加得出。
 * 求斐波那契数列的第n项
 * 公式：f(0)=0，f(1)=1，f(n)=f(n-1)+f(n-2)，n>1
 */
class Solution6 {

    public int fib(int n) {
        int a = 0, b = 1;
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        for (int i = 0; i < n; ++i) {
            int s = a + b;
            a = b;
            b = s;
        }
        return a;
    }
}