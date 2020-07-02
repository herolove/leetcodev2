package org.example.leetcode;

import java.util.PriorityQueue;

/**
 * @Description 703. 数据流中的第K大元素
 * @Author zhangtao02
 * @Date 2020/7/2
 **/
public class KthLargest {
    private PriorityQueue<Integer> queue = new PriorityQueue<>();
    private int k = 0;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        int len = nums.length;
        for (int item : nums) {
            add(item);
        }
    }

    public int add(int val) {
        if (queue.size() < k) {
            queue.offer(val);
        } else {
            if (val > queue.peek()) {
                queue.poll();
                queue.offer(val);
            }
        }
        return queue.peek();
    }
}
