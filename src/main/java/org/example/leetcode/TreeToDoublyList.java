package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 剑指 Offer 36. 二叉搜索树与双向链表
 * @Author zhangtao02
 * @Date 2020/7/29
 **/
public class TreeToDoublyList {
    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }
        List<Node> list = new ArrayList<>();
        dfs(list, root);
        int len = list.size();
        Node head = list.get(0);
        Node tail = list.get(len - 1);
        Node curr = head;
        Node next = null;
        for (int index = 1; index < len - 1; index++) {
            if (index != 1) {
                list.get(index).left = curr;
            }
            curr.right = list.get(index);
            curr = list.get(index);
        }
        tail.left = head;
        head.right = tail;
        return head;
    }

    private void dfs(List<Node> list, Node root) {
        if (root == null) {
            return;
        }
        dfs(list, root.left);
        list.add(root);
        dfs(list, root.right);
    }
}
