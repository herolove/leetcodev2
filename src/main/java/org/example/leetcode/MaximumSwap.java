package org.example.leetcode;

/**
 * @Description 670. 最大交换
 * @Author zhangtao02
 * @Date 2020/7/23
 **/
public class MaximumSwap {
    class Solution {
        public int maximumSwap(int num) {
            if (num < 10) return num;
            char[] charArr = String.valueOf(num).toCharArray();
            int[] maxArr = new int[charArr.length];
            int max = charArr.length - 1;//记录当前最大值的索引
            for (int i = charArr.length - 1; i >= 0; i--) {
                if (charArr[i] > charArr[max]) {   //如果当前值比最大值大，那么我们更新最大值，并更新max，并将arr索引设为-1,表示这个数右边没有比他大的值
                    max = i;
                    maxArr[i] = -1;
                } else {
                    maxArr[i] = max;    //否则就将最大值的索引赋值给当前值
                }
            }
            for (int i = 0; i < maxArr.length; i++) {
                if (maxArr[i] != -1 && charArr[i] != charArr[maxArr[i]]) {//上述算法中，可能会出现某个最大值在索引中又出现了，这时该处索引不为-1，需要排除这一情况，比如98368
                    swap(charArr, i, maxArr[i]);
                    break;
                }
            }
            return Integer.parseInt(new String(charArr));
        }
        private void swap (char[]charArr,int i,int j){
            char temp = charArr[i];
            charArr[i] = charArr[j];
            charArr[j] = temp;
        }
    }

    public int maximumSwap(int num) {
        char[] c = String.valueOf(num).toCharArray();
        int max = Integer.MIN_VALUE;
        int max_index = 0;
        int [] arr = new int[c.length];
        arr[c.length - 1] = c.length - 1;

        for (int i = c.length - 1; i >= 0; i --) {
            if (c[i] - '0' > max) {
                max = c[i] - '0';
                max_index = i;
            }
            arr[i] = max_index;
        }

        for (int i = 0; i < c.length; i ++) {
            if (arr[i] != i && c[arr[i]] != c[i]) {
                char tmp = c[i];
                c[i] = c[arr[i]];
                c[arr[i]] = tmp;
                break;
            }
        }
        return Integer.parseInt(new String(c));
    }

    public static void main(String[] args) {
        MaximumSwap maximumSwap = new MaximumSwap();
        System.out.println(maximumSwap.maximumSwap(9979));
        System.out.println(maximumSwap.maximumSwap(2637));
    }
}
