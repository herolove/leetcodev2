package org.example.leetcode;

/**
 * @Description 230. 二叉搜索树中第K小的元素
 * <p>
 * 中序遍历
 * @Author zhangtao02
 * @Date 2020/7/2
 **/
public class TreeNodeKthSmallest {
    int val = 0;
    int k =  0;
    public int kthSmallest(TreeNode root, int k) {
        if (root == null || k <= 0) {
            return -1;
        }
        this.k = k;
        findk(root);
        return val;
    }

    private void findk(TreeNode root) {
        if (root == null) {
            return ;
        }
        findk(root.left);
        if (--k==0) {
            return ;
        }
        findk(root.right);
        return ;
    }
}
