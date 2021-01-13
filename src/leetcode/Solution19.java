package leetcode;

import java.util.Arrays;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 */
class Solution19 {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.toString(spiralOrder(matrix)));
    }

    private static int[] res;
    private static int index = 0;

    public static int[] spiralOrder(int[][] matrix) {
        // m 行、n 列
        int m, n;
        if (matrix == null || (m = matrix.length) == 0 || matrix[0] == null || (n = matrix[0].length) == 0) {
            return new int[]{};
        }
        res = new int[m * n];
        int i1 = 0, i2 = m - 1;
        int j1 = 0, j2 = n - 1;
        while (i1 <= i2 && j1 <= j2) {
            add(matrix, i1++, j1++, i2--, j2--);
        }
        return res;
    }

    private static void add(int[][] matrix, int i1, int j1, int i2, int j2) {
        if (i1 == i2) {
            for (int j = j1; j <= j2; ++j) {
                res[index++] = matrix[i1][j];
            }
            return;
        }
        if (j1 == j2) {
            for (int i = i1; i <= i2; ++i) {
                res[index++] = matrix[i][j1];
            }
            return;
        }
        for (int j = j1; j < j2; ++j) {
            res[index++] = matrix[i1][j];
        }
        for (int i = i1; i < i2; ++i) {
            res[index++] = matrix[i][j2];
        }
        for (int j = j2; j > j1; --j) {
            res[index++] = matrix[i2][j];
        }
        for (int i = i2; i > i1; --i) {
            res[index++] = matrix[i][j1];
        }
    }
}