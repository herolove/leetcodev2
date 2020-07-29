package org.example.leetcode;

/**
 * @Description 83. 删除排序链表中的重复元素
 * @Author zhangtao02
 * @Date 2020/7/28
 **/
public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = head;
        ListNode q = head.next;
        while (q != null) {
            if (p.val == q.val) {
                p.next = q.next;
            } else {
                p = p.next;
            }
            q = q.next;
        }
        return head;
    }
}
