package problem;

/**
 * 问题
 */
public class Problem {

    /**
     * n以内的3或5的倍数的自然数之和
     *
     * @param n
     * @return
     */
    private static int solution1(int n) {
        int sum = 0;
        for (int i = 3; i < n; ++i) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * 斐波那契序列中的每一个新项都是由前两项相加生成的
     * <p>
     * 求最后项不超过n的斐波那契序列中的偶数的和
     *
     * @param n
     * @return
     */
    private static int solution2(int n) {
        int sum = 0;
        int first = 1;
        int second = 2;
        while (second <= n) {
            // 偶数的和
            if (second % 2 == 0) {
                sum += second;
            }
            int temp = first + second;
            first = second;
            second = temp;
        }
        return sum;
    }

    /**
     * 回文数正反读起来都一样
     * <p>
     * 求两个三位数乘积小于n的最大回文乘积
     *
     * @param n 任意两个三位数的乘积，这里就不做校验了
     * @return
     */
    private static int solution3(int n) {
        // 两个三位数乘积的最小值100X100=10000
        for (int i = n - 1; i >= 10000; --i) {
            String numberStr = String.valueOf(i);
            // 判断是否回文
            if (new StringBuilder(numberStr).reverse().toString().equals(numberStr)) {
                /*
                这里divisor除数的降序循环跟升序没有区别，因为最大回文已经拿到，剩下的只要确定是两个三位数就行
                 */
                for (int divisor = 999; divisor >= 100; --divisor) {
                    if (i % divisor == 0 && String.valueOf(i / divisor).length() == 3) {
                        return i;
                    }
                }
            }
        }
        // 未找到
        return -1;
    }

    /**
     * 判断是否质数，除1跟本身没有其他因数
     *
     * @param number
     * @return
     */
    private static boolean isPrime(int number) {
        if (number == 2) {
            return true;
        }
        if (number < 2 || number % 2 == 0) {
            return false;
        }
        // Math.sqrt(number)求平方根，double转int会舍弃掉小数位，不会四舍五入
        for (int i = 3; i <= (int) Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 求第n个质数
     *
     * @param n 从1开始
     * @return
     */
    private static int solution4(int n) {
        int count = 0;
        int number = 1;
        while (count < n) {
            if (isPrime(++number)) {
                count++;
            }
        }
        return number;
    }

    /**
     * 小于n的质数之和
     *
     * @param n
     * @return
     */
    private static long solution5(long n) {
        long sum = 0;
        for (int i = 2; i < n; ++i) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
