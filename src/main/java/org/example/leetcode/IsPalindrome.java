package org.example.leetcode;

import java.util.List;
import java.util.Stack;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/6/30
 **/
public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode p = head;
        while (p != null) {
            stack.push(p);
            p = p.next;
        }
        while (head != null && !stack.isEmpty()) {
            if (head.val != stack.pop().val) {
                return false;
            }
            head = head.next;
        }
        if (head != null && !stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
