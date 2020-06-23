package org.example.leetcode;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Stack;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/6/15
 **/
public class CheckPermutation {
    public boolean CheckPermutation(String s1, String s2) {
        int len1 = 0 ;
        int len2 = 0 ;
        if(s1 == null || (len1 = s1.length())==0){
            return Boolean.FALSE;
        }

        if(s2 == null || (len2 = s2.length())==0){
            return Boolean.FALSE;
        }
        if(len1 != len2){
            return Boolean.FALSE;
        }
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        int [] index = new int[len1+len2];
        for(int i =0 ;i<len1;i++){
            index[chars1[i]]++;
            index[chars2[i]]--;
        }
        for(int i =0 ;i<len1+len2;i++){
            if(index[i]!=0){
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE ;
    }
}
