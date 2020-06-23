package org.example.leetcode;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/6/23
 **/
public class AddBinary {
    public String addBinary(String a, String b) {
        if (a == null) {
            return b;
        }

        if (b == null) {
            return a;
        }

        StringBuilder res = new StringBuilder();
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();

        int lenA = charsA.length - 1;
        int lenB = charsB.length - 1;

        int diff = 0;
        while (true) {
            int aInt = Integer.parseInt(lenA < 0 ? "0" : String.valueOf(charsA[lenA--]));
            int bInt = Integer.parseInt(lenB < 0 ? "0" : String.valueOf(charsB[lenB--]));
            int sum = aInt + bInt + diff;
            res.append(sum % 2);
            diff = sum / 2;
            if (lenA < 0 && lenB < 0) {
                if (diff != 0) {
                    res.append(diff);
                }
                break;
            }
        }
        return res.reverse().toString();
    }
}
