package org.example.leetcode;

/**
 * @Description https://leetcode-cn.com/problems/longest-common-prefix/solution/zui-chang-gong-gong-qian-zhui-by-leetcode-solution/
 * @Author zhangtao02
 * @Date 2020/6/15
 **/
public class LongestCommonPrefix {
    public  String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if(strs ==null || strs.length <=1){
            return prefix;
        }
        prefix = strs[0];
        int len = strs.length ;
        for(int i = 1 ;i < len ;i ++){
            prefix = longestCommonPrefix(prefix , strs[i]);
            if(prefix==null||prefix.length()==0){
                return "";
            }
        }
        return prefix;
    }

    public  String longestCommonPrefix(String str1, String str2) {
        int length = Math.min(str1.length(), str2.length());
        int index = 0;
        while (index < length && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }
        return str1.substring(0, index);
    }
}