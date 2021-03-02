package leetcode;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成 %20
 */
class Solution3 {

    public String replaceSpace(String s) {
        return s.replaceAll(" ", "%20");
    }
}