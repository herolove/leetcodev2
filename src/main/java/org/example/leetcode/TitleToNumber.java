package org.example.leetcode;

/**
 * @Description A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * @Author zhangtao02
 * @Date 2020/6/28
 **/
public class TitleToNumber {
    public int titleToNumber(String s) {
        int len = 0;
        if (s == null || (len = s.length()) == 0) {
            return 0;
        }
        int res = 0;
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            int sum = ch - 'A' + 1;
            res = res * 26 + sum;
        }
        return res;
    }

    public int titleToNumberV2(String s) {
        int len = 0;
        if (s == null || (len = s.length()) == 0) {
            return 0;
        }
        int res = 0;
        char[] chars = s.toCharArray();
        int mul = 1;
        for (int index = len - 1; index >= 0; index--) {
            int sum = chars[index] - 'A' + 1;
            res += sum * mul;
            mul = mul * 26;
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "AA";
        TitleToNumber titleToNumber = new TitleToNumber();
        System.out.println(titleToNumber.titleToNumber(str));
        System.out.println(titleToNumber.titleToNumberV2(str));
    }
}
