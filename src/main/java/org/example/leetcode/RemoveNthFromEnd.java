package org.example.leetcode;

/**
 * @Description 19. 删除链表的倒数第N个节点
 * @Author zhangtao02
 * @Date 2020/8/28
 **/
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n <= 0) {
            return head;
        }

        int len = 0;
        ListNode p = head;
        while (p != null) {
            len++;
            p = p.next;
        }

        if (n > len) {
            return head;
        }

        int removeIndex = len - n;
        ListNode curNode = head;
        ListNode preNode = null;

        while (curNode != null) {
            if (removeIndex == 0) {
                /**
                 * 删除头
                 */
                if (preNode == null) {
                    head = curNode.next;
                } else {
                    preNode.next = curNode.next;
                }
                break;
            }
            preNode = curNode;
            curNode = curNode.next;
            removeIndex--;
        }
        return head;
    }
}
