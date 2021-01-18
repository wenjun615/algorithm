package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 输入整数数组 arr，找出其中最小的 k 个数字。
 * 例如，输入 4、5、1、6、2、7、3、8，则最小的 4 个数字是 1、2、3、4。
 * <p>
 * PriorityQueue 优先级队列，插入新数据的时候，会自动插入到合适位置保证队列有序，默认升序插入。
 */
class Solution23 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(getLeastNumbers(arr, 3)));
    }

    public static int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0) {
            return new int[]{};
        }
        // Collections.reverseOrder() 比较器，将原来顺序反转，默认自然顺序（升序），反转后是降序。k 初始容量。
        PriorityQueue<Integer> bigRoot = new PriorityQueue<>(k, Collections.reverseOrder());
        for (int e : arr) {
            if (bigRoot.size() < k) {
                bigRoot.offer(e);
            } else {
                if (e < bigRoot.peek()) {
                    bigRoot.poll();
                    bigRoot.offer(e);
                }
            }
        }

        int[] res = new int[k];
        for (int i = 0; i < k; ++i) {
            res[i] = bigRoot.poll();
        }
        return res;
    }
}