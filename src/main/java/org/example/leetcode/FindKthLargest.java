package org.example.leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/6/29
 **/
public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        // 默认小顶堆
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(k);
        for (int num : nums) {
            if (heap.size() < k){
                heap.offer(num);
            } else {
                if (num > heap.peek()){
                    heap.poll();
                    heap.offer(num);
                }
            }
        }
        return heap.peek();
    }
}
