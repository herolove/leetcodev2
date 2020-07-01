package org.example.leetcode;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/6/30
 **/
public class Shuffle {
    public int[] shuffle(int[] nums, int n) {
        int len = 0;
        if (nums == null || (len = nums.length) == 0 || n < 0) {
            return nums;
        }
        int[] result = new int[nums.length];
        int index = 0;
        int low = 0;
        int high = n;
        while (high < len) {
            result[index++] = nums[low++];
            result[index++] = nums[high++];
        }
        return result;
    }
}
