package org.example.leetcode;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/6/18
 **/
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode root = new ListNode(0);
        ListNode pre = root;
        int a = 0;
        while (l1 != null && l2 != null) {
            int v1 = 0;
            int v2 = 0;
            if (l1 != null) {
                v1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                v2 = l2.val;
                l2 = l2.next;
            }
            ListNode curr = new ListNode((v1 + v2 + a) % 10);
            a = (v1 + v2) / 10;
            pre.next = curr;
            pre = curr;
            if (l1 == null && l2 == null && a != 0) {
                pre.next = new ListNode(a);
            }
        }
        sum(l1, a, pre);
        sum(l2, a, pre);
        return root.next;
    }

    private void sum(ListNode l1, int a, ListNode pre) {
        while (l1 != null) {
            int sum = l1.val + a;
            ListNode curr = new ListNode(sum % 10);
            a = sum / 10;
            l1 = l1.next;
            pre.next = curr;
            pre = curr;
        }
    }
}
