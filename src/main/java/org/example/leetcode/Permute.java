package org.example.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description 46. 全排列
 * @Author zhangtao02
 * @Date 2020/8/27
 **/
public class Permute {
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curList = new ArrayList<>(nums.length);

        func(nums, 0, curList, res);
        return res;
    }

    private void func(int[] nums, int cur, List<Integer> curList, List<List<Integer>> res) {
        if (cur >= nums.length) {
            res.add(curList);
            return;
        }

        for (int index = cur; index < nums.length; index++) {
            List<Integer> nextList = new ArrayList<Integer>(curList);
            nextList.add(nums[index]);
            swap(index, cur, nums);
            func(nums, cur + 1, nextList, res);
            swap(index, cur, nums);
        }
    }

    private void swap(int index, int cur, int[] nums) {
        int temp = nums[index];
        nums[index] = nums[cur];
        nums[cur] = temp;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3};
        Permute permute = new Permute();
        permute.permute(a);
    }
}
