package string;

/**
 * 小写
 */
public class Lower {

    public static void main(String[] args) {
        String[] strings = {"ABC", "ABC123", "abcABC", "abc123ABC"};
        for (String s : strings) {
            assert toLowerCase(s).equals(s.toLowerCase());
        }
    }

    /**
     * 字符串字符转小写
     *
     * @param s
     * @return
     */
    public static String toLowerCase(String s) {
        char[] values = s.toCharArray();
        for (int i = 0; i < values.length; ++i) {
            // Character.isUpperCase 判断是否大写字母 Character.toLowerCase 字符大写转小写
            if (Character.isLetter(values[i]) && Character.isUpperCase(values[i])) {
                values[i] = Character.toLowerCase(values[i]);
            }
        }
        return new String(values);
    }
}
