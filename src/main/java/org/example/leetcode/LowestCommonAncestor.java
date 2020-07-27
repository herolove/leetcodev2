package org.example.leetcode;

/**
 * @Description 236. 二叉树的最近公共祖先
 * <p>
 * 题解：https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/solution/236-er-cha-shu-de-zui-jin-gong-gong-zu-xian-by-sab/
 * <p>
 * 题意解读
 * 根据题意有如下可能：
 * 1.树中既没有p也没有q，此时树中不存在最低公共子树；
 * 2.树中p和q只有一个存在，此时不存在最低公共子树；
 * 3.树中包含p和q，此时存在最低公共子树；
 * 当树中包含p和q时有如下可能：
 * 1.p在根节点的左子树，q在根节点的右子树，或者相反，此时最低共子树为根节点；
 * 2.p在q的子树中或者q在p的子树中，此时q或p为最低公共子树；
 * 3.p和q都在在根节点的左子树或者右子树中，则最低公共子树在左子树或者右子树中。
 * 递归原理
 * 我们需要得到的信息是节点的子树中是否含有p和q，以及该节点是不是最低公共子树；
 * <p>
 * 作者：saberMaster
 * 链接：https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/solution/236-er-cha-shu-de-zui-jin-gong-gong-zu-xian-by-sab/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @Author zhangtao02
 * @Date 2020/7/27
 **/
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            //当遍历到底或者遍历到p或q时向上返回root；
            return root;
        }
        //在左子树中寻找p或q
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        //在右子树中寻找p或q
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        //此时证明p和q在分别在该节点的左右子树中；
        if (left != null && right != null) {
            return root;
        }
        //如果left不为空，证明左子树中含有p或q，否则右子树中含有p或q；
        return left != null ? left : right;

    }
}
