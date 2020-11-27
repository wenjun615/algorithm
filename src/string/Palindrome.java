package string;

/**
 * 回文字符串：正读和反读都一样的字符串
 */
class Palindrome {

    public static void main(String[] args) {
        String[] palindromes = {null, "", "aba", "123321"};
        for (String s : palindromes) {
            assert isPalindrome(s) && isPalindrome1(s);
        }
        String[] notPalindromes = {"abb", "abc", "abc123"};
        for (String s : notPalindromes) {
            assert !isPalindrome(s) && !isPalindrome1(s);
        }
    }

    /**
     * 检查一个字符串是否是回文字符串
     *
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s) {
        return (s == null || s.length() <= 1) || s.equals(new StringBuilder(s).reverse().toString());
    }

    /**
     * 检查一个字符串是否是回文字符串
     *
     * @param s
     * @return
     */
    public static boolean isPalindrome1(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }
        for (int i = 0, j = s.length() - 1; i < j; ++i, --j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
