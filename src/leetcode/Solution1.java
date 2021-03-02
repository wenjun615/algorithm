package leetcode;

/**
 * 题目：找出数组中重复的数字
 * <p>
 * 描述：在一个长度为 n 的数组 nums 里，所有数字都在 0 ～ n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 * 请找出数组中任意一个重复的数字。
 * <p>
 * 解法：0 ～ n-1 范围内的数，分别还原到对应的位置上，如：数字 2 交换到下标为 2 的位置。
 * 若交换过程中发现重复，则直接返回。
 * <p>
 * 分析：程序的主体就是数字位置还原的过程
 */
class Solution1 {

    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            while (i != nums[i]) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                swap(nums, i, nums[i]);
            }
        }
        return -1;
    }

    /**
     * 交换
     *
     * @param nums 数组
     * @param i    位置
     * @param j    位置
     */
    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}