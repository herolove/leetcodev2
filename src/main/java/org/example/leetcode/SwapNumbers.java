package org.example.leetcode;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/6/16
 **/
public class SwapNumbers {
    public int[] swapNumbers(int[] numbers) {
        if (numbers == null) {
            return null;
        }
        if (numbers.length != 2) {
            return numbers;
        }
        numbers[0] = numbers[0] + numbers[1];
        numbers[1] = numbers[0] - numbers[1];
        numbers[0] = numbers[0] - numbers[1];
        return numbers;
    }
}
