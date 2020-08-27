package org.example.leetcode;

/**
 * @Description 674. 最长连续递增序列
 * @Author zhangtao02
 * @Date 2020/8/27
 **/
public class FindLengthOfLCIS {
    public int findLengthOfLCIS(int[] nums) {
        int len = 0;
        if (nums == null || (len = nums.length) == 0) {
            return 0;
        }
        int res = 1;
        int p = 0;

        int q = p + 1;
        int temp = 1;

        while (q < len) {
            if (nums[q] <= nums[p]) {
                p = q;
                q = q + 1;
                temp = 1;
            } else {
                p++;
                q++;
                temp++;
            }
            res = Math.max(res, temp);
        }
        return res;
    }
}
