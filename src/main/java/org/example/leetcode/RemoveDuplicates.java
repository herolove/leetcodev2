package org.example.leetcode;

/**
 * @Description 26. 删除排序数组中的重复项
 * @Author zhangtao02
 * @Date 2020/8/28
 **/
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int len = 0;
        if (nums == null || (len = nums.length) < 2) {
            return len;
        }
        int p = 0;
        int q = p + 1;

        while (q < len) {
            if (nums[p] != nums[q]) {
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return nums[p] == nums[q - 1] ? p : p + 1;
    }
}
