package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 * ...
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/excel-sheet-column-title
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author zhangtao02
 * @Date 2020/6/28
 **/
public class ConvertToTitle {
    public String convertToTitle(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        while (n != 0) {
            n--;//这里稍作处理，因为它是从1开始
            stringBuilder.append((char) (n % 26 + 'A'));
            n /= 26;
        }
        return stringBuilder.reverse().toString();
    }
}
