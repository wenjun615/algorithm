package string;

/**
 * 字母顺序排列
 * 方案：可直接比较字符大小判断字符顺序
 */
class Alphabetical {

    public static void main(String[] args) {
        /*
        assert，断言，如果条件不为true，则抛出异常AssertionError
        语法1：assert expression1 这里一般设置为true的逻辑，否则抛异常
        语法2：assert expression1:expression2 expression2表示自定义的异常信息
        使用assert，需要配置VM启动参数-enableassertions或-ea
         */
        assert !isAlphabetical("123abc");
        assert isAlphabetical("aBC");
        assert isAlphabetical("abc");
        assert !isAlphabetical("xyzabc");
        assert isAlphabetical("abcxyz");
    }

    /**
     * 检查字符串是否按字母顺序排列
     *
     * @param s
     * @return
     */
    public static boolean isAlphabetical(String s) {
        // 字符串转小写
        s = s.toLowerCase();
        for (int i = 0; i < s.length() - 1; ++i) {
            // Character.isLetter()判断是否为字母，s.charAt()返回索引处字符
            if (!Character.isLetter(s.charAt(i)) || !(s.charAt(i) <= s.charAt(i + 1))) {
                return false;
            }
        }
        return true;
    }
}
