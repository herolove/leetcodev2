package org.example.leetcode;

/**
 * @Description 110. 平衡二叉树
 * @Author zhangtao02
 * @Date 2020/7/7
 **/
public class IsBalanced {
    private int height(TreeNode root) {
        if (root == null) {
            return -1;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        return Math.abs(height(root.left) - height(root.right)) < 2
                && isBalanced(root.left)
                && isBalanced(root.right);
    }
}
