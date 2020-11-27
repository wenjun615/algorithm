package string;

/**
 * 反转字符串
 */
public class ReverseString {

    public static void main(String[] args) {
        assert reverse("abc123").equals("321cba");
        assert reverse2("abc123").equals("321cba");
    }

    /**
     * 最简单
     *
     * @param str
     * @return
     */
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * 方式二
     *
     * @param str
     * @return
     */
    public static String reverse2(String str) {
        // str.isEmpty() String长度为0
        if (str == null || str.isEmpty()) {
            return str;
        }
        char[] value = str.toCharArray();
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            char temp = value[i];
            value[i] = value[j];
            value[j] = temp;
        }
        return new String(value);
    }
}
