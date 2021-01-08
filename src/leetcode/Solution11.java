package leetcode;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 * <p>
 * 解法：任意奇数二进制末尾为1，偶数为0，偶数可以理解为2的次幂，2 => 10。
 * 所以奇数 & 1的计算结果必为1，偶数为0
 */
class Solution11 {

    public int[] exchange(int[] nums) {
        int p = 0, q = nums.length - 1;
        while (p < q) {
            if ((nums[p] & 1) == 1) {
                ++p;
                continue;
            }
            if ((nums[q] & 1) == 0) {
                --q;
                continue;
            }
            swap(nums, p, q);
        }
        return nums;
    }

    private void swap(int[] nums, int p, int q) {
        int t = nums[p];
        nums[p] = nums[q];
        nums[q] = t;
    }
}