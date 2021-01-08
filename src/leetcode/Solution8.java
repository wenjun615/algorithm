package leetcode;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如，数组[3,4,5,1,2]为[1,2,3,4,5]的一个旋转，该数组的最小值为1。
 * <p>
 * 解法：二分查找
 */
class Solution8 {

    /**
     * @param numbers 递增数组旋转后的数组
     * @return
     */
    public int findMinFromArray(int[] numbers) {
        if (numbers.length == 1) {
            return numbers[0];
        }
        int left = 0, right = numbers.length - 1;
        /*
        << >> 左移是乘2的次方，右移是除2的次方
        二分法
         */
        while (right - left > 1) {
            int mid = left + ((right - left) >> 1);
            if (numbers[left] == numbers[mid] && numbers[mid] == numbers[right]) {
                return findMin(numbers, left, right);
            }
            if (numbers[mid] >= numbers[left]) {
                left = mid;
            } else if (numbers[mid] <= numbers[right]) {
                right = mid;
            }
        }
        return numbers[right];
    }

    private int findMin(int[] numbers, int left, int right) {
        int min = numbers[left];
        for (int i = left + 1; i < right; ++i) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }
}