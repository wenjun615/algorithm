package string;

/**
 * 字符相同
 */
public class CharactersSame {

    public static void main(String[] args) {
        assert isAllCharactersSame("");
        assert !isAllCharactersSame("aab");
        assert isAllCharactersSame("aaa");
        assert isAllCharactersSame("11111");
    }

    /**
     * 检查所有字符是否一致
     * 从第二个字符开始，所有字符与第一个字符比较
     *
     * @param s
     * @return
     */
    public static boolean isAllCharactersSame(String s) {
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) != s.charAt(0)) {
                return false;
            }
        }
        return true;
    }
}
