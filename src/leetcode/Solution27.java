package leetcode;

/**
 * 一个长度为 n-1 的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围 0 ～ n-1 之内。
 * 在范围 0 ～ n-1 内的 n 个数字中有且只有一个数字不在该数组中，请找出这个数字。
 */
class Solution27 {

    public int missingNumber(int[] nums) {
        int l = 0, r = nums.length - 1;
        if (r == 0 || nums[0] == 1) {
            // ^ 1 亦或运算符
            return nums[0] ^ 1;
        }
        if (nums[r] == r) {
            return r + 1;
        }
        while (r - l > 1) {
            int m = l + ((r - l) >> 1);
            if (nums[m] == m) {
                l = m;
            } else {
                r = m;
            }
        }
        return nums[r] - 1;
    }
}