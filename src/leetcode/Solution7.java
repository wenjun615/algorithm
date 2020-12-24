package leetcode;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
class Solution7 {

    public static void main(String[] args) {
        System.out.println(solution1(3));
        System.out.println(solution2(4));
    }

    /**
     * 可从第n-1级台阶跳一级上去，也可从第n-2级台阶跳两级上去。f(n) = f(n-1) + f(n-2)，递推求解即可。
     *
     * @param n
     * @return
     */
    private static int solution1(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return solution1(n - 1) + solution1(n - 2);
    }

    /**
     * 参考斐波那契数列原理
     *
     * @param n
     * @return
     */
    private static int solution2(int n) {
        int a = 1, b = 2, s = 0;
        if (n == 1) {
            return a;
        }
        if (n == 2) {
            return b;
        }
        for (int i = 3; i <= n; ++i) {
            s = a + b;
            a = b;
            b = s;
        }
        return s;
    }
}