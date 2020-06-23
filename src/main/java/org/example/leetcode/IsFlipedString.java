package org.example.leetcode;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/6/15
 **/
public class IsFlipedString {
    public boolean isFlipedString(String s1, String s2) {
        if(s1 == null|| s2 == null){
            return Boolean.FALSE;
        }
        s1 = s1+s1;
        return s1.contains(s2);
    }
}
