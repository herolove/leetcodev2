package org.example.leetcode;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/6/28
 **/
public class MinSubArrayLen {
    public int minSubArrayLen(int s, int[] nums) {
        int len = 0;
        if (nums == null || (len = nums.length) == 0) {
            return 0;
        }
        int res = len + 1;
        int start = 0, end = 0;
        int sum = 0;
        while (end < len) {
            sum += nums[end];
            while (sum >= s) {
                res = Math.min(res, end - start + 1);
                sum = sum - nums[start];
                start++;
            }
            end++;
        }
        return res == len + 1 ? 0 : res;
    }
}
