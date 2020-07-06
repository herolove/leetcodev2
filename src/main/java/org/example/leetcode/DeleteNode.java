package org.example.leetcode;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/7/6
 **/
public class DeleteNode {
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null || node.next.next == null) {
            return;
        }
        ListNode slow = node;
        ListNode fast = node;
        ListNode curr = slow;
        while (fast != null && fast.next != null) {
            curr = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        curr.next = slow.next;
    }
}
