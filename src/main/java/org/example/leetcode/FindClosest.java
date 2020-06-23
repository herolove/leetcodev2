package org.example.leetcode;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/6/17
 **/
public class FindClosest {
    public int findClosest(String[] words, String word1, String word2) {
        int len = 0;
        if (words == null || (len = words.length) == 0) {
            return -1;
        }
        int min = -1;
        int word1Index = -1;
        int word2Index = -1;

        for (int index = 0; index < len; index++) {
            if (words[index].equals(word1)) {
                word1Index = index;
            }

            if (words[index].equals(word2)) {
                word2Index = index;
            }

            if (word1Index == -1 || word2Index == -1) {
                continue;
            }

            int temp = Math.abs(word2Index - word1Index);
            if( temp<min || min == -1){
                min = temp;
            }
        }
        return min;
    }
}
