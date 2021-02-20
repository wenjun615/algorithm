package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。
 * <p>
 * 解法：字符串转字符数组，遍历字符数组，将字符及字符出现次数存入 Map
 */
class Solution24 {

    public char firstUniqChar(String s) {
        if ("".equals(s)) {
            return ' ';
        }
        // LinkedHashMap 的存储是有序的，先存储的会先遍历出来
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.get(c) == null ? 1 : map.get(c) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return ' ';
    }
}