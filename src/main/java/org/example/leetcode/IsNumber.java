package org.example.leetcode;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/6/28
 **/
public class IsNumber {
    public boolean isNumber(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        boolean number = false;
        boolean dot = false;
        boolean e = false;
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            if (ch >= '0' && ch <= '9') {
                number = true;
            } else if (ch == '.') {
                if (!number) {
                    return false;
                }
                e = true;
            } else if (ch == 'e' || ch == 'E') {
                if(!number || !dot){

                }
                e = true ;
            }
        }
        return true;
    }
}
