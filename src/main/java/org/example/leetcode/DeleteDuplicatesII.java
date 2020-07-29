package org.example.leetcode;

/**
 * @Description 82. 删除排序链表中的重复元素 II
 * @Author zhangtao02
 * @Date 2020/7/28
 **/
public class DeleteDuplicatesII {
    public ListNode deleteDuplicates(ListNode head) {
        // 1.base cases
        if (head == null || head.next == null) return head;

        // 2.哑节点,快慢指针
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = head;

        while (fast != null) {
            if (fast.next == null || fast.val != fast.next.val) {
                if (slow.next == fast)
                {
                    slow = fast;
                } else {
                    slow.next = fast.next;
                }
            }
            fast = fast.next;
        }
        return dummy.next;
    }
}
