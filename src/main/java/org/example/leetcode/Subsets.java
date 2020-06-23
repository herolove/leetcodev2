package org.example.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/6/16
 **/
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        Queue<List<Integer>> queue = new LinkedList<>();
        List<List<Integer>> res ;
        queue.offer(new ArrayList<>());
        for(int i = 0; i < nums.length; ++i){
            int len = queue.size();
            for(int j = 0; j < len; ++j){
                List<Integer> list = queue.poll();
                queue.offer(new ArrayList<>(list));
                list.add(nums[i]);
                queue.offer(list);
            }
        }
        return res = new ArrayList<>(queue);
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3};
        Subsets subsets = new Subsets();
        subsets.subsets(a);
    }
}
