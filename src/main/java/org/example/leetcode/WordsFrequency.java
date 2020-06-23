package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/6/16
 **/
public class WordsFrequency {
    Map<String,Integer> books = new HashMap<>();
    public WordsFrequency(String[] book) {
        for(String item : book){
            books.put(item , books.getOrDefault(item,0)+1);
        }
    }

    public int get(String word) {
        return books.getOrDefault(word,0);
    }
}
