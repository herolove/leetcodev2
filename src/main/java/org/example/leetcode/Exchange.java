package org.example.leetcode;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/11/4
 **/
public class Exchange {
    public static int[] exchange(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return nums;
        }

        /*
        由于 “所有奇数 位于 数组的前半部分”
            遍历整个nums数组：
                1、当前数字为偶数，不做处理；
                2、当前数字为奇数：将奇数排列在 “当前未排序列” 的 第一个
         */
        int curIndex = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if ((nums[i] & 1) == 1) {   // 当前数字为 奇数
                /*
                    交换 当前遍历到的数字 和 当前未排序列的第一个元素
                 */
                int temp = nums[i];
                nums[i] = nums[curIndex];
                nums[curIndex++] = temp;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int[] b = exchange(a);
        for(int t : b){
            System.out.print(t+",");
        }
    }
}