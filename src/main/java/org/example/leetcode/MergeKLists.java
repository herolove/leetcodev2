package org.example.leetcode;

import java.util.PriorityQueue;

/**
 * @Description 23. 合并K个排序链表
 * @Author zhangtao02
 * @Date 2020/7/29
 **/
public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        int len = 0;
        if (lists == null || (len = lists.length) == 0) {
            return null;
        }
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>((a1, a2) -> a1.val - a2.val);
        ListNode res = new ListNode(-1);
        for (int index = 0; index < len; index++) {
            if (lists[index] != null) {
                priorityQueue.offer(lists[index]);
            }
        }

        ListNode p = res;
        while (!priorityQueue.isEmpty()) {
            ListNode node = priorityQueue.poll();
            p.next = node;
            p = node;
            if (node.next != null) {
                priorityQueue.offer(node.next);
            }
        }

        return res.next;
    }
}
