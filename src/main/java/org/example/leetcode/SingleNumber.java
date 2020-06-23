package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/6/23
 **/
public class SingleNumber {
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int res = 0;
        Map<Integer, Integer> map = new HashMap();
        for (int index = 0; index < nums.length; index++) {
            map.put(nums[index], map.getOrDefault(nums[index], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return res;
    }
}
