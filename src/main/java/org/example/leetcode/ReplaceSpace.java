package org.example.leetcode;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/6/15
 **/
public class ReplaceSpace {
    public String replaceSpace(String s) {
        int len = 0;
        if (s == null || (len = s.length()) == 0) {
            return s;
        }
        char[] chars = s.toCharArray();
        StringBuilder replaceStr = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (chars[i] == ' ') {
                replaceStr.append("%20");
            } else {
                replaceStr.append(chars[i]);
            }
        }
        return replaceStr.toString();
    }

    public static void main(String[] args) {
        ReplaceSpace replaceSpace = new ReplaceSpace();
        String str = "We are happy.";
        System.out.println(replaceSpace.replaceSpace(str));
    }
}
