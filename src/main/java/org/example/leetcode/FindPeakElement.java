package org.example.leetcode;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/7/27
 **/
public class FindPeakElement {
    public int findPeakElement(int[] nums) {

        int len = 0;
        if (nums == null || (len = nums.length) == 0) {
            return 0;
        }

        if (len < 3) {
            return 0;
        }

        int low = 0;
        int center = 1;

        int hight = 2;
        while (hight < len) {
            if (nums[center] > nums[low] && nums[center] > nums[hight]) {
                break;
            }
            low++;
            center++;
            hight++;
        }

        return center;
    }
}
