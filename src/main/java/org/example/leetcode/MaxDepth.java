package org.example.leetcode;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/8/12
 **/
public class MaxDepth {
    int maxDepth = 1;

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        depth(root, 1);
        return maxDepth;
    }

    private void depth(TreeNode root, int hight) {
        if (root == null) {
            maxDepth = Math.max(hight, maxDepth);
            return;
        }
        depth(root.left, hight + 1);
        depth(root.right, hight + 1);
    }
}
