package leetcode;

/**
 * 题目：找出数组中重复的数字
 * <p>
 * 描述：在一个长度为n的数组nums里，所有数字都在0～n-1的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 * 请找出数组中任意一个重复的数字。
 * <p>
 * 解法：0～n-1范围内的数，分别还原到对应的位置上，如：数字2交换到下标为2的位置。
 * 若交换过程中发现重复，则直接返回。
 * <p>
 * 分析：
 * num   1 2 3 3
 * index 1 2 3 4
 * 第四位置的数字跟下标不一致，并且发现数字3重复，需要返回
 * 程序的主体就是数字位置还原的过程
 */
class Solution1 {

    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            /*
            若当前下标跟该位置下的数字不对应，则比较当前位置数字跟把该数字作为下标时对应的数字是否一致，一致则返回重复数字
            不一致，则把数字还原到对应下标位置，当前位置则替换成新的数字，再次重复while循环
            无论是否存在重复数字，最终一定满足while判断跟if判断退出条件之一
            分析：不存在重复数字的时候，依题意，一定存在数组下标跟数组元素的一一对应关系，故while不会陷入死循环，若存在重复数字，则一定通过if判断返回
             */
            while (i != nums[i]) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                // 数字nums[i]还原到下标nums[i]位置上
                swap(nums, i, nums[i]);
            }
        }
        return -1;
    }

    /**
     * 交换
     *
     * @param nums
     * @param i
     * @param j
     */
    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}