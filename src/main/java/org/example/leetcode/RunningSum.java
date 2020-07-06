package org.example.leetcode;

/**
 * @Description 1480. 一维数组的动态和
 * @Author zhangtao02
 * @Date 2020/7/6
 **/
public class RunningSum {
    public int[] runningSum(int[] nums) {
        int len = 0;
        if (nums == null || (len = nums.length) == 0) {
            return new int[0];
        }
        for (int index = 1; index < len; index++) {
            nums[index] = nums[index] + nums[index - 1];
        }
        return nums;
    }
}
