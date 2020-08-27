package org.example.leetcode;

import java.*;
import java.util.Arrays;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/8/27
 **/
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int len = 0;
        if (nums == null || (len = nums.length) == 0) {
            return target;
        }

        if (len < 3) {
            return target;
        }

        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];

        for (int index = 0; index < len; index++) {
            int start = index + 1;
            int end = len - 1;

            while (start < end) {
                int sum = nums[start] + nums[end] + nums[index];
                if (sum == target) {
                    return target;
                }

                if (Math.abs(sum - target) < Math.abs(res - target)) {
                    res = sum;
                }

                if (sum > target) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return res;
    }
}
