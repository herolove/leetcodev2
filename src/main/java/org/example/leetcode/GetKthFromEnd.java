package org.example.leetcode;

import java.util.Stack;

/**
 * @Description 剑指 Offer 22. 链表中倒数第k个节点
 * @Author zhangtao02
 * @Date 2020/7/2
 **/
public class GetKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null || k <= 0) {
            return head;
        }
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        ListNode res = null;
        while (k > 0) {
            res = stack.pop();
            k--;
        }
        return res;
    }

    public ListNode getKthFromEndV2(ListNode head, int k) {
        if (head == null || k <= 0) {
            return head;
        }
        ListNode p = head;
        ListNode q = head;
        int index = 1;
        while (p != null) {
            if (index >= k) {
                p = p.next;
            }
            q = q.next;
        }
        return p;
    }
}
