package leetcode;

/**
 * 输入一个整型数组，数组里有正数也有负数，数组中的一个或连续多个整数组成一个子数组。
 * 求所有子数组的和的最大值。
 * 要求时间复杂度为 O(n)。
 */
class Solution22 {

    public int maxSubArray(int[] nums) {
        // res 子数组和的最大值，t 当前子数组的和
        int res = nums[0], t = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            /*
            每次循环都添加当前元素到子数组中
            若 t 为负数，重新将当前元素作为新的子数组的和
            res 记录了之前子数组的最大值，继续跟 t 比较大小取最大值
             */
            t = Math.max(t, 0) + nums[i];
            res = Math.max(res, t);
        }
        return res;
    }
}