package leetcode;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 假设本题这个数字一定存在。
 * <p>
 * 解法：摩尔投票法：这个数字每出现一次，则投一票，反之减一票，得到最后票数为正的数字
 */
class Solution20 {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1, 2, 3, 4, 5, 4, 4, 4, 4, 4}));
    }

    public static int majorityElement(int[] nums) {
        // major 为被投票的数字，cnt 为这个数字每出现一次，则投一票，反之减一票
        int major = 0, cnt = 0;
        for (int num : nums) {
            if (cnt == 0) {
                major = num;
                ++cnt;
            } else {
                cnt += (num == major ? 1 : -1);
            }
        }
        return major;
    }
}