package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/6/16
 **/
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int head = 0;
        int max = 0;
        Map<Character, Integer> dict = new HashMap<>();
        char[] chars = s.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len; i++) {
            if (dict.containsKey(chars[i])) {
                head = chars[i];
            }
            dict.put(chars[i], i+1);
            max = Math.max(max, i - head+1);
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        LengthOfLongestSubstring t = new LengthOfLongestSubstring();
        t.lengthOfLongestSubstring(str);
    }
}
