package org.example.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/6/17
 **/
public class Permutation {
    public String[] permutation(String s) {
        Set<String> set = new HashSet<>();
        func(s, set , 0);
        String[] strings = new String[set.size()];
        int index = 0 ;
        for(String item : set){
            strings[index++] = item ;
        }
        return strings;
    }

    private void func(String s, Set<String> set, int index) {
        if(index >= s.length()){
            return ;
        }
        char[] chars = s.toCharArray();
        for(int i = index ; i< s.length() ;i++){
            char temp = chars[index];
            chars[index] = chars[i];
            chars[i] = temp ;
            set.add(new String(chars));
            func(new String(chars) , set ,index+1);
        }

    }

    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        String S = "Frx";
        for(String item : permutation.permutation(S)){
            System.out.println(item);
        }
    }
}
