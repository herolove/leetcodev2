package org.example.leetcode;

/**
 * @Description https://leetcode-cn.com/leetbook/read/array-and-string/yf47s/
 *
 * 724. 寻找数组的中心索引
 * @Author zhangtao02
 * @Date 2020/8/25
 **/
public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,7,3,6,5,6};
        PivotIndex pivotIndex = new PivotIndex();
        pivotIndex.pivotIndex(a);
    }
}
