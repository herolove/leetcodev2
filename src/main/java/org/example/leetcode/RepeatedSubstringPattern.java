package org.example.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description 459. 重复的子字符串
 * @Author zhangtao02
 * @Date 2020/8/24
 **/
public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        if (s == null) {
            return false;
        }

        char[] chars = s.toCharArray();
        if (chars.length == 0) {
            return false;
        }

        Set<Character> set = new HashSet<>();
        StringBuilder str = new StringBuilder();
//        for(Character ch : chars){
//            if(set.co){
//
//            }
//        }
        return false;
    }
}
