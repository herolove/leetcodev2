package org.example.leetcode;

/**
 * @Description 328. 奇偶链表
 * @Author zhangtao02
 * @Date 2020/8/13
 **/
public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return null;
        }
        /**
         * 奇数头指针
         */
        ListNode oddHead = head;

        /**
         * 偶数头指针
         */
        ListNode evenHead = head.next;
        ListNode even = evenHead;

        while (even != null || even.next != null) {
            oddHead.next = even.next ;
            oddHead = oddHead.next;

            even.next = oddHead.next;
            even = even.next;
        }
        oddHead.next = evenHead;
        return head;
    }
}
