package org.example.leetcode;

/**
 * @Description 1486. 数组异或操作
 * @Author zhangtao02
 * @Date 2020/7/6
 **/
public class XorOperation {
    public int xorOperation(int n, int start) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            int value = start + 2 * i;
            res = res ^ value;
        }
        return res;
    }
}
