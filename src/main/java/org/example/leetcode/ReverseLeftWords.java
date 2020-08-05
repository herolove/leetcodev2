package org.example.leetcode;

/**
 * @Description 剑指 Offer 58 - II. 左旋转字符串
 * @Author zhangtao02
 * @Date 2020/7/6
 **/
public class ReverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = n; i < s.length(); i++)
            res.append(s.charAt(i));
        for (int i = 0; i < n; i++)
            res.append(s.charAt(i));
        return res.toString();
    }
}
