package string;

/**
 * 全字母短句：包括全部26个字母的短句
 */
public class Pangram {

    public static void main(String[] args) {
        assert isPangram("The quick brown fox jumps over the lazy dog");
        // not exists l character
        assert !isPangram("The quick brown fox jumps over the azy dog");
    }

    /**
     * 检查是否是全字母短句
     *
     * @param s
     * @return
     */
    public static boolean isPangram(String s) {
        boolean[] marked = new boolean[26];
        char[] values = s.toCharArray();
        for (char value : values) {
            if (Character.isLetter(value)) {
                int index = Character.isUpperCase(value) ? value - 'A' : value - 'a';
                marked[index] = true;
            }
        }
        for (boolean b : marked) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
}
