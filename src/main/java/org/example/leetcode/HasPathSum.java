package org.example.leetcode;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/7/7
 **/
public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        int targetSum = 0;
        return pathSum(root, sum, targetSum);
    }

    private boolean pathSum(TreeNode root, int sum, int targetSum) {
        if (root == null) {
            return false;
        }
        int v = root.val + targetSum;
        if (v == sum) {
            return true;
        }
        return pathSum(root.left, sum, v) || pathSum(root.right, sum, v);
    }
}
