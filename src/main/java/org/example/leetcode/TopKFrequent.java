package org.example.leetcode;

import java.util.*;

/**
 * @Description top k frequent number
 * @Author zhangtao02
 * @Date 2020/9/7
 **/
public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        int len = 0;
        if (nums == null || (len = nums.length) == 0 || k <= 0) {
            return null;
        }

        int[] res = new int[k];
        Map<Integer, Integer> direct = new HashMap<>();
        for (int num : nums) {
            direct.put(num, direct.getOrDefault(num, 0) + 1);
        }

        Queue<Integer> priority = new PriorityQueue<>();
        return res;
    }
}
