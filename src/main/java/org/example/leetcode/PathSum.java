package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/6/17
 **/
public class PathSum {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        List<Integer> pathList = new ArrayList<>();
        path(root, sum, pathList, res);
        return res;
    }

    private void path(TreeNode root, int sum, List<Integer> pathList, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        int val = root.val;
        pathList.add(val);
        if (sum - val == 0 && (root.left == null && root.right == null)) {
            res.add(new ArrayList<Integer>(pathList));
        }
        path(root.left, sum - val, pathList, res);
        path(root.right, sum - val, pathList, res);
        pathList.remove(pathList.size() - 1);
    }
}
