package org.example.leetcode;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/6/15
 **/
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int a = nums[0];
        int sum = a;
        for (int i = 1; i < len; i++) {
            if (a < 0) {
                a = Math.max(a , nums[i]);
            } else {
                a = a + nums[i];
            }
            if (a > sum) {
                sum = a;
            }
        }
        return sum;
    }
}
