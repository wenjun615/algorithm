package string;

/**
 * 旋转
 * 给定一个字符串，将字符串前面的几个字符移动到字符串的末尾
 * 例如："abcdef" -> "cdefab"
 */
public class Rotation {

    public static void main(String[] args) {
        assert rotation("abcdef", 2).equals("cdefab");
        char[] values = "abcdef".toCharArray();
        rotation(values, 2);
        assert new String(values).equals("cdefab");
    }

    /**
     * 指定个数字符移动到字符串末尾
     *
     * @param s 字符串
     * @param n 移动字符个数
     * @return
     */
    public static String rotation(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }

    /**
     * 字符数组中的移动
     *
     * @param values
     * @param n
     */
    public static void rotation(char[] values, int n) {
        // 0到n交换
        reverse(values, 0, n - 1);
        // n到末尾交换
        reverse(values, n, values.length - 1);
        // 0到末尾交换
        reverse(values, 0, values.length - 1);
    }

    /**
     * 指定开始结束位置的反转字符数组
     *
     * @param values
     * @param from   交换开始位置
     * @param to     交换结束位置
     */
    public static void reverse(char[] values, int from, int to) {
        while (from < to) {
            char temp = values[from];
            values[from] = values[to];
            values[to] = temp;
            from++;
            to--;
        }
    }
}
