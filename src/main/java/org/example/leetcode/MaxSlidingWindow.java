package org.example.leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/6/29
 **/
public class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // 建立最大堆
        Queue<Integer> max = new PriorityQueue<Integer>((a1, a2) -> a2 - a1);
        int n = nums.length;
        if (n == 0) {
            return nums;
        }
        int[] result = new int[n - k + 1];
        int index = 0;
        for (int i = 0; i < n; i++) {
            //移除第一个元素
            if (max.size() >= k) {
                max.remove(nums[i - k]);
            }
            max.offer(nums[i]);
            //更新 result
            if (i >= k - 1) {
                result[index++] = max.peek();
            }
        }
        return result;
    }
}
