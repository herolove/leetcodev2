package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/6/30
 **/
public class CanPermutePalindrome {
    public boolean canPermutePalindrome(String s) {
        int len = 0;
        if (s == null || (len = s.length()) == 0) {
            return false;
        }
        char[] chars = s.toCharArray();
        Map<Character, Integer> dict = new HashMap();
        for (int index = 0; index < chars.length; index++) {
            dict.put(chars[index], dict.getOrDefault(chars[index], 0) + 1);
        }
        int flag = 0;
        for (Map.Entry<Character, Integer> entry : dict.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                flag++;
            }
        }
        if (flag == 1) {
            return true;
        }
        return false;
    }
}
