package leetcode;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * <p>
 * 思路：前序遍历的第一个元素一定是树根节点，前序遍历的第二个元素为左树的根节点。
 * 递归，每次通过根节点拆分左右树
 * 此例建议结合原址中的解法图理解，并需要理解二叉树的前序遍历和中序遍历的结果
 * https://github.com/doocs/leetcode/blob/main/lcof/%E9%9D%A2%E8%AF%95%E9%A2%9807
 * .%20%E9%87%8D%E5%BB%BA%E4%BA%8C%E5%8F%89%E6%A0%91/README.md
 */
class Solution5 {

    /**
     * @param preorder 前序遍历结果数组
     * @param inorder  中序遍历结果数组
     * @return
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0 || preorder.length != inorder.length) {
            return null;
        }
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode buildTree(int[] preorder, int s1, int e1, int[] inorder, int s2, int e2) {
        if (s1 > e1 || s2 > e2) {
            return null;
        }
        int index = findIndex(inorder, s2, e2, preorder[s1]);
        TreeNode tree = new TreeNode(preorder[s1]);
        // s1 + 1表示下一个左树开始位置，index - s2表示下一个左树有几个节点，s1 + index - s2表示下一个左树结束位置
        tree.left = buildTree(preorder, s1 + 1, s1 + index - s2, inorder, s2, index - 1);
        // 下一个左树结束位置+1表示下一个右树根节点位置
        tree.right = buildTree(preorder, s1 + index - s2 + 1, e1, inorder, index + 1, e2);
        return tree;
    }

    /**
     * 返回前序遍历根节点在中序遍历结果中的位置
     *
     * @param order 中序遍历结果
     * @param s     中序遍历结果开始位置
     * @param e     中序遍历结果结束位置
     * @param val   前序遍历根节点值
     * @return
     */
    public int findIndex(int[] order, int s, int e, int val) {
        for (int i = s; i <= e; ++i) {
            if (order[i] == val) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 树节点
     */
    class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}