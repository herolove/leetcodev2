package org.example.leetcode;

/**
 * @Description 剑指 Offer 52. 两个链表的第一个公共节点
 * @Author zhangtao02
 * @Date 2020/7/29
 **/
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int lenA = nodeLen(headA);
        int lenB = nodeLen(headB);
        ListNode p = headA;
        ListNode q = headB;
        if (lenA > lenB) {
            p = jumpNode(lenA, lenB, headA);
        } else {
            q = jumpNode(lenB, lenA, headB);
        }
        while (p != q) {
            p = p.next;
            q = q.next;
        }
        return p;
    }

    private ListNode jumpNode(int lenA, int lenB, ListNode head) {
        ListNode p = head;
        for (int index = 0; index < (lenA - lenB); index++) {
            p = p.next;
        }
        return p;
    }

    private int nodeLen(ListNode head) {
        int cnt = 0;
        ListNode p = head;
        while (p != null) {
            p = p.next;
            cnt++;
        }
        return cnt;
    }
}
