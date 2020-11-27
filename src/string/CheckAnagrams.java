package string;

import java.util.Arrays;

/**
 * 检查相同字母异位词，忽略大小写
 */
public class CheckAnagrams {

    public static void main(String[] args) {
        assert isAnagrams("Silent", "Listen");
        assert isAnagrams("This is a string", "Is this a string");
        assert !isAnagrams("There", "Their");
    }

    /**
     * 是否相同字母异序词
     *
     * @param s1
     * @param s2
     * @return
     */
    public static boolean isAnagrams(String s1, String s2) {
        // 转小写
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        // 字符串转字符数组
        char[] values1 = s1.toCharArray();
        char[] values2 = s2.toCharArray();
        // 数组排序，从小到大
        Arrays.sort(values1);
        Arrays.sort(values2);
        // 字符数组转字符串比较是否相同
        return new String(values1).equals(new String(values2));
    }
}
